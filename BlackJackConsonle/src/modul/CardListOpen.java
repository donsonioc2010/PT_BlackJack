package modul;

import ChipDao.GameDao;

public class CardListOpen {
	public CardListOpen() { 
		
	}
	//플레이어덱을 오픈하는 메소드
	public void ListOpenPlayerCard() {
		GameDao dao = GameDao.getInstance();
		for(int i = 0; i < dao.PlayerDeck.size();i++) {
			String Mark = getCardMark(dao.PlayerDeck.get(i));
			System.out.print(Mark+" ");
		}
	}
	
	//딜러(컴퓨터) 덱을 오픈하는 메소드
	public void ListOpenComputerCard() {
		GameDao dao = GameDao.getInstance();
		String Mark = getCardMark(dao.ComputerDeck.get(0));
		System.out.println(Mark+" ");
	}
	//카드의 마크번호를 얻어온다
	public String getCardMark(int DeckNumber) {
		//0~12 스페이드 13~25하트 26~38 클로버 39~51 다이아
		int i = DeckNumber / 13;
		String Mark = null;
		switch (i) {
			case 0:		//0~12
				Mark = "S";
				break;
			case 1:		//13~25
				Mark = "H";
				break;
			case 2:		//26~38
				Mark = "C";
				break;
			case 3:		//39~51
				Mark = "D";
				break;
		}
		return getCardNumber(DeckNumber,Mark);
	}
	//카드번호나 JQK을 붙여주는 작업을 한다  나머지가 10/11/12는 JQK을 붙여준다
	public String getCardNumber(int DeckNumber,String Mark) {
		int i = DeckNumber%13;
		if(i<10&&i>0) {
			i=i+1;
			Mark = Mark + "_i";
		}else if(i==0) { 	 //A
			Mark = Mark +"_A";
		}else if(i==10) {//J
			Mark = Mark + "_J";
		}else if(i==11) {//Q
			Mark = Mark + "_Q";
		}else if(i==12) {//K
			Mark = Mark + "_K";
		}
		return Mark;
	}
	
}
