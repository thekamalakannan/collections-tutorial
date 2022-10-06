package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;
import java.util.Vector;

public class TestJavaCollections {

	public static void main(String args[]) {

		// Array List Example
		List<String> list1 = new ArrayList<>();
		list1.add("Lokesh");
		list1.add("Dhilip");
		list1.add("Gokul");
		list1.add("Kaviarasan");
		Iterator itr = list1.iterator();
		System.out.println();
		while (itr.hasNext()) {
			System.out.println(":=> " + itr.next());
		}

		// Linked List Example
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		Iterator<String> itr1 = al.iterator();
		System.out.println();
		while (itr1.hasNext()) {
			System.out.println(":==>" + itr1.next());
		}

		// Vector Example
		Vector<String> v = new Vector<String>();
		v.add("Ayush");
		v.add("Amit");
		v.add("Ashish");
		v.add("Garima");
		Iterator<String> itr2 = v.iterator();
		System.out.println();
		while (itr2.hasNext()) {
			System.out.println(":===>" + itr2.next());
		}

		// Vector Example
		Stack<String> stack = new Stack<String>();
		stack.push("Ayush");
		stack.push("Garvit");
		stack.push("Amit");
		stack.push("Ashish");
		stack.push("Garima");
		stack.pop();
		Iterator<String> itr3 = stack.iterator();
		System.out.println();
		while (itr3.hasNext()) {
			System.out.println(":====>"+itr3.next());
		}
		
		
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("Amit Sharma");  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");
		System.out.println();
		System.out.println("Head: "+queue.element());
		System.out.println("Head: "+queue.peek());
		
		System.out.println("Iterating the queue element ");
		Iterator itr4 = queue.iterator();
		while(itr4.hasNext()) {
			System.out.println(itr4.next());
		}
		
		queue.remove();
		queue.poll();
		System.out.println();
		System.out.println("after removing two elements:");
		Iterator<String> itr5 = queue.iterator();  
		while(itr5.hasNext()){  
		System.out.println(itr5.next());  
		}

	}

}
