package day15.inner03;

public class Test01 {

	public static void main(String[] args) {

		
		if(args[0].length()==0){
			System.out.println("select | delete | update | insert");
			System.out.println("중 하나를 파라미터로 입력하세요.");
			return;
		}
		
		
		
		Command delete = new DeleteCommand();
		//delete.exec();

		
		
		
		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println("등록 작업 수행~~~");
			}
		};
		//insert.exec();

		
		
		
		Command update = new Command() {
			public void exec() {
				System.out.println("수정 작업 수행~~");
			}
		};
		//update.exec();

		
		
		
		Command select = new Command() {
			@Override
			public void exec() {
				System.out.println("목록 뿌리기 수행~~~");

			}
		};
		//select.exec();

		
		
		
		Command search = new Command() {
			@Override
			public void exec() {
				System.out.println("검색 수행~~");
			}
		};
		//search.exec();

		
		switch (args[0]){
		
		
		case "delete":
			delete.exec();
			break;
		
		case "select":
			select.exec();
			break;
			
		case "update":
			update.exec();
			break;
	
			
		case "insert":
			insert.exec();
			break;
		
	}}

}

	interface Command {
		void exec();

	}

class DeleteCommand implements Command {

	@Override
	public void exec() {

		System.out.println("삭제 작업 수행~~");
	}

}