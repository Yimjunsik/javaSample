package day14.lab3;

public class CommandTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		Command cmd = null;

		// cmd = day14.lab3.DeleteCommand(); //컴파일타임에 결정.

		Class cls = Class.forName(args[0]);
		cmd = (Command) cls.newInstance(); // 런타임에 결정

		cmd.exec();

	}

}
