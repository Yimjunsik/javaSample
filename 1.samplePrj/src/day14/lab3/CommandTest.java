package day14.lab3;

public class CommandTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Command cmd = null;

		if (args[0].equals("delete")) {

			cmd = new DeleteCommand();
		} else if (args[0].equals("insert")) {
			cmd = new InsertCommand();
		} else {
			cmd = new UpdateCommand();
		}
		//위의 코드는 기능확장이 불편하므로 조금 더 개선하고자 한다.
		
		
		cmd.exec();
		cmd.newMethod();
	}

}
