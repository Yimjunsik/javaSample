package day20;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class P659 {

	public static void main(String[] args) {

		Properties p = new Properties();
		System.out.println(p);

		p.setProperty("java01", "1234");
		p.setProperty("java02", "2345");
		p.setProperty("java03", "3456");
		System.out.println(p);

		System.out.println(p.getProperty("java03"));
		System.out.println("==================================");

		Set key = p.keySet();
		
		Iterator it = key.iterator();
		
		while (it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data + " : " + p.getProperty(data));
		
			
		}

	}

}
