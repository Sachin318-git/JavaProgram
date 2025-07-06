package ReadData;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class WritedataDemo {
	
	// How to read data from property files
public static void main(String[] args) throws IOException
{
	//Step 1: Create an object of FileReader class
	FileReader fr= new FileReader("C:\\Users\\admin\\git\\repository\\JavaCoder\\src\\PropertyFile\\TestData.property");
	//Step 2: Create an object of Properties class
	Properties p=new Properties();
	
	//Step 3: Load the files
	p.load(fr);
	
	//Step 4: Use get property method to get property
	System.out.println(p.getProperty("Name"));
	System.out.println(p.getProperty("website"));
}
}
