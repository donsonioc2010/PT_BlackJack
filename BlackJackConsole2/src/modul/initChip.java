package modul;

import dao.Chip_Deck_Singleton;

public class initChip {
	//게임을 처음시작하거나 재시작을 하게 될시에 칩을 50개로 초기화를 시켜준다
	//두명의 플레이어의 칩을 전부다 초기화한다
	public initChip() {
		Chip_Deck_Singleton sg = Chip_Deck_Singleton.getInstance();
		String str[] = {"player","dealer"};
		for(int i = 0; i<str.length;i++) {
			int haveChip = 50;
			sg.infoMap.get(str[i]).setHaveChipNum(haveChip);
		}
	}
}
