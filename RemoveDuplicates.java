package week1.day2;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "We learn java basics as part of java sessions in java week1";
	
		String[] charArray = str.split(" ");
		
		int count = 1;
		
		for (int i = 0; i < charArray.length; i++) {
			for (int j = i+1; j < charArray.length; j++) {
				if (charArray[i].equalsIgnoreCase(charArray[j])) {
				count=count+1;
				if (count >1) {
					charArray[j] = " ";					
				}
				else
					count = 1;					
				}				
			}
			System.out.print(" " + charArray[i]);
		}
	}
}

		

	

	


