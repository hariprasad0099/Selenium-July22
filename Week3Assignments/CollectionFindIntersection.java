package week3.Assignments;

import java.util.ArrayList;
import java.util.List;

public class CollectionFindIntersection {

	public static void main(String[] args) {

		
		//Declare Arrays from which intersection needs to be found
		int[] arr1 = {1,2,100,4,5,6};
		int[] arr2 = {4,5,6,7,8,9};
		
		//Declaring two empty list
		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		
		//iterate the arr1 and store as list1
		for (int i = 0; i < arr2.length; i++) {
			list1.add(arr1[i]);
			
		}
		System.out.println("arr1 is now converted as list --> " + list1);

		//iterate the arr2 and store as list2

		for (int j = 0; j < arr2.length; j++) {
			list2.add(arr2[j]);			
		}
		System.out.println("arr2 is now converted as list --> " + list2);
		
		//Using retainAll method find the intersection value and print
		list1.retainAll(list2);
		System.out.println(list1);
					
		}
	
	}
///Doubt :- How to store the intersection value in a different list as list3

