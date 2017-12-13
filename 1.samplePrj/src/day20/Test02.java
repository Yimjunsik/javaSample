package day20;

public class Test02 {

	public static void main(String[] args) {

		Command delete = new DeleteCommand();
		Command insert = new InsertCommand();
		Command select = new SelectCommand();
		Command update = new UpdateCommand();

		if (args.length == 0) {
			System.out.println("delete update select insert 중 하나를 입력하세요.");
			return;
		}

		if (args[0].equals("delete")) {
			delete.exec();
		} else if (args[0].equals("update")) {
			update.exec();
		} else if (args[0].equals("select")) {
			select.exec();
		} else if (args[0].equals("insert")) {
			insert.exec();
		} else {
			System.out.println(args[0] + " 이 기능은 지원이 안됩니다.");
		}
		System.out.println("Main End");
	}

}
