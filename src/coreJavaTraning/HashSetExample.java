package coreJavaTraning;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashset,treeset, linkedhashset implements set interface
		//doesnot accept duplicate value
		//stores in ramdom order on gauranty in sequence order
		
		HashSet<String> hs = new HashSet<String>();
		hs.add("usa");
		hs.add("uk");
		hs.add("india");
		hs.add("india");
		hs.add("in");
		hs.add("ind");
		hs.add("indi");
		System.out.println(hs);
		System.out.println(hs.remove("uk"));
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
		
		Iterator<String> i =hs.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
			
		}
		
		

	}

}
