
import java.util.Arrays;

public class ProgrmmersSort {
	public static void main(String[] args) {
		int []array = {1,5,2,6,3,7,4};
		int [][]commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		
		int []answer = new int[commands.length];

		
		for(int i = 0; i<commands.length; i++) {
			//자른 숫자들을 넣을 배열의 방
			int []sort = new int[(commands[i][1]-commands[i][0]) + 1];
			
			//배열의 [i][0]위치부터 [i][1]위치까지 짤라온다
			for(int i2 = 0; i2<sort.length;i2++) {
				//2가 들어가있으면 2번째는 1번방이기에 1번방부터로 변경
				int getNum = commands[i][0]-1;
				sort[i2] = array[getNum+i2];
			}
			System.out.println("소팅전 : "+Arrays.toString(sort));
			//삽입정렬
				//삽입정렬의 특징 N 의 위치에 숫자는 N-1까지 검색을한다
			for(int i2 = 1; i2<sort.length; i2++) {

				int ChangeNum = sort[i2];
				for(int j = 0; j<i2; j++) {

					//작거나 같은경우 소팅
					if(sort[i2]<=sort[j]) {
						int temp = sort[i2];
						for(int k = i2; k>j; k--) {
							sort[k] = sort[k-1];
						}
						sort[j] = temp;
					}
				}
				System.out.println(i2+"회차[바꿀숫자["+ChangeNum+"]] : "+Arrays.toString(sort));	
			}
			System.out.println();
			
			answer[i] = sort[commands[i][2]-1];
		}
		
		System.out.println("정답 :"+ Arrays.toString(answer));
	}
}
