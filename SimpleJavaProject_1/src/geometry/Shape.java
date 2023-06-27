package geometry;

public abstract class Shape {
//	abstract members
	public abstract double perimeter();
	public abstract double area();
	
//	general class members
	private String name;
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
