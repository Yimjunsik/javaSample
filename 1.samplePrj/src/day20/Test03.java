package day20;

import java.util.HashMap;
import java.util.Map;

public class Test03 {

	public static void main(String[] args) {

		
		if(args.length==0){
			System.out.println("delete update select insert 중 하나를 입력하세요.");
			return;
		}

				
		Map<String, Command> map = new HashMap();
		map.put("delete", new DeleteCommand());		
		map.put("update", new UpdateCommand());		
		map.put("select", new SelectCommand());		
		map.put("insert", new InsertCommand());		
		
		Command command = map.get(args[0]);
		if(command ==null){
			System.out.println(args[0] + " 기능은 지원되지 않습니다.");
			return;
		}
		command.exec();
		
		
		System.out.println("Main End");
	}

}

