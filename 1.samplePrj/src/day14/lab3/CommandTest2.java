package day14.lab3;

public class CommandTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Command cmd = null;

		// cmd = day14.lab3.DeleteCommand(); //������Ÿ�ӿ� ����.

		Class cls = Class.forName(args[0]);
		cmd = (Command) cls.newInstance(); // ��Ÿ�ӿ� ����

		cmd.exec();

	}

}
