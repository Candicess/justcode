package com.iterator.enumeration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class Main {

	public static void main(String[] args) {
		
		List<String> lists = new ArrayList<String>();
		
		Vector<String> vec = new Vector<String>();
		
		Iterator<String> iterator = lists.iterator();
		
		lists.add("hello");
		
		System.out.println(iterator.hasNext());

	}

}
