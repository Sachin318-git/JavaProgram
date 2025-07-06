package TryCatchJava;

public class TryCatchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			System.out.println("Before exceptions");
			System.out.println(10/0);
		}
		catch(Throwable t)
		{
			System.out.println("This is arithmentic exception");
			System.out.println(t.getMessage());
			t.printStackTrace();
		}
		finally
		{
			System.out.println("This is finally block");
		}

	}

}
