/*
 * Java LinkedHashSet class contains unique elements only like HashSet.
 * Java LinkedHashSet class provides all optional set operations and permits null elements.
 * Java LinkedHashSet class is non-synchronized.
 * Java LinkedHashSet class maintains insertion order.
*/
package com.collections;

import java.util.LinkedHashSet;

public class LinkedHasSetExample {

	public static void main(String[] args) {
		
		LinkedHashSet<String> linkedHasSet = new LinkedHashSet<>();
		linkedHasSet.add("one");
		linkedHasSet.add("two");
		linkedHasSet.add("three");
		linkedHasSet.add("four");
		linkedHasSet.add("five");
		linkedHasSet.add("six");
		linkedHasSet.add("1");
		linkedHasSet.add("@");
		linkedHasSet.add("+");
		linkedHasSet.add(null);
		linkedHasSet.add("one");

		linkedHasSet.forEach(name -> {
			System.out.println(name);
		});
		

	}

}
