package serialization;
import java.io.*;
import java.util.ArrayList;

public class StoreInFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student.TeacherName="Ross";
		
		ArrayList<Student> arr2=new ArrayList<Student>();
		
		Student s1=new Student(1,"Joey",23,"Mech");
		Student s2=new Student(2,"Phoebe", 18,"EEE");
		arr2.add(s1);
		arr2.add(s2);
		s1=new Student(3,"Chandler",20,"CSE");
		s2=new Student(4,"Monica",21,"EC");
		arr2.add(s1);
		arr2.add(s2);
		
		FileOutputStream f1;
		try {
			f1 = new FileOutputStream("StudentData.txt",true);
			ObjectOutputStream oos= new ObjectOutputStream(f1);
			oos.writeObject(arr2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FileInputStream f2;
		Student.TeacherName="Rachel";
		try {
			f2 = new FileInputStream("StudentData.txt");
			ObjectInputStream ois= new ObjectInputStream(f2);
			
			ArrayList<Student> arr=new ArrayList<Student>();
			
			arr=(ArrayList<Student>)ois.readObject();
			
			for(Student s3 : arr)
			{
				s3.DisplayStudent();
			}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }

	}

}
