package day20;

import java.util.HashMap;
import java.util.Map;

public class Test04 {

	public static void main(String[] args) {

		
		Command delete = new Command(){
		public void exec(){
			System.out.println("~~~~~delete ����");
		}
		};
		
		Command update = new Command(){
			public void exec(){
				System.out.println("~~~~~update ����");
			}
		};
		
		Command select = new Command(){
			public void exec(){
				System.out.println("~~~~~~select ����");
			}
		};
		
		Command insert = new Command(){
			public void exec(){
				System.out.println("~~~~~~insert ����");
			}
		};
		
			
		
		System.out.println("Main End");
	}

}

