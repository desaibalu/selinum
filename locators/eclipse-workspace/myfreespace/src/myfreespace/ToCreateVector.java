package myfreespace;

import java.util.Vector;

public class ToCreateVector {
public static void main(String[] args) {
	Vector v = new Vector();
	v.add(100);
	v.add("balasai");
	v.add(007);
	v.add('d');
	v.add(true);
	v.add(null);
	v.add(5.55);
	v.add(123456789);
	
	System.out.println(v);
	System.out.println(v.size());
	System.out.println(v.isEmpty());
	
	for(int a=0;a<=v.size();a++) {
		System.out.println(v.get(a));
	}
}
}
