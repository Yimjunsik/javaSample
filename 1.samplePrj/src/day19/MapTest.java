package day19;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("java01", "1234");
		map.put("java01", "3514");
		map.put("java02", "31214");
		map.put("java03", "321454");
		map.put("java04", "37544");
		map.put("java05", "876867");
		map.put("java06", "32125");
		map.put("java07", "36547");
		map.put("java08", "34562");
		map.put("java09", "65842");
		map.put("java11", "3214");

		while (true) {

			System.out.println(" �α��� ó��");
			Scanner scanner = new Scanner(System.in);
			System.out.print("ID :");
			String id = scanner.nextLine();
			System.out.println("\nPW : _");
			String pw = scanner.nextLine();

			if (map.containsKey(id)) {
				if (map.get(id).equals(pw)) {
					System.out.println("�α��� �����Դϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� �ٽ� Ȯ�����ּ���...");
					return;
				}
			} else {
				System.out.println("id �� �������� �ʽ��ϴ�.");
				continue;
			}

		}
		System.out.println("=============���� ���===============");

		/*
		 * System.out.println(map); System.out.println(map.get("java01"));
		 * System.out.println(map.get("java09"));
		 * 
		 * System.out.println(map.keySet()); Set<String> keys = map.keySet();
		 * 
		 * Iterator<String> it = keys.iterator(); while (it.hasNext()) { String
		 * keyName = (String) it.next(); map.get(keyName);
		 * System.out.println("ID :"+keyName+ " : pw :"+map.get(keyName)); }
		 */

	}

}
