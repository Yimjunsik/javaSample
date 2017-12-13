package day5;

public class P186 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names	=	new String[3];	//	--------------------
		System.out.println(names[0]+" "+names[1]+" "+names[2]);

		char[]   chars	=	new char[names.length];	//		배열 선언
		System.out.println(chars[0]+","+chars[1]+","+chars[2]);		
		
		int[]    score;	//	-------------------
		score = new int[5];		//배열 생성
		
		for(int i=0;i<score.length;i++){
		
			System.out.print(score[i]+" , ");
			
		}System.out.println("\n-----------------------------");
		
		for(int data:score){
			System.out.print(data+ " ");
		}
		
		
		
		
	}

}
