import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> hset=new HashSet<Integer>();
		hset.add(10);
		hset.add(20);
		hset.add(30);
		hset.add(40);
		hset.add(50);
		hset.add(50);
		
		System.out.println(hset);
		hset.remove(30);
		Iterator<Integer> itr= hset.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
