/*
 * Java ArrayList class can contain duplicate elements.
 * Java ArrayList class maintains insertion order.
 * Java ArrayList class is non synchronized.
 * Java ArrayList allows random access because the array works on an index basis.
 * In ArrayList, manipulation is a little bit slower than the LinkedList in Java because a lot of shifting needs to occur if any element is removed from the array list.
*/
package com.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListExample {

	public static void main(String args[]) {
		
		// Creating Array List
		ArrayList<String> aList = new ArrayList<>();
		aList.add("one");
		aList.add("two");
		aList.add("three");
		aList.add("four");
		aList.add("five");
		aList.add("six");
		aList.add(null);

		
		aList.forEach( name -> {
			System.out.println(name);
		});
		
		
	}

}
