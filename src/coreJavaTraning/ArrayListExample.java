package coreJavaTraning;

import java.util.ArrayList;

public class ArrayListExample {

	//list - can accept duplicate values
	//Array has fixed size, Arraylist can grow dynamically
	//you can access and insert in any index
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<String>();
		a.add("sam");
		a.add("java");
		a.add("java");
		System.out.println(a);
		a.add(0,"Student");
		System.out.println(a);
		//a.remove(1);
		//System.out.println(a);
		//a.remove("java");
		//System.out.println(a);
		
		System.out.println(a.get(0));
		
		System.out.println(a.contains("testing"));
		System.out.println(a.indexOf("sam"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	}

}
