package modul;

import dao.Chip_Deck_Singleton;
import dto.infoChipDeck;

public class setInfoHashMap {
	//실행시 해시맵을만들어줌
	public setInfoHashMap() {		
		Chip_Deck_Singleton sg = Chip_Deck_Singleton.getInstance();
		infoChipDeck player = new infoChipDeck();
		infoChipDeck dealer = new infoChipDeck();
		sg.infoMap.put("player", player);
		sg.infoMap.put("dealer",dealer);
	}
}
