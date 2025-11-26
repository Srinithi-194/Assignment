package com.mph.MavenProject9;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class DemoOnLinkedList {
	
	public static void main(String args[]) {
		LinkedList<Integer> ll=new LinkedList<Integer>();
		ll.add(45);
		ll.add(34);
		ll.add(12);
		ll.add(23);
		ll.add(89);
		Iterator<Integer> itr=ll.descendingIterator();
	
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(ll.offer(97));
		System.out.println(ll);
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println(ll.peekLast());  
		System.out.println(ll.poll());
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println(ll);
	}

}
