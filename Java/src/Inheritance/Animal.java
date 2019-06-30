package Inheritance;

class parent {
	public void p() {
		System.out.println("parent");
	}
}

class child extends parent {
	public void c() {
		System.out.println("child");
	}
}

class TestInheritance {
	public static void main(String args[]) {
		child c = (child) new parent();
		c.c();
		c.p();
		parent p=new child();
		p.p();
//		p.c();
		
	}
}