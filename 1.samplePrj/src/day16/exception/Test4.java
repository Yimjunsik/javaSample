package day16.exception;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {


		Scanner scanner = null;
		
		try(FileInputStream fis = new FileInputStream("sample2.txt"); ) {
			System.out.println("�۾� ó��");
		} catch (FileNotFoundException e) {

		System.out.println(e.getMessage());
		System.out.println("sample2.txt ������ �غ����ּ���.");
			
		}catch(Exception e){}
		
		finally{

			System.out.println("finally{} ����");
		}
		System.out.println("========================================");
		try(Scanner scanner1 = new Scanner(new File("Sample2.txt"));) {
			Account a = new Account("",400);
			
		} catch (FileNotFoundException e) {
			System.out.println("sample2.txt ������ �غ����ּ���.");
		} catch(MoneyException e){
			System.out.println(e.getMessage());
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}

		System.out.println("Main End");
		
	}

}
