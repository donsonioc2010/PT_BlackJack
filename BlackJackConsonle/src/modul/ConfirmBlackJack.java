package modul;

import ChipDao.GameDao;

public class ConfirmBlackJack {
	public ConfirmBlackJack() {
		// TODO Auto-generated constructor stub
	}
	/*StartConfirmBlackJack 메소드의 역할  
	 처음 게임이 시작하고 셔플을 할때 플레이어와 컴퓨터의 2장의 카드가 블랙잭인지 확인
	하는 모듈이다*/
	public void startConfirmBlackJack() {
		GameDao dao = GameDao.getInstance();
		int PlayerScoreSum = 0;
		int ComputerScoreSum = 0;
		//덱은 PlayerDeck,ComputerDeck으로 선언이 되어있다
		for(int i = 0; i< 2; i++) {
			//플레이어의 카드 가져오기
			int pcard = dao.PlayerDeck.get(i);
			if(pcard%13 == 0) {// 나머지가 0 이라는 말은 a 를 의미한다
				if(PlayerScoreSum<=10) { //10이하 임으로 a가 11이 들어가도 된다 
					//a가 두장들어왔을 경우를 상정
					PlayerScoreSum = PlayerScoreSum + 11;
				}else {	
					PlayerScoreSum = PlayerScoreSum + 1;
				}
			}else {				// A가아닌 나머지들이 들어오는 장소
				PlayerScoreSum= PlayerScoreSum+pcard;
			}
		}
		
		for(int i = 0 ; i<2; i++) {
			//딜러(컴퓨터의) 카드를 가져오기
			int ccard = dao.ComputerDeck.get(i);
			if(ccard%13 == 0) { //a를 의미
				if(ComputerScoreSum<= 10) {
					ComputerScoreSum = ComputerScoreSum +11;
				}else {
					ComputerScoreSum = ComputerScoreSum +1;
				}
			}else {
				ComputerScoreSum = ComputerScoreSum+ccard;
			}
			
		}
		if(PlayerScoreSum ==21 || ComputerScoreSum ==21) {
			//블랙잭임으로 게임이 끝나게 설정
		}
		
	}
}
