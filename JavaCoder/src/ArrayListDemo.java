import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		//Add to list
		al.add(10);
		al.add("Sachin");
		al.add(true);
		
		System.out.println(al.size());
		System.out.println(al);
		
		
		al.add("Sachin");
		al.add(true);
		//Remove
		al.remove(0);
		
		System.out.println(al.size());
		System.out.println(al);
		
		//Fetch value
		System.out.println(al.get(3));

	}

}
