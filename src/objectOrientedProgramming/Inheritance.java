package objectOrientedProgramming;

class Animal{
	protected void walk()
	{
		System.out.println("Walk on 4 legs");
	}
}
class Dog extends Animal{

	void play()
	{
		System.out.println(" Play with ball");
	}
}
class Lion extends Animal{

	void Hunt()
	{
		System.out.println(" Hunts deer");
	}
}

public class Inheritance {

	public static void main(String[] args) {
		Dog d1 =new Dog();
		d1.play();
		d1.walk();
		
		Lion l1 =new Lion();
		l1.Hunt();
		l1.walk();

	}

}
