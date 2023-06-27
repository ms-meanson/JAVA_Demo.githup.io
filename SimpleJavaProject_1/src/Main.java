
public class Main {

	public static void main(String[] args) {
		// Set Employee 1
		Employee emp1 = new Employee();
		emp1.setName("Tola koa");
		emp1.setGender("Male");
		emp1.setAge(84);
		emp1.setPosition("Employee Officer");
		emp1.setSalary(225);
		
		// Set Employee 2
		Employee emp2 = new Employee();
		emp2.setName("Mean SON");
		emp2.setGender("Male");
		emp2.setAge(24);
		emp2.setPosition("Web Deverlopment");
		emp2.setSalary(210);
		
		// Employee 3 
		Employee emp3 = new Employee("Daro", "Male", 22, "Accountant", 250);
		
		// Output Employee
		System.out.println("===========Employee list=============");
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
		
		// Set Teacher 1
		Teacher t1 = new Teacher();
		t1.setName("Mean SON");
		t1.setGender("Male");
		t1.setAge(35);
		t1.setMajor("IT");
		t1.setHours(35);
		t1.setRate(25);
		
		// Set Teacher 2
		Teacher t2 = new Teacher();
		t2.setName("MuNy MeaN");
		t2.setGender("Male");
		t2.setAge(30);
		t2.setMajor("layer");
		t2.setHours(35);
		t2.setRate(7.5f);
		
		// Output Teacher 
		System.out.println("=========Teacher list===========");
		System.out.println(t1);
		System.out.println(t2);
		
		
		
	}

}
