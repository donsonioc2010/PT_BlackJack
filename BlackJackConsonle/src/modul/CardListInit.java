package modul;

import ChipDao.GameDao;

public class CardListInit {
	public CardListInit() {
	}

	//해당 메소드는 게임이 처음시작할때 초기화하는 메소드 이다
	public void CardInit() {
		GameDao dao = GameDao.getInstance();
		for(int i = 0; i<dao.cardswit.length;i++) {
			dao.cardswit[i] = false;
		}
	}
	
	//해당 메소드는 남은 카드의 갯수를 세는 메소드 이다
	public void CountCard() {
		GameDao dao = GameDao.getInstance();
		int CardCount = 0;
		for(int i  =0 ; i<dao.cardswit.length;i++) {
			if(!dao.cardswit[i]) { //swit의 값이 false인경우 사용이된다 
				CardCount ++;
			}
		}
		if(CardCount<= 10) { //남은 카드가 10장이하인 경우에 CardInit 을 실행한다
			CardInit();
		}
		
	}
	
}
