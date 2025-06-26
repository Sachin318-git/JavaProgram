
public class Shape extends Circle{

	public static void main(String[] args) {
		// Implementing the abstract methods which are declared in Circle class
		
		Shape s=new Shape();
		s.circleSize();
		
		s.circleColor();
		s.circleShapes();

	}
	@Override
	public void circleColor() {
		System.out.println("This is color of circle");
		
	}
	@Override
	public void circleShapes() {
		System.out.println("This is shape of circle");
		
	}

}
