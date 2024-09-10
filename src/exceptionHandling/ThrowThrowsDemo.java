package exceptionHandling;
class ExceptionCreator
{
	void Division(int n1, int n2) throws ArithmeticException
	{
		int result=n1/n2;
		
		System.out.println("Quotient is: "+result);
	}
	
}
public class ThrowThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		ExceptionCreator c1=new ExceptionCreator();
		c1.Division(10, 0);
	}
	catch(ArithmeticException e)
		{
		System.out.println(e);
		}

}
}
