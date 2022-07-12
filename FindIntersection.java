package week1.day2;

public class FindIntersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Declare array1 and array1
		int arr1 [] = {1,2,3}; //{3,2,11,4,6,7};
		int arr2 [] = {3,4,5}; //{1,2,8,4,9,7};
		
		System.out.print("The common numbers in both the arrays are  ");
		
		//iterate array 1
		for (int i = 0; i < arr1.length; i++) {
			 //System.out.println(arr1[i]);
		//iterate array 2
			for (int j = 0; j < arr2.length; j++) {
		//Comparing the arr1 with arr2 for same values and store the result
				
				if (arr1[i] == arr2[j]) { 
					 int result =  arr2[j];
					 
		//Print the result 			 
					 System.out.print(result+" , ");
					 
				 }			
			}
			 
		}


	}

}
