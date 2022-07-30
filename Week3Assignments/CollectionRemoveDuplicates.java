package week3.Assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class CollectionRemoveDuplicates {

	public static void main(String[] args) {
		//Declare a string in which dups to be removed
		String text = "We learn java basics as part of java sessions in java week1";

		//Split the string and create a string array
		String[]str=text.split(" ");
		
		//create an empty set to  
		Set<String> dupRemoved=new LinkedHashSet<String>();
        
		//Iterate the string array and add the word in set
		
		for (int i = 0; i < str.length; i++) {
			dupRemoved.add(str[i]);
            }
		
		//print the value 
		System.out.println(dupRemoved);
		}

	}


