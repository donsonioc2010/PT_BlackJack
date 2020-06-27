package main;
public class ProgrammersStack {
	public static void main(String[] args) {
        //예제 배열의 Values로 대입을 해놓았다.
		int []array = {1,5,2,6,3,7,4};
		int [][]commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};	
		
        //Return 할 배열을 넣을 배열이다. 크기는 내가 뽑아야하는 숫자만큼 잡는다.
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
            
		//삽입정렬
			//삽입정렬의 특징 N 의 위치에 숫자는 N-1까지 검색을한다
            for(int i2 = 1; i2<sort.length; i2++) {

                System.out.println(i2+"회차 : "+Arrays.toString(sort));
                for(int j = 0; j<i2; j++) {

                    //작거나 같은경우 소팅
                    if(sort[i2]<=sort[j]) {
                        //대입할 값을 미리 temp에 넣는다
                        int temp = sort[i2];
                        //N위치까지 그앞에 있는 Values를 밀어낸다.
                        for(int k = i2; k>j; k--) {
                            sort[k] = sort[k-1];
                        }
                        //대입해야하는 장소에 temp(넣어야하는Value)를 넣는다.
                        sort[j] = temp;
                    }
                }
			}
        }
        //소팅을 다한 이후에 뽑아야 하는 값을 순서대로 넣어준다
		answer[i] = sort[commands[i][2]-1];
	}
}