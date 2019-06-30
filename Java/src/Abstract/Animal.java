package Abstract;

abstract class Animal {
	abstract void noise();
	abstract void move();
	abstract void reproduce();
}
abstract class Mammal extends Animal{
	void reproduce(){
		System.out.println("reproduce");
			       }
	void move(){
		System.out.println("move");
	}
	abstract void noise();
}

class cat extends Mammal{
	void noise(){
		System.out.println("Cat noise");
	}	
}
class dog extends Mammal{
	void noise(){
		System.out.println("Dog noise");		
	}
}




