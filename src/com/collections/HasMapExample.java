/*
 * Java LinkedHashMap contains values based on the key.
 * Java LinkedHashMap contains unique elements.
 * Java LinkedHashMap may have one null key and multiple null values.
 * Java LinkedHashMap is non synchronized.
 * Java LinkedHashMap maintains insertion order.
 * The initial default capacity of Java HashMap class is 16 with a load factor of 0.75.
*/
package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HasMapExample {
	
	public static void main(String[] args) {
		
		HashMap<Integer, String> hasMapObj = new HashMap<>();
		hasMapObj.put(1, "one");
		hasMapObj.put(2, "two");
		hasMapObj.put(3, "three");
		hasMapObj.put(4, "four");
		hasMapObj.put(5, "five");
		hasMapObj.put(6, "six");
		hasMapObj.put(7, "1");
		hasMapObj.put(8, "@");
		hasMapObj.put(9, "+");
		hasMapObj.put(10, null);
		hasMapObj.put(11, null);
		hasMapObj.put(null, null);  // Null values Removed
		hasMapObj.put(2, "Dhilip"); // 
		
		for(Map.Entry m : hasMapObj.entrySet()) {
			System.out.println(m.getKey() +" " +m.getValue());
		}
		
	}

}
