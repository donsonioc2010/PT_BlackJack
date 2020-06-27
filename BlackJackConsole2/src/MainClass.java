import dao.Chip_Deck_Singleton;
import dto.infoChipDeck;
import modul.initChip;
import modul.setInfoHashMap;

public class MainClass {

	public static void main(String[] args) {
		/*
		 	인포를 담는것은 해쉬맵으로 진행한다.
		 	Key = player / dealer
		 	values는 각각의 객체를 담는다.
		 */
		Chip_Deck_Singleton sg = Chip_Deck_Singleton.getInstance();
		new setInfoHashMap();
		
	}

}
