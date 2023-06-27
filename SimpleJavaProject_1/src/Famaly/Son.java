package Famaly;

public class Son extends Mother{
	public int age = 14;
	
	@Override
	public String doWork() {
		return super.doWork() + " and washing up.";
	}
	
	public int calculate(int a, int b) {
		int c = a + b;
		return c;
	}
	public int calculate(int n, int m, int o) {
		int x = n + m + o;
		return x;
	}
}
