package modul;

import java.util.Random;

import ChipDao.GameDao;

//카드를 셔플하는 모듈이단
public class CardShuffleClass {
	public CardShuffleClass() {
		// TODO Auto-generated constructor stub
	}
	
	//처음에 2장을 주는 메소드 (플레이어/컴퓨터)
	public void startShuffle() {
		/*
		 * 소유카드의 경우 GameDao의 
		 * PlayerDeck 과 ComputerDeck의 List가 짜여져있다
		 */
		
		//딜러 플레이어 카드 셔플 
		shuffle(1);
		shuffle(2);
	}
	private void shuffle(int Select) {
		GameDao dao = GameDao.getInstance();
		while(true) {
			int i = 0; //2장뽑는지 확인하기
			int randomNum  = new getCardNum().ReturnGetCardNum();//0~52 
			//카드 번호 받기
			//0~12 스페이드 13~25하트 26~38 클로버 39~51 다이아
			if(i==2)
				break; //2장 다뽑았는지 확인후 종료
			
			if(!dao.cardswit[randomNum]) { 
				//안뽑히면 false 뽑혔었으면 True
				
				//한번도 카드가 안뽑혀서 false인 경우
				dao.cardswit[randomNum] = true;
				
				if(Select==1) {//딜러를 셔플할때는 1번이 들어온다
					dao.ComputerDeck.add(randomNum);
					i++;
				}else { //1번이외의 값은 플레이어의 덱이 셔플된다
					dao.PlayerDeck.add(randomNum);
					i++;
				}
			}
			
		}
	}
	
	//카드를 한장씩 추가하는 모듈을 만들어야한다
	
}
