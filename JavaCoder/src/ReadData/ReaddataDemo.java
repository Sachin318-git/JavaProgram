package ReadData;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class ReaddataDemo {
	
	// How to read data from property files
public static void main(String[] args) throws IOException
{
	//Step 1: Create an object of FileWriter class
	FileWriter fw= new FileWriter("C:\\Users\\admin\\git\\repository\\JavaCoder\\src\\PropertyFile\\TestData.property",true);
	//Step 2: Create an object of Properties class
	Properties p=new Properties();
	
	
	//Step 3: Use Set property method to Set property
	p.setProperty("Number", "9518394562");
	p.store(fw, "New number added");
}
}
