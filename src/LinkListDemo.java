import java.util.LinkedList;

public class LinkListDemo {

	public static void main(String[] args) {
	
		
		LinkedList ll1=new LinkedList();
		
		ll1.add(10);
		ll1.add("iNeuron");
		ll1.add("iNeuron");
		ll1.add(20);
		System.out.println(ll1);
		System.out.println("-------------------------------");
		
		ll1.addFirst("Java");
		ll1.add(2, "tech");
		ll1.addLast("Pune");
		 System.out.println(ll1);
		System.out.println("-------------------------------");
		
		 System.out.println(ll1.getFirst());
		 System.out.println(ll1.getLast());
		 System.out.println(ll1.indexOf(20));
		 ll1.addFirst(1);
		 ll1.addLast(100);
		 System.out.println(ll1);
		 
		 System.out.println(ll1.peekFirst());
		 System.out.println(ll1);
		 System.out.println(ll1.pollFirst());
		 System.out.println(ll1);
		 
		 
		

	}

}
