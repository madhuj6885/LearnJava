package com.wrapperclasspackages.class17;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {

	public static void main(String[] args) {

		
		ArrayList<Object> a = new ArrayList<>();
		
		a.add("Madhu");
		a.add("jesus");
		a.add("kumar");
		
		
		Iterator p = a.iterator();
		
		while (p.hasNext()) {
System.out.println(p.next());			
		}
		
	}

}
