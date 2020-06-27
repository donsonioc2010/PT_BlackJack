package dao;
import java.util.HashMap;
import java.util.Map;

import dto.infoChipDeck;

public class Chip_Deck_Singleton {
	//플레이어의 칩과 덱의 객체를 담을 패턴이다.
	public static Chip_Deck_Singleton sg = null;
	
	//hashMap 딜러와 플레이어의 InfoChipDeck객체를 담을 장소 Key값은 player 와 dealer가 될 예정
	public Map<String,infoChipDeck> infoMap;
	
	//해쉬맵 생성
	private Chip_Deck_Singleton() {
		infoMap = new HashMap<String, infoChipDeck>();
	}
	
	//getInstance
	public static Chip_Deck_Singleton getInstance() {
		if(sg == null) {
			sg = new Chip_Deck_Singleton();
		}
		return sg;
	}
	
}
