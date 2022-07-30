package week3.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionPrintDuplicateValueinArray {

	public static void main(String[] args) {

	//Declare an input array of integers from which Dups to be printed
	int[] arr = {14,12,12,12,13,11,15,14,18,16,17,19,18,17,20};
		
	//Instantiate a new list
	List<Integer> list=new ArrayList<Integer>();
	
	//Iterate the list to find the Duplicate with 2 for loops
	for (int i = 0; i < arr.length-1; i++) {
		for (int j = i+1; j < arr.length-1; j++) {
			if(arr[i]==arr[j]) {
				list.add(arr[i]);
								
			}
		}		
	}
	//print the list with duplicates entries
	System.out.println("Duplicate numbers in list are:"+list);
	
	//Converting the list to Set for removing duplicate entries in the result
	
	Set<Integer> setConverted = new TreeSet<Integer>(list);
	
	//Printing the result 
	System.out.println("Duplicate numbers are:"+setConverted);			
	
	}

}
