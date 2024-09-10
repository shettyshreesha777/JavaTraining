package serialization;
import java.io.Serializable;

class Student implements Serializable{
	private int RollNo;
	private String name;
	private int age;
	private String branch;
	public static String TeacherName;
	
	Student(int r, String n, int a, String b)
	{
		RollNo=r;
		name=n;
		age=a;
		branch=b;
	}
	
	public void DisplayStudent()
	{
		System.out.println("Roll No: "+RollNo);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Branch: "+branch);
		System.out.println("TeacherName: "+TeacherName);

	}

}
