package geometry;

public class TestGeometry {

	public static void main(String[] args) {
		// cannot create object from abstract class
		// Shape sh = new Shape();
		
		Rectangle rect1 = new Rectangle();
		rect1.setName("Rectangle");
		rect1.setHeight(85);
		rect1.setWidth(235);
		
		Square squ1 = new Square();
		squ1.setName("Square");
		squ1.setWidth(110);
		
		
		
		Triangle tria1 = new Triangle();
		tria1.setName("Triangle");
		tria1.setBase(120);
		tria1.setHeight(94);
		
		Circle cle1 = new Circle();
		cle1.setName("Circle");
		cle1.setRadius(36);
		
		disPlayShape("rect1", rect1);
		System.out.println();
		disPlayShape("squ1", squ1);
		System.out.println();
		disPlayShape("tria1", tria1);
		System.out.println();
		disPlayShape("cle1", cle1);
		
		
		
	}
	
	public static void disPlayShape(String objName, Shape shape) {
		System.out.printf(objName + " is %s \nArea: %.2f, Parimeter: %.2f",
				shape.getName(), shape.area(), shape.perimeter());
	}

}
