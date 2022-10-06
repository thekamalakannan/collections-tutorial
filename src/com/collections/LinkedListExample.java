/*
 * Java LinkedList class can contain duplicate elements.
 * Java LinkedList class maintains insertion order.
 * Java LinkedList class is non synchronized.
 * In Java LinkedList class, manipulation is fast because no shifting needs to occur.
 * Java LinkedList class can be used as a list, stack or queue.
*/
package com.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {

		// Creating Array List
		LinkedList<String> aList = new LinkedList<>();
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
