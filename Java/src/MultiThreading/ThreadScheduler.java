package MultiThreading;

public class ThreadScheduler {

	public static void main(String[] args) {
		Thread t=new Thread();
		t.start();
		for(int i=0;i<-5;i++){
			System.out.println("Main Thread");
		}

	}

}
