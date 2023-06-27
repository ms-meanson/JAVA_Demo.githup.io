package interfacedemo;

public class Dog implements Animal {
	
	
	@Override
	public String speak() {
		return ("Woof Woof");
		
	}
		
	@Override
	public String feed() {
		return ("eats bones");
	}
}
