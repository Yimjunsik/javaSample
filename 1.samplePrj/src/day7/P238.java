package day7;

public class P238{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TV tv1 = new TV();
		tv1.display();
		tv1.power();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.channelUp();
		tv1.display();
		
		TV tv2 = new TV();
		
		
	}
}




class TV {

	
	String color;
	boolean power;
	int channel;
	
	void power()	{
		this.power = !this.power;}
	void channelUp()	{ ++this.channel;}
	void channelDown()	{ --this.channel;}
	void display(){
		System.out.printf("TV[%s channel:%d ����(%b)]%n",this.color,channel,power);
	
		
		System.out.println("���� ä���� "+ this.channel + " �Դϴ�.");
	}

}
