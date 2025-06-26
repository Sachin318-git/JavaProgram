
public class Car implements Cardesign {

	public static void main(String[] args) {
		// Implementing abstract and concrete methods which are present in Cardesign interface
		Car c= new Car();
		c.carColor();
		c.carShape();

	}

	@Override
	public void carColor() {
		System.out.println("This is an car Color Red");
		
	}

	@Override
	public void carShape() {
		System.out.println("This is an car Shape - Sedan");
		
	}

}
