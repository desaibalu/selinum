package myfreespace;

import java.util.TreeSet;

public class ToCreateTreeSet {
public static void main(String[] args) {
	TreeSet t = new TreeSet();
	t.add(10);
	t.add(100);
	t.add(50);
	t.add(90);
	t.add(30);
	t.add(1000);
	t.add(100); // duplicate should be avoided in console
	t.add(45);
	
	System.out.println(t);
	
	for(Object q:t) {   // for each loop to use get method "q" is reference variable for "t"
		System.out.println(q);
	}
}
}
