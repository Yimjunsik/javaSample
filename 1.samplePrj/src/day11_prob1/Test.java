package day11_prob1;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object s = new Student("�浿", 20, 1);

		// ((Student)s).print(); //Object �ؿ� String�� �ִµ� ������ �ٿ�ĳ������ �����ϴ�.
		if (s instanceof Student)
			((Student) s).print(); // ������ ĳ�����ϴ� ���� ������ �߻��� ���̱� ������ üũ�� ���� �Ѵ�.
		s = "Hello";

		if (s instanceof Student)
			((Student) s).print(); // �ٿ�ĳ���� �ϱ� ���� Ÿ��üũ�� �ϴ� ���� ����.
		// instanceof��

		String name = "OOO";
		Student s1 = new Student("�浿", 20, 1);
		Teacher t1 = new Teacher("ȫ��", 40, "java");
		Employee e1 = new Employee("ȫ�浿", 44, "������");

		Person[] p = { s1, t1, e1, new Student("��浿", 22, 2) }; // �迭�� ������ ������
																// Ÿ���� �����Ѵ�.
		// PersonŸ���� �迭��
		// Student,Teacher,Employee ��θ� �ϳ��� �迭�� 
		// �����ϰڴ�.

		System.out.println("==========================================");
		for (int i = 0; i < p.length; i++) {
			// ((Student)p[i]).print(); //�̷��� �ϸ� ������ �ִ�.
			if (p[i] instanceof Student)
				((Student) p[i]).print();
			if (p[i] instanceof Employee)
				((Employee) p[i]).print();
			if (p[i] instanceof Teacher)
				((Teacher) p[i]).print();
		}
		System.out.println("==========================================");

		for (int i = 0; i < p.length; i++) {
			p[i].print();

		}
		System.out.println("========================================");
		Person pp = null;
		pp.print();
		System.out.println("-----------------------------------------");		
		
		Object[] obj = { name, s1, t1, e1 }; // ������Ʈ�� �迭�� �ּҸ� �� ��Ƽ� �����ҷ�.
		// Person[] p = {name,s1,t1,e1}; //name�� StringŸ���̹Ƿ� ������ �߻�. ������Ʈ�� ���
		// ��������������
		// Person�� Student,Teacher,Employee�� �͵鸸 ������ ����.
		// �׷��� �Ʒ��� ���� ó������� ��.
		for(int i=0;i<obj.length;i++){
		if(obj[i] instanceof Person)
			((Person)obj[i]).print();
		}
			
		
	}

}
