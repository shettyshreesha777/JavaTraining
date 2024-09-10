package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1=10, n2=0;
		try {
		int n3=n1/n2;
		System.out.println("Quotient is: "+n3);
		}
		catch(ArithmeticException e){
			System.out.println("Divide By Zero Exception");
		}
		
		try {
			String name=null;
			System.out.println(name.charAt(1));
		}
		catch(NullPointerException e)
		{
			System.out.println("NullPointerException");
		}
		
		try {
			int arr[] = new int[10];
			arr[11]=98;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(" Given Array Index is Out of Bound");
		}
	}

}
