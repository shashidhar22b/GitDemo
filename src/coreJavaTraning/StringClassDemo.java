package coreJavaTraning;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1. String - it is one of the prebuilt class in java
		// this will create an object at the backend - hello
		//Define   //2. String Literal
					//3. Object of string
		
		String a= " Javatraining"; //2. String Literal
		
		String b= "Hello"; 
		String c= "Hello";// java will not create object for this, it will refer upper string - coz hello is same in above string
		
		String ab = new String("Hello2"); //3. Object of string
		String ac = new String("Hello2"); // this will create new object, will not refer upper string
		
		
		System.out.println(a.charAt(2));
		System.out.println(a.indexOf("o"));
		System.out.println(a.substring(2,5));
		System.out.println(a.substring(5));
		System.out.println(a.concat(" Program"));
		System.out.println(a.trim());
		a.toUpperCase();
		a.toLowerCase();
		String arr[] = a.split("t");
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(a.replace("a", "s"));
	}

}
