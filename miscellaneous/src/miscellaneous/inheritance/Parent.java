package miscellaneous.inheritance;

public class Parent{
	
	public int sum (final int x, final int y) {
		System.out.println("Sum from Parent");
		return x + y;
	}
	
	public String show() {
		return "Hello from Parent";
	}
}