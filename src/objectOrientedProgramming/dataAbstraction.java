package objectOrientedProgramming;

import java.util.Scanner;

class Calculator{
	private int num1;
	private int num2;
	
	Calculator(int n1, int n2)
	{
		num1=n1;
		num2=n2;
	}
	public int Addition()
	{
		return num1+num2;
	}
	public int Subtraction()
	{
		return num1-num2;
	}
	public int Multiplication()
	{
		return num1*num2;
	}
	public int Division()
	{
		if(num2 == 0)
		{	
			return -999;
		}
		else
			return num1/num2;
	}
	
}
public class dataAbstraction {

	public static void main(String[] args) {
		
		int option = 0,number1=0,  number2=0;
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Enter the First Number: ");
			number1=sc.nextInt();
			System.out.println("Enter the Second Number: ");
			number2=sc.nextInt();
			
			Calculator obj = new Calculator(number1,number2);
			
			System.out.println("SIMPLE CALCULATOR");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			System.out.println("Enter your Option: ");
			option=sc.nextInt();
			switch(option)
			{
			case 1: System.out.println("Sum is: "+obj.Addition());
			break;
			case 2:  System.out.println("Difference is: "+obj.Subtraction());
			break;
			case 3:  System.out.println("Product is: "+obj.Multiplication());
			break;
			case 4:  
				if(obj.Division()==-999)
					System.out.println("Divide by Zero Error");
				else
					System.out.println("Quotitent is: "+obj.Division());
			break;
			case 5:
			break;
			default: System.out.println("Wrong Option!");
			}

		}while(option != 5);
		
		sc.close();
	}

}
