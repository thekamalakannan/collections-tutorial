/*
 * -----        Points to remember       -----

 * 
 * Java LinkedHashMap contains values based on the key.
 * Java LinkedHashMap contains unique elements.
 * Java LinkedHashMap may have one null key and multiple null values.
 * Java LinkedHashMap is non synchronized.
 * Java LinkedHashMap maintains insertion order.
 * The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
 * 
*/
package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHasMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String> linHasSet = new LinkedHashMap<>();
		linHasSet.put(1, "one");
		linHasSet.put(2, "two");
		linHasSet.put(3, "three");
		linHasSet.put(4, "four");
		linHasSet.put(5, "five");
		linHasSet.put(6, "six");
		linHasSet.put(7, "1");
		linHasSet.put(8, "@");
		linHasSet.put(9, "+");
		linHasSet.put(10, null);
		linHasSet.put(null, null);
		linHasSet.put(2, "one");

		for(Map.Entry m : linHasSet.entrySet()) {
			System.out.println(m.getKey() +" " +m.getValue());
		}

		
	}

}
