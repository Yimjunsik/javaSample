package day20;

public class Test05 {

	public static void main(String[] args) {

		// 람다식 변수에 함수 등록.
		Command delete = () -> {
			System.out.println("delete 수행 ~~~~~");
		};
		Command update = () -> System.out.println("Update 수행 ~~");
		Command insert = () -> System.out.println("insert 수행 ~~");
		Command select = () ->{ System.out.println("select 수행 ~~");
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

// 불가능. @FunctionalInterface
interface A {
	void go();

	void stop();
}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행");

	}

}

class InsertCommand implements Command {

	@Override
	public void exec() {
		System.out.println("InsertCommand 수행");
	}

}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행");

	}

}

class SelectCommand implements Command {

	@Override
	public void exec() {

		System.out.println("SelectCommand 수행");
	}

}