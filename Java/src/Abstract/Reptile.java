package Abstract;

abstract class Reptile extends Animal{
	void reproduce(){
		System.out.println("reproduce");
			       }
	void move(){
		System.out.println("move");
	}
	abstract void noise();	
}
class Lizard extends Reptile{
	void noise(){
		System.out.println("Lizard Noise");
	}
}
class Snake extends Reptile{
	void noise(){
		System.out.println("Snake Noise");
				}
}
