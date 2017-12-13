package day20;

import java.util.HashMap;
import java.util.Map;

public class Test04 {

	public static void main(String[] args) {

		
		Command delete = new Command(){
		public void exec(){
			System.out.println("~~~~~delete 수행");
		}
		};
		
		Command update = new Command(){
			public void exec(){
				System.out.println("~~~~~update 수행");
			}
		};
		
		Command select = new Command(){
			public void exec(){
				System.out.println("~~~~~~select 수행");
			}
		};
		
		Command insert = new Command(){
			public void exec(){
				System.out.println("~~~~~~insert 수행");
			}
		};
		
			
		
		System.out.println("Main End");
	}

}

