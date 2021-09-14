package coreJavaTraning;

public class FirstClass {

	
	int a = 5;
	//Methods --- a block of statements that has a name and can be executed by calling (also called invoking) it from some other place in your program
	public void getdata()
	{
		System.out.println("I'am in method");
		//return "Hello";
	}
	
	//Objects ---- instance/refereneces of the class
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create an object of the class
		FirstClass fn = new FirstClass();
		fn.getdata();
		System.out.println(fn.a);
		
		SecondClass sn = new SecondClass();
		sn.setData();
		
		
		System.out.println("Hi");
		System.out.println("Hello World");
		System.out.println("Hello");
		System.out.println("Hell");
		//System.out.println(a);

	}

}
