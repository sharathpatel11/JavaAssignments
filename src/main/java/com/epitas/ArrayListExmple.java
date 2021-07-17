package com.epitas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class ArrayListExmple {
	
	
	private String getfName() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getlName() {
		// TODO Auto-generated method stub
		return null;
	}
	private void setfName(String string) {
		// TODO Auto-generated method stub
		
	}

	

	public static void main(String[] args) {
		List<ArrayListExmple> list = new ArrayList<>();
		ArrayListExmple p1 = new ArrayListExmple();
	    p1.setfName("a");
	    p1.setfName("x");
	    list.add(p1 );

	    ArrayListExmple p4 = new ArrayListExmple();
	    p4.setfName("b");
	    p4.setfName("z");
	    list.add(p4);

	    ArrayListExmple p3 = new ArrayListExmple();
	    p3.setfName("a");
	    p3.setfName("z");
	    list.add(p3);

	    ArrayListExmple p2 = new ArrayListExmple();
	    p2.setfName("a");
	    p2.setfName("y");
	    list.add(p2);

	    //sort by a single field
	    Collections.sort(list, (o1,o2) ->  o1.getfName().compareTo(o2.getfName()));

	    //sort by multiple cascading comparator.
	    Collections.sort(list, Comparator.comparing(ArrayListExmple::getfName).thenComparing(ArrayListExmple::getlName));
	    list.forEach( System.out::println);

	    
	}

	
}
