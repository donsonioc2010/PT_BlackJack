package ChipDao;

import java.util.ArrayList;
import java.util.List;

import modul.CardListInit;

public class GameDao {
	private static GameDao st= null;
	//GetInstance
	
	//게임이 끝날때마다 남은 카드의 갯수를 확인하고 10장 이하가 되면 카드를 다시 리셋해주는 모듈 만들기
	public boolean cardswit[] = new boolean[52];
	
	//플레이어와 컴퓨터가 소지한 카드리스트를 알려줌
	public List<Integer> PlayerDeck,ComputerDeck;

	public boolean mainkey=true; //플레이어가 게임을 종료를 원할때 변경된다
	public int PlayChip, ComChip;
	

	//메인시작과 동시에 카드 배열선언 및 칩셋 초기화  카드 전부초기화
	//플레이어와 컴퓨터의 카드를 담을 공간도 같이 만들어준다
	private GameDao() { 
		gameRestart(); //칩의 갯수 초기화
		for(int i = 0; i<cardswit.length;i++) {
			cardswit[i] = false;
		}
		PlayerDeck = new ArrayList<Integer>();
		ComputerDeck = new ArrayList<Integer>();
	}
	
	//게임시작 혹은 칩이 전부 없어져서 끝났을때 다시시작을 원하면 칩을 50개로 셋팅함
	public void gameRestart() {
		this.PlayChip  = 50;
		this.ComChip = 50;
	}
	
	//사용자가 게임의 종료를 원하면 false로 바꿔서 메인의 while문을  끝내는역할을함
	public void setMainKey() {
		this.mainkey = false;
	}
	
	//프로그램 시작및 카드를 전부 사용하였을때 카드를 초기화 해주는 멧쏘드

	
	//인스턴스갯잇
	public static GameDao getInstance() {
		if(st ==null) {
			st = new GameDao();
		}
		return st;
	}
	
}
