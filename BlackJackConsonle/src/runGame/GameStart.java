package runGame;

import ChipDao.GameDao;
import modul.CardListOpen;
import modul.CardShuffleClass;
import modul.ConfirmBlackJack;

//메인이 실행되면 dao를 실행시켜 초기화를 해주고 이곳으로 와서 게임을 시작하게됨
public class GameStart {
	boolean gameRunKey;
	
	public GameStart() {
		GameDao dao = GameDao.getInstance();
		gameRunKey = true;
		while(gameRunKey) {
			//플레이어가 베팅한 칩의값 넘겨받기  배팅값보다 많으면 남은칩 전부로 셋팅이됨
			int PlayerBatChip = new BattingClass().PlayerBat();
			//배팅한 칩의 갯수만큼 빼줌
			dao.PlayChip = dao.PlayChip - PlayerBatChip;
			System.out.println("나의 남은 칩의 갯수 : " + dao.PlayChip);
			
			//베팅이후에 카드를 셔플하게됨
			System.out.println("카드를 셔플합니다");
			new CardShuffleClass().startShuffle();
			
			new ConfirmBlackJack().startConfirmBlackJack();
			new CardListOpen().ListOpenPlayerCard();
			new CardListOpen().ListOpenComputerCard(); 
			
			
			
			
		}
		
	}
}
