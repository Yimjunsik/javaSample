package day4;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//아래의 OUT은 라벨링. 블럭에 이름을 붙여서 핸들링 가능.
	OUT:	for(int i=1; i< 10; i++){
			for(int j=2; j<10; j++){
				//if(j==5) break;	  //5단 이후는 제외.
				if(j==5) break OUT;	  //5단 이후는 제외.
				//if(j==5) continue;  //5단을 생략하고 진행.
				System.out.printf(" %d X %d = %2d |", j,i,i*j);
			}System.out.println();
		}
		
		
	}

}
