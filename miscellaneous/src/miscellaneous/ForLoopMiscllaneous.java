package miscellaneous;

public class ForLoopMiscllaneous {

	public static void main(String[] args) {
		
		//This works fine and acts as an infinite loop.
		for (int i = 0; true; i++) {
			System.out.println("Hi");
			break;
		}
	}
}
