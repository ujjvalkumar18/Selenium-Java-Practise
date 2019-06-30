package JavaPgms;

public class Add {
	int add(int a,float b){
		return (int) (a+b);
		
	}
	public static void main(String args[]){
		Add a=new Add();
		System.out.println(a.add(12,12));
	}

}
