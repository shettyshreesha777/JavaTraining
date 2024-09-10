package collections_List;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
public class ThreadProgrammingAL {

	public static void main(String[] args) {
		/*
		List<Integer> list = Collections.synchronizedList(new ArrayList<>());
		//List<Integer> list = new ArrayList<Integer>();

        // Adding initial elements
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }

        Runnable task = () -> {
            List<Integer> toAdd = new ArrayList<>();
            synchronized (list) {
                Iterator<Integer> iterator = list.iterator();
                while (iterator.hasNext()) {
                    Integer number = iterator.next();
                    System.out.print(number+" ");
                    toAdd.add(number + 1000); // Collecting elements to add later
                }
            }
            synchronized (list) {
                list.addAll(toAdd); // Adding elements outside the iteration
            }
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        */
		 //List<Integer> list = new ArrayList<>();
		 List<Integer> list = Collections.synchronizedList(new ArrayList<>());
		 
	        for (int i = 0; i < 1000; i++) {
	            list.add(i);
	        }

	        /*
	        Runnable task = () -> {
	            for (int i = 0; i < list.size(); i++) {
	                System.out.println(list.get(i));
	            }
	        };*/
	        Runnable task = () -> {
	            synchronized (list) {
	                for (int i = 0; i < list.size(); i++) {
	                    System.out.print(list.get(i)+" ");
	                }
	            }
	        };

	        Thread thread1 = new Thread(task);
	        Thread thread2 = new Thread(task);

	        thread1.start();
	        thread2.start();

	        try {
	            thread1.join();
	            thread2.join();
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
	}

}
