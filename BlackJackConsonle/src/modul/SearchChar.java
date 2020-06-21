package modul;

public class SearchChar {
	
	//문자열이 넘어오면 false 숫자만으로 이루어져있으면 True값을 넘겨준다
	public boolean SearchCharStr(String str) {
		boolean Result = true;
		for(int i = 0; i<str.length(); i++) {
			char c = str.charAt(i);
			if(!(c>='0'&&c<='9')) {
				System.out.println("문자열 입력불가");
				Result = false;
				break;
			}
		}
		return Result;
	}
	
}
