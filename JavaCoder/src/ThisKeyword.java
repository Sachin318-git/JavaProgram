
public class ThisKeyword {
	
	int x;
	int y;
	
	ThisKeyword()
	{
		System.out.println("This is default constructor");
	}
	
	ThisKeyword(int x, int y)
	{
	    this.x=x;
		this.y=y;
		System.out.println("This is Parameterize constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeyword tk=new ThisKeyword(5,10);
		tk.getData();
		

	}

	public void getData()
	{
		int x=10;
		int y=20;
		System.out.println(this.x+this.y);
	}

}
