package day19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Prob2 {
	public static void main(String[] args) {
		String str = "PROD-001#X-note#Samsung#3#6000000#";
		Set<String> strs = stringSplit(str, "#");
		System.out.println("=== 문자열 처리 결과 ===");

		// strs 를 아래와같이 출력되도록 코드를 완성하세요

		Set<String> list = stringSplit(str, "#");
		// Prob2.stringSplit(str, "#");
		System.out.println(list);

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data);
		}
	}

	private static Set<String> stringSplit(String str, String string) {
		// 구현하시오.

		Set<String> set = new HashSet<>();
		int p = -1;
	
		// p = str.indexOf("#",p+1);
		// set.add(str.substring(0, p));

		do {
			if (p + 1 > str.length())
				break;
			set.add(str.substring(p + 1, p = str.indexOf("#", p + 1)));
		} while (p != -1);

		return set;

	}
}
