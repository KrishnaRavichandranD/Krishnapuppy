package org.base;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;





public class Sample {
	public static void main(String[] args) {
//		InterFaceName objectRef=new ArrayList();
		
	List li =new ArrayList();
		
//	add the value
//	index value
	li.add(10);
	li.add("java");
	li.add(3456.76f);
	li.add(9876543212345l);
	li.add('A');
	
	System.out.println(li);
	
	li.add(100);
	li.add("java");
	
	System.out.println(li);
	
//	to find lenght of the list
	int size = li.size();
	System.out.println(size);
	
//	toget a particular value for a given index
	Object object = li.get(3);
	System.out.println(object);
	System.out.println(li.get(1));
	
//	to remove a particular value from the list
	li.remove(4);
	System.out.println(li);
	
//	replace the value
	li.set(4, "selenium");
	System.out.println(li);
	
//	used to check the value is present or not
	boolean contains = li.contains("java");
	System.out.println(contains);
	
//	to get the index of the particular character
	int indexOf = li.indexOf("java");//first occurence
	System.out.println(indexOf);
	
	int lastIndexOf = li.lastIndexOf("java");
	System.out.println(lastIndexOf);
	
	int indexOf2 = li.indexOf("jack");
	System.out.println(indexOf2);
	
//	to check the list is empty or not
	boolean empty = li.isEmpty();
	System.out.println(empty);
	System.out.println("*******************************");
	System.out.println("normal for loop");
	
//	to iterate the list
	
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
		
		
	}System.out.println("******************************");
	System.out.println("enhanced for loop");
	
	for (Object x: li) {
		System.out.println(x);
		
	}
	
		
	}private void tc01() {
		System.out.println("jgf");

	}
	
	}


