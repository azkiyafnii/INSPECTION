<<<<<<< HEAD
=======
import src.main.java.Counter;
>>>>>>> 7f6f9aa8b94744b1029388aadefdb4feebd19e00

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.increment();
		
		System.out.println("Current count:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("Current count:" + counter.getCount());
		
	}

}
