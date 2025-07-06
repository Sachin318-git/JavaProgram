import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HasMapDemo {

	public static void main(String[] args) {
		// HasMap contains data as key, value pairs.
		//Contains only unique key
		//Not synchronized and No order
		//Java HashMap may have one null key and multiple null values.
		
		HashMap<String, String> hsm1= new HashMap<String, String> ();
		hsm1.put("Number", "123456");
		hsm1.put("Website", "www.google.com");
		hsm1.put("DesktopApp", "Visual Studio");
		hsm1.put("Website2", "www.UAT.com");
		
		System.out.println(hsm1);
		
		//Set s=hsm1.keySet();
		//System.out.println(s);
		
		for(String key:hsm1.keySet())
		{
			System.out.println("Key is "+ key+"-Values is "+hsm1.get(key));
		}
			
		
		Set s=hsm1.keySet();
		Iterator<String> itr= s.iterator();
	/*	while(itr.hasNext())
		{
			String key=itr.next();
		System.out.println("Key is "+key+"Value is "+hsm1.get(key));
		}*/
		
		

	}

}
