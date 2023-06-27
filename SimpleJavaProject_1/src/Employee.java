
public class Employee extends Person {
	private String position;
	private float salary;
	
	public Employee() {
		
	}
	public Employee(String name, String gender, int age, String position, float salary) {
		super.setName(name);
		super.setGender(gender);
		super.setAge(age);
		this.setPosition(position);
		this.setSalary(salary);
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		String out = String.format("Name\t: %s\nSex\t: %s\nAge\t: %s\nPosition: %s\nSalary\t: $%.2f\n ",
				this.getName(), this.getGender(), this.getAge(), this.getPosition(), this.getSalary());
		return out;
		
		
	}
}
