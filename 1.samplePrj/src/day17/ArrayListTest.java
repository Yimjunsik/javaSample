package day17;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {

		int[] i;
		String[] s;
		Student[] ss;
		Object[] ob;
		
		ArrayList list1 = new ArrayList();	//object
		list1.add(new Student("ȫ��",23));
		list1.add("hello java");
	
		System.out.println(list1.size());
		System.out.println(list1.get(1));
		((String)list1.get(1)).toUpperCase();
		
		ArrayList<String> list2 = new ArrayList<String>(); //String
		
		for(int j=0; j<100;j++){
		
			list2.add("test "+j);
		}
		list2.add(3,"~~~~~~");
		list2.remove(1);
		list2.remove("test 0");
		
		System.out.println(list2);
		System.out.println(list2.size());
		
		for(int j = 0; j<list2.size();j++){
			
			//System.out.println(list2.get(j).substring(list2.get(j).length()-2));
			System.out.println(list2.get(j).toUpperCase());
		}
		
		
	}

}
