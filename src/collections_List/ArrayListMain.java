package collections_List;

import java.text.SimpleDateFormat;
import java.util.*;

public class ArrayListMain {

	public static void main(String[] args) {
		
		List<Integer> AL1 = new ArrayList<Integer>();
		List<Employee> AL2=new ArrayList<Employee>();
		
		 Random rand = new Random();
// ADD Method
		 //Add Integer
		 for (int i = 1; i <=100; i++) 
	        {
	        	AL1.add(i);
	        }
	        for (int number : AL1) 
	        {
	            System.out.println(number);
	        }
	        
	        // Add Employee
	        String[] departments = {"HR", "Finance", "Engineering", "Marketing"};

	        for (int i = 1; i <= 100; i++) {
	            int id = i;
	            String name = "Employee" + i;
	            String department = departments[rand.nextInt(departments.length)];
	            float salary = 30000 + rand.nextFloat() * 70000;
	            AL2.add(new Employee(id, name, department, salary));
	        }
	        
	        for (Employee e : AL2) 
	        {
	            e.DisplayEmployee();
	        }
	        
	        //Add element at specific posistion
	        AL1.add(50, -1);
	        Employee e=new Employee(50,"Arjun","IT",65000);
	        AL2.add(50,e);
	        
	        // Add Collection
	        ArrayList<Integer> dummy=new ArrayList<Integer>();
	        dummy.add(1000);
	        dummy.add(2000);
	        dummy.add(3000);
	        
	        AL1.addAll(dummy);
	        
	        //Ensure Capacity
	        ((ArrayList<Integer>) AL1).ensureCapacity(200);
	        
	        //get
	        AL1.get(50);
	        AL2.get(50);
	        
	        AL1.getFirst();
	        AL2.getFirst();
	        
	        AL1.getLast();
	        AL2.getLast();
	        
	        //isEmpty
	        if(AL1.isEmpty()==false)
	        {
	        	System.out.print("AL1 is not empty");
	        }
	        dummy.clear();
	        if(dummy.isEmpty()==true)
	        {
	        	System.out.print("dummy is empty");
	        }
	        dummy=null;
	        try {
	        if(dummy.isEmpty()==true)
	        {
	        	System.out.print("dummy is NULL");
	        }
	        }catch(NullPointerException npe)
	        {
	        	System.out.println("NULL exception occured."+npe);
	        }
	        //Iterator
	        Iterator<Employee> iterator = AL2.iterator();  
	        while (iterator.hasNext())  
	        {  
	        Employee i = iterator.next();  
	        i.DisplayEmployee();  
	          
	        }
	        
	        //ListIterator
	        ListIterator<Employee> li = AL2.listIterator(50);
	        Employee emp1;
	        while (li.hasNext())  
	        {  
	        emp1 = li.next();  
	        emp1.DisplayEmployee();  
	          
	        }
	        
	        //LastIndexOf
	        AL1.lastIndexOf(-1);
	        AL2.lastIndexOf(e);
	        
	        Object[] arr=AL1.toArray();
	        Object[] emp=AL2.toArray();
	        for (Integer i : AL1) 
	        {
	            System.out.println(i);
	        }
	        for (Employee f : AL2) 
	        {
	            f.DisplayEmployee();
	        }
	        
	        //Clone
	        ArrayList<Integer> listClone=(ArrayList<Integer>) ((ArrayList<Integer>) AL1).clone();
	        
	        for (Integer i : AL1) 
	        {
	            System.out.println(i);
	        }
	        
	        //Contains
	        boolean contains100 = AL1.contains(100);
	        if (contains100)
	            System.out.println("The list contains 100");
	        else
	            System.out.println("The list does not contain 100");
	        
	        boolean containsArjun = AL1.contains(e);
	        if (containsArjun)
	            System.out.println("The list contains Arjun");
	        else
	            System.out.println("The list does not contain Arjun");
	        
	        //Indexof
	        System.out.println(AL1.indexOf(-1));
	        System.out.println(AL2.indexOf(e));
	 
	        //Remove
	        	//remove by index
	        AL1.remove(1);
	        AL2.remove(1);
	        
	        	//remove object
	        AL1.remove(Integer.valueOf(-1));
	        AL2.remove(e);
	        
	        	//Remove all items specified in list
	        dummy=new ArrayList<Integer>();
	        dummy.add(1);
	        dummy.add(2);
	        dummy.add(3);
	        AL1.removeAll(dummy);
	        	
	        	//Remove IF
	        AL1.removeIf(n -> (n % 30 == 0));
	        System.out.println(AL1);
	        
	        AL2.removeIf(n -> (n.getName() == "Employee30"));
	        System.out.println(AL2);
	        
	        //ReplaceAll
	        Integer z=1;
	        AL1.replaceAll(n->n+1);
	        AL2.replaceAll(n->n.increaseSalary(2500));
	        
	        //RetainAll
	        AL1.retainAll(listClone);
	        
	        //Set 
	        AL1.set(3, 100);
	        Employee e1=new Employee(101,"Rajesh","Sales",98000);
	        AL2.set(10, e1);
	        
	        //SORT
	        System.out.println("Sort function:");
	        Collections.shuffle(AL1);
	        Date date = new Date();
	        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss.SSS a");
	        String formattedDate = sdf.format(date);
	        System.out.println(formattedDate);
	        AL1.sort(null);
	        date = new Date();
	        sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss.SSS a");
	        formattedDate = sdf.format(date);
	        System.out.println(formattedDate);
	        
	        int n = AL1.size();
	        Integer temp=null;
	        System.out.println("Sorting done manually:");
	        date = new Date();
	        sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss.SSS a");
	        formattedDate = sdf.format(date);
	        System.out.println(formattedDate);
	        for (int i = 0; i < n-1; i++)
	        {
	            int min_idx = i;
	            for (int j = i+1; j < n; j++)
	                if (AL1.get(j) < AL1.get(min_idx))
	                    min_idx = j;
	            
	            temp=AL1.get(min_idx);
	            AL1.set(min_idx,AL1.get(i));
	            AL1.set(i, temp);
	        }
	        date = new Date();
	        sdf = new SimpleDateFormat("MM/dd/yyyy h:mm:ss.SSS a");
	        formattedDate = sdf.format(date);
	        System.out.println(formattedDate);
	        
	        //SPLIT Iterator 
	        Spliterator<Integer> spliterator1 = AL1.spliterator();
	        Spliterator<Integer> spliterator2 = spliterator1.trySplit();
	         
	        spliterator1.forEachRemaining(System.out::println);
	         
	        System.out.println("========");
	         
	        spliterator2.forEachRemaining(System.out::println);
	        
	        
	}

}
