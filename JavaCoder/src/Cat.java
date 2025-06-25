
public class Cat extends Animal {

	public static void main(String[] args) {
		// Also known as, Late binding, Dynamic Binding, Method Overriding
		Animal a=new Animal();
		a.makeNoise();
		
		Cat c = new Cat();
		c.makeNoise();
	
	}

	/*public void makeNoise() {
		System.out.println("Cat make noise as meaw...."); 
	}*/
}
