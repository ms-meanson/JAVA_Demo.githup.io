import Famaly.Mother;
import Famaly.Son;

public class Main2 {

	public static void main(String[] args) {
		Mother mother1 = new Mother();
		Son son1 = new Son();
		
		System.out.println("Mother: " + mother1.age + " is " + mother1.doWork());
		System.out.println("Son: " + son1.age + " is " + son1.doWork());
		
		

	}

}
