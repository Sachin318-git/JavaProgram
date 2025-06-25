
public class MethodOverloading {

	public static void main(String[] args) {
		// This is method Overloading example.... we called as Compile Time Polymorphism	Note: Also known as, Early bindig, Static binding

		MethodOverloading mo= new MethodOverloading();
		mo.Login("Virat", "Password");
		mo.Login(95453578, "Password");
		mo.Login(954536178);
	}

	public void Login(String s, String p) {
		System.out.println("You have login to the app successfully using user name and password -->"+s+"  "+p);
	}

	public void Login(int s, String p) {
		System.out.println("You have login to the app successfully using Phone Number and password -->"+s+"  "+p);
	}

	public void Login(int s) {
		System.out.println("You have login to app the successfully using Token key -->"+ s);
	}
}
