package day16.lang;

public class P464 {

	public static void main(String[] args) {

		String msg = "Hello java test ~~~";
		
		System.out.println(msg);
			
		System.out.println(msg.replace('~', '!'));
			
		System.out.println(msg);
		msg.concat("sample");
		System.out.println(msg);
		
		StringBuffer sb = new StringBuffer("StringBuffer test");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		sb.append("sample");
		System.out.println(sb);
		
		String s = sb.toString();
		
		
		
	}

}
