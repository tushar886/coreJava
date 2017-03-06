package miscellaneous.inheritance;

public class Child extends Parent {
	@Override
	 public int sum(final int x, final int y) {
		System.out.println("Sum from child");
		 return x * y;
	 }
	
	@Override
	public String show() {
		return "Hello from Child";
	}
}
