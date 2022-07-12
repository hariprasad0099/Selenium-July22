package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Tamil";
		String str2 = "";
		char[] charArray1 = str1.toCharArray();
		for (int i = charArray1.length-1; i >=0; i--) {
			str2 = str2 + charArray1[i];					
		}
		System.out.println("The reverse of the String is  : " + str2);
		
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("The given string is a palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}

	}
	

}
