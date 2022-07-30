package week3.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class CollectionsFindSecondLargest {

	public static void main(String[] args) {
		//Declare and Array
		int[] arr1 = {11,13,14,98,100,344,13};
		//Instantiate a Treeset set1		
		Set<Integer> set1 = new TreeSet<Integer>();
		//Iterate the value of arr1 and store it in the set1		
		for (int i = 0; i < arr1.length; i++) {
			set1.add(arr1[i]);			
		}
		//Convert the list into Set
		List<Integer> list1 = new ArrayList<Integer>(set1);
		//Sort the new list
		Collections.sort(list1);
		//Print the second largest value
		System.out.println(list1.get(1));

	}

}
