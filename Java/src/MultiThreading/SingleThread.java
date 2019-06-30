package MultiThreading;

public class SingleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		Thread t= new Thread();
		System.out.println("Current Thread is :" +Thread.currentThread());
		System.out.println("Current Thread Name is :" +t.getName());
		System.out.println("Current thread Priority is :"+t.getPriority());
		
	}

}
