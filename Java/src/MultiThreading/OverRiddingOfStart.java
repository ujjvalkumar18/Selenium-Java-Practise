package MultiThreading;

class MyThread extends Thread{
	public void start()
	{
		System.out.println("start method");
	}
	public void Run()
	{
		System.out.println("second start method");
	}
}
public class OverRiddingOfStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t=new MyThread();
		

	}

}
