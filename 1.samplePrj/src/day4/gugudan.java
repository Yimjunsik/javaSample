package day4;

public class gugudan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//�Ʒ��� OUT�� �󺧸�. ���� �̸��� �ٿ��� �ڵ鸵 ����.
	OUT:	for(int i=1; i< 10; i++){
			for(int j=2; j<10; j++){
				//if(j==5) break;	  //5�� ���Ĵ� ����.
				if(j==5) break OUT;	  //5�� ���Ĵ� ����.
				//if(j==5) continue;  //5���� �����ϰ� ����.
				System.out.printf(" %d X %d = %2d |", j,i,i*j);
			}System.out.println();
		}
		
		
	}

}
