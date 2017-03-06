package miscellaneous;

public class PalindromeLessThanN {

	private final static int num = 104;
	
	public static void main(String[] args) {

		generatePalindromes(num);
	}

	private static void generatePalindromes(int num) {
		
		int no;
		
		// Run two times for odd and even length palindromes
	    for (int j = 0; j < 2; j++)
	    {
	        // Creates palindrome numbers with first half as i. 
	        // Value of j decided whether we need an odd length
	        // of even length palindrome.
	        int i = 1;
	        while ((no = createPalindrome(i, 10, j % 2)) < num)
	        {
	            System.out.println(no + " ");
	            i++;
	        }
	    }
	}

	private static int createPalindrome(int input, int b, boolean isOdd) {
		// TODO Auto-generated method stub
		 int n = input;
		    int palin = input;
		 
		    // checks if number of digits is odd or even
		    // if odd then neglect the last digit of input in
		    // finding reverse as in case of odd number of
		    // digits middle element occur once
		    if (isOdd)
		        n /= b;
		 
		    // Creates palindrome by just appending reverse
		    // of number to itself
		    while (n > 0)
		    {
		        palin = palin * b + (n % b);
		        n /= b;
		    }
		    return palin;
	}

}
