import java.util.Scanner;

public class TestExamples {
	int total=0;

    public static void Reccursion(int Num, int n1, int n2, int total)
	{
    	int i = 0;
		while(i < Num)
		{
			System.out.println(n1);
			total+=n1;
			if(total==987)
				break;
			int sum= n1+n2; //sum=1 
			n1=n2;  
			n2=sum;
			i++;
			
		}
		System.out.println( "Total: "+ total);
	}

		    public static void main(String[] args) {

		    	int Num;
		    	Scanner sc=new Scanner(System.in);
		        System.out.println("Enter a number");
		    	Num=sc.nextInt();
		    	
		    	int num1=0, num2=1;
		    	int total=0;
		    	Reccursion(Num, num1, num2, total);
		    
		   }
}


//Output: 0 1 1 2 3 5 8 12


