/*
 * A Hashtable is an array of a list. Each list is known as a bucket. The position of the bucket is identified by calling the hashcode() method. A Hashtable contains values based on the key.
 * Java Hashtable class contains unique elements.
 * Java Hashtable class doesn't allow null key or value.
 * Java Hashtable class is synchronized.
 * The initial default capacity of Hashtable class is 11 whereas loadFactor is 0.75.
*/
package com.collections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> hasTableObj = new Hashtable<>();
		hasTableObj.put(1, "one");
		hasTableObj.put(2, "two");
		hasTableObj.put(3, "three");
		hasTableObj.put(4, "four");
		hasTableObj.put(5, "five");
		hasTableObj.put(6, "six");
		hasTableObj.put(7, "1");
		hasTableObj.put(8, "@");
		hasTableObj.put(9, "+");
//		hasTableObj.put(10, null);
//		hasTableObj.put(null, null);
		hasTableObj.put(2, "one");

		for(Map.Entry m : hasTableObj.entrySet()) {
			System.out.println(m.getKey() +" " +m.getValue());
		}


	}

}
