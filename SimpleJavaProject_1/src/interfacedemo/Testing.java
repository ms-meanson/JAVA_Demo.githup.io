package interfacedemo;

public class Testing {

	public static void main(String[] args) {
		Animal meymey = new Dog();
		Animal aty = new Cat();
		
		disPlayAnimal(meymey);
		disPlayAnimal(aty);
		
		// Employee
		Employee emp1 = new Employee() {
			@Override
			public double tax() {
				return 0.05;
			}
			@Override
			public double salary() {
				return 480;
			}
			@Override
			public String name() {
				return "Mean SON";
			}
		};
		System.out.println(emp1.name() + "'s salary is " +  emp1.salary());
		
	}
	
	static void disPlayAnimal(Animal animal) {
		if (animal instanceof  Dog) {
			System.out.println("Gogs");
		}else if (animal instanceof Cat){
			System.out.println("Cats");
		}
		System.out.println(animal.speak());
		System.out.println(animal.feed());
		System.out.println("--------------");
		
	}

}
