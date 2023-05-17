import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
	
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(32);
		al.add(41);
		
		System.out.println(al);
		
		System.out.println("-----------------------------------------");
		
		ArrayList al1=new ArrayList();
		al1.add("Arraylist");
		al1.add(29);
		al1.add(21.9);
		al1.add('S');
		al1.add('S');
		System.out.println(al1);
		System.out.println("-----------------------------------------");
		
		ArrayList al2=new ArrayList();
		al2.addAll(al1);
		
		System.out.println(al2);
		System.out.println("-----------------------------------------");
		
		
		ArrayList al3=new ArrayList();
		al3.add(11);
		al3.add(22);
		al3.add(33);
		
		System.out.println("Before adding data:"+al3);
		al3.add(1, 88);
		al3.add(0, 00);
		System.out.println("after adding data "+al3);
		
		System.out.println("-----------------------------------------");
		System.out.println("-----------------------------------------");
		
		System.out.println(al3.contains(88));
		
		
		int index=al3.indexOf(88);
		System.out.println(index);
		
		System.out.println(al2.isEmpty());
		al3.ensureCapacity(10);
		System.out.println(al3.size());
		
		al3.trimToSize();
		System.out.println(al3.getClass());
		al1.clear();
		System.out.println(al1);
		System.out.println(al1.size());
		
		
		

	}

}
