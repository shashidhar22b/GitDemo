package coreJavaTraning;

public class ContructorDemo {
	
	//diff b/w methods and contructor
	//Contructor doesnot return values
	//Contructor should always have class name
	
	//Contructor
	public  ContructorDemo()
	{
		System.out.println("I m in Constructor");
	}
	//parametermized contructors
	public  ContructorDemo(int a, int b)
	{
		int c = a+b;
		System.out.println("I m in parametermized Constructor");
		System.out.println(c);
	}
	public  ContructorDemo(String str)
	{
		System.out.println(str);
	}
	
	//Method
	public void getData()
	{
		System.out.println("I m in method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Compiler will call implicit contructor if you are not defined any constructor block
		//Constructor is block of code when an object is created
		ContructorDemo c = new ContructorDemo();
		//whenever you create an object contructor is called
		ContructorDemo d = new ContructorDemo(4,5);
		ContructorDemo s = new ContructorDemo("Hello");
		
	}

}
