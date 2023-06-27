package geometry;

public class Square extends Shape{
	private double width;

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	@Override
	public double area() {
		return Math.pow(width, 2);
	}
	@Override
	public double perimeter() {
		return this.width * 4;
	}
}
