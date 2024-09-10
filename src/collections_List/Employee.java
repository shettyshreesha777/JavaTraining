package collections_List;

//import java.util.Scanner;

public class Employee {
private int Employee_Id;
private String Name;
private String Department;
private float Salary;

public Employee(int id, String name, String department, float salary) {
    this.Employee_Id = id;
    this.Name = name;
    this.Department = department;
    this.Salary = salary;
}
/*
public void getEmployee()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Employee ID:");
	this.Employee_Id=sc.nextInt();
	System.out.println("Enter the Employee Name:");
	this.Name=sc.next();
	System.out.println("Enter the Employee Department:");
	this.Department=sc.next();
	System.out.println("Enter the Employee Salary:");
	this.Salary=sc.nextFloat();
}*/

public void DisplayEmployee()
{
	System.out.println("ID: "+this.Employee_Id);
	System.out.println("Name: "+this.Name);
	System.out.println("Department: "+this.Department);
	System.out.println("Salary: "+this.Salary);

}

public int getEmployee_Id() {
	return Employee_Id;
}

public void setEmployee_Id(int employee_Id) {
	Employee_Id = employee_Id;
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public String getDepartment() {
	return Department;
}

public void setDepartment(String department) {
	Department = department;
}

public float getSalary() {
	return Salary;
}

public void setSalary(float salary) {
	Salary = salary;
}
public Employee increaseSalary(float salary) {
	this.Salary+= salary;
	return this;
}
}
