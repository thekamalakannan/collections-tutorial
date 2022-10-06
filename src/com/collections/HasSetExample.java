/*
 * HashSet stores the elements by using a mechanism called hashing.
 * HashSet contains unique elements only.
 * HashSet allows null value.
 * HashSet class is non synchronized.
 * HashSet doesn't maintain the insertion order. Here, elements are inserted on the basis of their hashcode.
 * HashSet is the best approach for search operations.
 * The initial default capacity of HashSet is 16, and the load factor is 0.75.
*/
package com.collections;

import java.util.HashSet;

public class HasSetExample {

	public static void main(String[] args) {
		
		HashSet<String> hasSetList = new HashSet<>();
		hasSetList.add("one");
		hasSetList.add("two");
		hasSetList.add("three");
		hasSetList.add("four");
		hasSetList.add("five");
		hasSetList.add("six");
		hasSetList.add("1");
		hasSetList.add("@");
		hasSetList.add("+");
		hasSetList.add(null);
		hasSetList.add("one");
		
		hasSetList.forEach( name -> {
			System.out.println(name);
		});

	}

}
