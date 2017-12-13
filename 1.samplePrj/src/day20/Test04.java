package day20;

import java.util.HashMap;
import java.util.Map;

public class Test04 {

	public static void main(String[] args) {

		
		Command delete = new Command(){
		public void exec(){
			System.out.println("~~~~~delete 荐青");
		}
		};
		
		Command update = new Command(){
			public void exec(){
				System.out.println("~~~~~update 荐青");
			}
		};
		
		Command select = new Command(){
			public void exec(){
				System.out.println("~~~~~~select 荐青");
			}
		};
		
		Command insert = new Command(){
			public void exec(){
				System.out.println("~~~~~~insert 荐青");
			}
		};
		
			
		
		System.out.println("Main End");
	}

}

