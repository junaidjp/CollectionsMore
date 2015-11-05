package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListCustom {

public static void main(String[] args) {
		
		List<Student> arrayList = new ArrayList<Student>();
		Student student1 = new Student("Duncan", "Collections");
		arrayList.add(student1);
		
		//Student student2 = new Student("Ahad","SpringMVC");
		arrayList.add(new Student("Ahad","SpringMVC"));
		
		
		arrayList.add(new Student("Ahad","Spring MVC"));
		arrayList.add(new Student("KrishnaVeni","WEB services"));
		arrayList.add(new Student("Modi","Struts Framework"));
		arrayList.add(new Student("Jpasha","JMS "));
		//linkedList.add(null);
		
		
		for(int i = 0 ; i < arrayList.size(); i ++ ) { 
			System.out.println(arrayList.get(i).getName());
		}
	
	
}
}