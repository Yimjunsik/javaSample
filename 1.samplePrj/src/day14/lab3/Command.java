package day14.lab3;

public interface Command {

	void exec();

	default void newMethod() {
		System.out.println("~~~~~~~~~~~~~~~~~~");
	};

}

class DeleteCommand implements Command {

	@Override
	public void exec() {
		System.out.println("삭제기능 수행~~~");
	}

	@Override
	public void newMethod() {
		// Command.super.newMethod();
		System.out.println("++++++++++++++++++++++++");
	}
}

class InsertCommand implements Command {

	@Override
	public void exec() {
		System.out.println("등록 기능 수행~~~");

	}

}

class UpdateCommand implements Command {

	@Override
	public void exec() {
		System.out.println("수정 기능 수행~~~");

	}

}

class SelectCommand implements Command {

	@Override
	public void exec() {
		System.out.println("목록 보기 기능 수행~~~");

	}

}