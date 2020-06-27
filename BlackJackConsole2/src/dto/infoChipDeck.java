package dto;

import java.util.ArrayList;


//플레이어 혹은 딜러의 칩의 갯수와 카드리스트의 객체를 담는 장소
public class infoChipDeck {
	//남은 칩 리스트
	private int haveChipNum;
	
	//가지고 있는 카드리의 리스트
	private ArrayList<Integer> haveDeckList;
	
	//초기화
	public infoChipDeck() {
		haveDeckList = new ArrayList<Integer>();
	}
	
	//칩의 setter & getter
	public int getHaveChipNum() {
		return haveChipNum;
	}
	public void setHaveChipNum(int haveChipNum) {
		this.haveChipNum = haveChipNum;
	}
	
	//현재 소지하고있는 카드리스트를 전부 없앤다. 한판이 끝나고서 사용할 메소드
	public void initHaveDeck() {
		haveDeckList.clear();
	}
	
	//카드리스트를 추가할 메소드
	public void addHaveDeck(int getCard) {
		haveDeckList.add(getCard);
	}

	
	public ArrayList<Integer> getHaveDeckList() {
		return haveDeckList;
	}
	
}
