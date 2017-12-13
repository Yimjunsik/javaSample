package day17;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P505 {

	public static void main(String[] args) {

		//String[] data = {"bat", "baby","bonus","cA","ca","co","c.",
		//		"c0","car","combat","count","date","disc"};
		
		String[] data = {
				"java","010-4350-7654","02-222-3434",
				"javains@naver.com","a","A","1234567","java test",
				"f"
		};
		String pattern = "j.*";
		pattern = "(02|010)-\\d{3,4}-\\d{4}";
		
		
		Pattern p = Pattern.compile(pattern);
		
		for(int i = 0; i<data.length;i++){
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.println(data[i]+",");
		}
		System.out.println("Main end");
	}

}
