package main;

import ChipDao.GameDao;
import runGame.GameStart;

public class MainClass {

	public static void main(String[] args) {
		//dao 의 인스턴스값 놓기
		GameDao dao = GameDao.getInstance();
		/*
		//mainkey 는 dao의 인스턴스가 실행되면서 true로 바로 잡힘
		while(dao.mainkey) {
			new GameStart();
		}
		*/
		while(true) {
			System.out.println("내 옆구리는 언제나 시리네~");
		}
	}

}
