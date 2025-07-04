
public class ConstructorExample {
	
	ConstructorExample()
	{
		System.out.println("No argument contructor");
	}
	
     ConstructorExample(int i)
	{
		System.out.println("Integer argument contructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorExample C=new ConstructorExample(5);

	}

}
