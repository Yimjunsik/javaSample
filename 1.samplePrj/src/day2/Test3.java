package day2;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        System.out.println(1+2);
        System.out.println('1'+'2'); //ASCII 코드 생각.
        System.out.println("1"+"2"); //바로 나감.
        System.out.println("~~ "+1+2); 
        System.out.println(1+2+"~~");
        System.out.println("Hello"+"java"+'!');
		
        System.out.println('1');
        System.out.println('2');
		
        int x = 2;
		int y = 5;
		char c = 'A'; // 'A' 65 
		System.out.println(y >= 5 || x < 0 && x > 2);  // false     
		System.out.println( !('A' <= c && c <='Z') );  // true   
		System.out.println('C'-c);                     // 2   
		System.out.println('5'-'0');                   // 5   
		System.out.println(c+1);                       // 651
		System.out.println(++c);                       // 66   
		System.out.println(c++);                       // A   
		System.out.println(c); 						   // A
        
	}

	
}
