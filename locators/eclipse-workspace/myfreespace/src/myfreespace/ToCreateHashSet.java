package myfreespace;

import java.util.HashSet;

public class ToCreateHashSet {
	public static void main(String[] args) {
		HashSet h = new HashSet();
		h.add(100);
		h.add("balasai");
		h.add(007);
		h.add('d');
		h.add(true);
		h.add(null);
		h.add(5.55);
		h.add(123456789);
		h.add(100); // duplicate values are not allowed in hashset, it should be avoid in console
		
		System.out.println(h);
		System.out.println(h.size());
		
		for(Object a :h) {
			System.out.println(a);
		}
	}

}
