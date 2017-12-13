package day15.inner03;

public class Test01 {

	public static void main(String[] args) {

		
		if(args[0].length()==0){
			System.out.println("select | delete | update | insert");
			System.out.println("�� �ϳ��� �Ķ���ͷ� �Է��ϼ���.");
			return;
		}
		
		
		
		Command delete = new DeleteCommand();
		//delete.exec();

		
		
		
		Command insert = new Command() {
			@Override
			public void exec() {
				System.out.println("��� �۾� ����~~~");
			}
		};
		//insert.exec();

		
		
		
		Command update = new Command() {
			public void exec() {
				System.out.println("���� �۾� ����~~");
			}
		};
		//update.exec();

		
		
		
		Command select = new Command() {
			@Override
			public void exec() {
				System.out.println("��� �Ѹ��� ����~~~");

			}
		};
		//select.exec();

		
		
		
		Command search = new Command() {
			@Override
			public void exec() {
				System.out.println("�˻� ����~~");
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

		System.out.println("���� �۾� ����~~");
	}

}