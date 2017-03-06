package miscellaneous;

import java.util.LinkedList;
import java.util.Stack;

public class PalindromeChecker {
	private Stack charStack; //stack can contain characters
	private LinkedList charQueue; //queue can contain characters
	private String inputString;
	//Constructor to initialize member variables
	public PalindromeChecker(String inputString)
	{
	charStack = new Stack();
	charQueue = new LinkedList();
	this.inputString = inputString;
	}
	//The check method checks if an input string is a palindrome or not,
	//and prints its result.
	public void check()
	   {
	   boolean success = true; //success indicates whether palindrome or not
	   boolean done = false; //it is used to stop the while loop
	   int i = 0; //i wil be used as an index of the inputString
	/***This section below is the code I need help with***/
	   while (!done)
	{
	   //until the end of inputString or it encounters '#' character
	   //take each character in inputString from left and add it to charStack and charQueue
	       while(true){
	   if(i == inputString.length())
	   break;
	   else if(inputString.charAt(i) == '#'){
	   break;
	   }
	   char ch = inputString.charAt(i);
	   charStack.push(ch);
	   charQueue.add(ch);
	   ++i;
	   }
	  
	   //prints out the substring extracted from the input string using queue's toString method
	   System.out.print("The input " + charQueue.toString());
	  
	//until the charQueue or charStack becomes empty
	//remove a character from each of charStack and charQueue, and check if they are same.
	//If they are different, then print out the approproate message (" is not a palindrome\n")
	//and also print which first set of two characters are different
	//("The characters ' ' and ' ' do not match\n\n") -- note that you need to print
	//two such characters inbetween ' '
	//Also set success to false, so that the following "if" statement will be skipped
	   char ch1, ch2;
	   success = true;
	   while(!charQueue.isEmpty()){
	   ch1 = charQueue.pop();
	   ch2 = charStack.pop();
	   if(ch1 != ch2){
	       System.out.print(" is not a palindrome \nThe characters '"
	              + ch1 + "' and '" + ch2 + "' do not match\n\n");
	   success = false;
	   break;
	   }
	   }
	/***End section of code I need help with***/
	if (success == true)
	   System.out.print(" is a palindrome\n\n");
	//i reaches the end of string, it is done processing the inputString
	if (i == inputString.length())
	done = true;
	else
	{
	i++;
	success = true; //set it back to true for the next substring to check
	}
	} //end of while loop
	} //end of check( ) method
	} // end of PalindromeChecker class

}
