package miscellaneous.inheritance;

public class InheritanceUtil {
	
 
	public static void main(String[] args) {
		
		Parent p = new Parent();
		
		Parent p1 = new Child();
		
		Child ch = new Child();
		
		System.out.println(p.sum(3, 4));
		System.out.println(p1.sum(3, 4));
		System.out.println(ch.sum(3, 4));
		
		System.out.println(p.show()); 
		System.out.println(p1.show()); 
		System.out.println(ch.show());

	}
	
	

}
