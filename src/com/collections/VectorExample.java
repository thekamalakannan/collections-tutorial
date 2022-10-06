/*
 * Vector is like the dynamic array which can grow or shrink its size.
 * Unlike array, we can store n-number of elements in it as there is no size limit.
 * 
 * Vector is synchronized.
 * Java Vector contains many legacy methods that are not the part of a collections framework.
*/

package com.collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> vectorList = new Vector<>();
		vectorList.add("one");
		vectorList.add("two");
		vectorList.add("three");
		vectorList.add("four");
		vectorList.add("five");
		vectorList.add("six");
		vectorList.add(null);
		
        System.out.println("Size is: "+vectorList.size());  
        System.out.println("Default capacity is: "+vectorList.capacity());  
        
        vectorList.addElement("Rat");  
        vectorList.addElement("Cat");  
        vectorList.addElement("Deer");  
        
        System.out.println("Size after addition: "+vectorList.size());  
        System.out.println("Capacity after addition is: "+vectorList.capacity());  
        
		
		vectorList.forEach(name -> {
			System.out.println(name);
		});
		

	}

}
