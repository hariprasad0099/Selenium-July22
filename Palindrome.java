package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare the string to check if it is palindrome
		String str1 = "Tamil";
		//Declare an empty string to reverse and store the original string
		String str2 = "";
		//Convert the string into Character array
		char[] charArray1 = str1.toCharArray();
		//Traverse through the Character array from the last and store the reverse value in string 2
		for (int i = charArray1.length-1; i >=0; i--) {
			str2 = str2 + charArray1[i];					
		}
		//Print the reversed string
		System.out.println("The reverse of the String is  : " + str2);
		//Compare the orignal string with the reverse string
		//If the both the string are same ignoring the case then it is a palindrome
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("The given string is a palindrome");
		}
                //If the both the string are not same ignoring the case then it is not a palindrome
		else {
			System.out.println("Not palindrome");
		}

	}
	

}
