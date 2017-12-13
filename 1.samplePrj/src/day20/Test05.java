package day20;

public class Test05 {

	public static void main(String[] args) {

		// ���ٽ� ������ �Լ� ���.
		Command delete = () -> {
			System.out.println("delete ���� ~~~~~");
		};
		Command update = () -> System.out.println("Update ���� ~~");
		Command insert = () -> System.out.println("insert ���� ~~");
		Command select = () ->{ System.out.println("select ���� ~~");
		};
		
		select.exec();
		delete.exec();
		update.exec();
		insert.exec();
		
		select.print();
		delete.print();
		update.print();
		insert.print();
	}
	

}

@FunctionalInterface
interface Command {
	void exec();
	default void print(){
	System.out.println("************************");	
	}
}

// �Ұ���. @FunctionalInterface
interface A {
	void go();

	void stop();
}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("DeleteCommand ����");

	}

}

class InsertCommand implements Command {

	@Override
	public void exec() {
		System.out.println("InsertCommand ����");
	}

}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("UpdateCommand ����");

	}

}

class SelectCommand implements Command {

	@Override
	public void exec() {

		System.out.println("SelectCommand ����");
	}

}