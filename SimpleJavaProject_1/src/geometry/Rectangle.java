package geometry;

public class Rectangle extends Shape {
	private double height;
	private double width;
	
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getWidth() {
		return this.width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public double area() {
		return this.width * this.height;
	}
	@Override
	public double perimeter() {
		return (this.width + this.height) * 2;
	}
	
}
