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
		//���� �ڵ�� ���Ȯ���� �����ϹǷ� ���� �� �����ϰ��� �Ѵ�.
		
		
		cmd.exec();
		cmd.newMethod();
	}

}
