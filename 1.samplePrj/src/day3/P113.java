package day3;

public class P113 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=10,j=10;
		
		System.out.println(i==j);
		
		String name1 = new String("hello");
		String name2 = new String("hello");
		String name3 = name1;
		
		System.out.println("name1==name2 ? : " +(name1==name2));
		System.out.println("name1==name3 ? : " +(name1==name3));
		System.out.println("name1.equals(name2) => " +name1.equals(name2));
		System.out.println("name1.equals(name3) => " +name1.equals(name3));
		System.out.println("=======================================");
		
		
		String s1 = "java";
		String s2 = "java";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2)); //설명 : String도 클래스이기 떄문에 new를 써서 올리는게 맞지만 기본형이기 때문에
											//new없이 사용하는 것이 다반사.
											//new를 쓰고 안쓰고는 결과값은 같다. 그러나 올라가는 메모리영역만 차이가 난다.
		System.out.println(s1.length()); //length는 문자열 길이를 반환.
		System.out.println(s1.charAt(0)); //charAT는 char타입 문자 1개를 return.
		
	}

}
