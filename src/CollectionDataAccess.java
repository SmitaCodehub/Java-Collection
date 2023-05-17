import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeSet;

public class CollectionDataAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10); // al.add(new Integer(10));
		al.add(10.5);//al.add(new Double(10.5));
		al.add('c');//al.add(new Character('c'));
		al.add(10.5f);// auto boxing
		//System.out.println(al);
		
		ArrayList al2=new ArrayList();
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		al2.add(50);
		System.out.println(al2);//
		
		
		for(int i=0; i<al2.size(); i++)
		{
			System.out.println(al2.get(i) + " ");
		}
		
		System.out.println("Using For Each");
		for (Object obj:al2)
		{
			System.out.print(obj +" ");
		}
		
		System.out.println("Using iterator");
		
		Iterator it=al2.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		// what if I want to reverse or access data of other claases in reverse dir?
		
		
				TreeSet ad=new TreeSet();
				ad.add(10);
				ad.add(20);
				ad.add(30);
				ad.add(40);
				
				Iterator it1=ad.iterator();
				while(it1.hasNext()==true)
				{
					Integer i=(Integer) it1.next();
					System.out.println("Array ele " + i);
				}
				
				System.out.println("added linked list");
				LinkedList ll=new LinkedList();
				ll.add(ad);
				System.out.println("added linked list" +ll);
				
//				ListIterator lt1=ll.listIterator(ll.size());
//				while(lt1.hasPrevious())
//				{
//					System.out.println(lt1.previous());
//				}
				ListIterator litr2=ll.listIterator(ll.size());
				System.out.println("Accessing treeset data in reverse");
				while(litr2.hasPrevious())
				{
					System.out.println(litr2.previous());
					
				}
				
				
		
	}

}
