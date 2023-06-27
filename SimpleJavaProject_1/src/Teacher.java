
public class Teacher extends Person {
	private String major;
	private float hours;
	private float rate;
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public float getHours() {
		return hours;
	}
	public void setHours(float hours) {
		this.hours = hours;
	}
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public float calcsalary() {
		return this.hours * this.rate;
	}
	@Override
	public String toString() {
		String out = String.format("Name\t: %s\nSex\t: %s\nAge\t: %s\nMajor\t: %s\nSalary\t: $%.2f\n ",
				this.getName(), this.getGender(), this.getAge(), this.getMajor(), this.calcsalary());
		return out;
		
		
	}
}
