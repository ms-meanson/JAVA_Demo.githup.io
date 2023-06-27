package interfacedemo;

public class Cat implements Animal {

	@Override
	public String speak() {
		return "meow meow";
	}

	@Override
	public String feed() {
		return "eats fish";
	}

}
