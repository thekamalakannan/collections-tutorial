/*
 * Java TreeMap contains values based on the key. It implements the NavigableMap interface and extends AbstractMap class.
 * Java TreeMap contains only unique elements.
 * Java TreeMap cannot have a null key but can have multiple null values.
 * Java TreeMap is non synchronized.
 * Java TreeMap maintains ascending order.
*/
package com.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		TreeMap<Integer, String> treeMapObj = new TreeMap<>();
		treeMapObj.put(1, "one");
		treeMapObj.put(2, "two");
		treeMapObj.put(3, "three");
		treeMapObj.put(4, "four");
		treeMapObj.put(5, "five");
		treeMapObj.put(6, "six");
		treeMapObj.put(7, "1");
		treeMapObj.put(8, "@");
		treeMapObj.put(9, "+");
		treeMapObj.put(10, null);
		treeMapObj.put(11, null);
        //		treeMapObj.put(null, null); 
		treeMapObj.put(2, "one");  // Updated on key
		
		for(Map.Entry m : treeMapObj.entrySet()) {
			System.out.println(m.getKey() +" " +m.getValue());
		}



	}

}
