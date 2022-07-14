package week1.day2;

/* Pseudo Code:

 * Declare the input as Follow
  		String test = "I am a software tester"; 
a) split the words and have it in an array
b) Traverse through each word (using loop)
c) find the odd index within the loop (use mod operator)

d)split the words and have it in an array

e)print the even position words in reverse order using another loop (nested loop)
f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
 
*/


public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declaring the String whose second word to be reversed
		String test = "I evol java edoc using espilce";
		// Convert the string to word array
		String[] wordArray = test.split(" ");
		// Index the wordArray and traverse using for loop
		for (int i = 0; i < wordArray.length; i++) {
		// If the index value is odd (even word) then convert the word to char Array
			if (i%2 == 1) {
				char[] charArray = wordArray[i].toCharArray();
		// Traverse the charArray using for loop in reverse		
				for (int j = charArray.length-1; j >=0 ; j--) {
		// Print the word in reverse
					System.out.print(charArray[j]);														
				}
		// If the index is not odd then it will directly move to the even index and print the word
			}
			else {
				System.out.print(wordArray[i]);
			}
		// Printing an extra space out of the loop for readability in output
			System.out.print(" ");
		}		
	}
}
