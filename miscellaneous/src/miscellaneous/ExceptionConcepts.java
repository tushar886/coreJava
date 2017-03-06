package miscellaneous;

public class ExceptionConcepts {

	public static void main(String[] args) {

		int x = 3;
		System.out.println(callException(x));
	}

	private static int callException(int x) {
		
		try {
			if (x == 3)
				return 1;
			else

				throw new Exception("Invalid number");
		} catch (Exception e) {
				e.printStackTrace();
			} finally {
				return 3;
			}
		
	}

}
