package geometry;

public class Triangle extends Shape{
	private double base;
	private double height;
	
	public double getBase() {
		return this.base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	@Override
	public double area() {
		return this.base * this.height;
	}
	@Override
	public double perimeter() {
		return this.base + this.height;
	}
}
