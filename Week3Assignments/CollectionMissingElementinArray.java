package week3.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMissingElementinArray {

	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		
		List<Integer> list1 = new ArrayList<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			list1.add(arr[i]);
			Collections.sort(list1);
			
		}
		
		System.out.println(list1);
		
		for (int j = 1; j < arr.length; j++) {
			
			int x = list1.get(j-1);
			
			if(j != x) {		
		System.out.println(j);
		break;
		
			}
		}



	}

}
