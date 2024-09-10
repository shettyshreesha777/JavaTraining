package objectOrientedProgramming;

abstract class shape{
	abstract void area();
}

class Triangle extends shape{
	int height;
	int base;
	Triangle(int h, int b)
	{
		height=h;
		base=b;
	}
	void area()
	{
		System.out.println("The area is: "+(0.5*height*base));
	}
}

class Square extends shape{
	int length;
	Square(int l)
	{
		length=l;
	}
	void area()
	{
		System.out.println("The area is: "+(length*length));
	}
}

class Addition{
	void sum(int x, int y)
	{
		System.out.println("Sum is: "+(x+y));
	}
	void sum(int x, int y,int z)
	{
		System.out.println("Sum is: "+(x+y+z));
	}
	void sum(double x, double y)
	{
		System.out.println("Sum is: "+(x+y));
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// Dynamic Polymorphism
		shape s1=new Triangle(10,20);
		shape s2=new Square(30);
		s1.area();
		s2.area();
		
		// Static Polymorphism
		Addition obj1=new Addition();
		obj1.sum(1, 2);
		obj1.sum(1, 2,3);
		obj1.sum(45.987, 34.54);

	}

}
