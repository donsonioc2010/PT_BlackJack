package runGame;

import java.util.Scanner;

import ChipDao.GameDao;
import modul.SearchChar;

//베팅은 카드를 배부받기전에 이뤄진다
public class BattingClass {
	public BattingClass() {}
	public int PlayerBat() {
		GameDao dao = GameDao.getInstance();
		
		int i = 2;
		String inputNum;
		
		System.out.println("칩의 베팅갯수를 바꾸겠습니까?(기본2개 최대 10개)" );
		while(true) {
			//베팅할 칩의 갯수 입력받기
			System.out.print("숫자 입력 : ");
			inputNum  = new Scanner(System.in).next();
			
			//문자받고서 이문자열이 숫자로만 이루어져있는지 판단하기
			boolean resultStr = new SearchChar().SearchCharStr(inputNum);
			
			//문자열이 입력되면 false값이 돌아옴
			if(resultStr) {
				break;
			}
		}
		
		//a가 베팅가능한 범위내의 칩셋이면 기본배팅되어있는 칩값 바꾸기
		int a = Integer.parseInt(inputNum);
		if(dao.PlayChip > a|| dao.PlayChip==a) {//남은칩이 배팅한칩보다 크거나 같을때
			if(a>2 || a<10) 	System.out.println("베팅가능 범위를 벗어났습니다. 기본칩 2개로 배팅이됩니다.");
			else 				i = a;
		}else {				//남은칩이 배팅한 칩보다 클떄
			System.out.println("배팅한칩이 남은칩보다 많습니다 "+dao.PlayChip+"개로 변경됩니다.");
			i = dao.PlayChip;
		}
		//베팅한 칩의 값을 넘김
		return i;
	}
	
	
}
