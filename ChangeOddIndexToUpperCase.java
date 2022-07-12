package week1.day2;

import java.util.Iterator;

public class ChangeOddIndexToUpperCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Declare a string
		String str = "hari"; 
		
//Coverted char Array and assigned to a variable
		char[] charArray = str.toCharArray(); 	
		
//Index the array in loop
		for (int i = 0; i < charArray.length; i++) { 
			char indexChar = charArray[i];
			
//Finding the odd index and changing to UpperCase
			if(i%2 != 0) { 
				indexChar = Character.toUpperCase(indexChar);
				
//System.out.println(indexChar);
				
			}
//print the out put with odd index as uppercase and even index as lowerCase
			System.out.print("  " + indexChar);
			

	}

}
}

