package objectOrientedProgramming;

class Car{
	private int carid;
	private String company;
	private String model;
	private float price;
	
	protected void getCarInfo(int cid, String comp, String name, float cost)
	{
		carid=cid;
		company=comp;
		model=name;
		price=cost;
	}
	public void DisplayCarInfo()
	{
		System.out.println("Car ID: "+carid+" Company: "+company+" Model: "+model+" Price: "+price);
	}
	
}
public class dataEncapsulation {

	public static void main(String[] args) {
		Car c1=new Car();
		Car c2=new Car();
		
		c1.getCarInfo(101, "Ford", "EcoSport", 950000);
		c2.getCarInfo(102, "Toyota", "Fortuner", 4500000);
		
		c1.DisplayCarInfo();
		c2.DisplayCarInfo();

	}

}
