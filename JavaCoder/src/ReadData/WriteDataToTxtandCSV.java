package ReadData;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTxtandCSV {

		public static void main(String[] args) throws IOException
		{
			//Step 1: Create an object of FileWriter class
			File f= new File("C:\\Users\\admin\\git\\repository\\JavaCoder\\src\\PropertyFile\\TestData.CSV");
			
			FileWriter fw= new FileWriter(f, true);
			
			BufferedWriter br=new BufferedWriter(fw);
			
		    br.write("This is Text file"+",");
		    br.close();
		    System.out.println("CSV File created successfully");
		}

	}

