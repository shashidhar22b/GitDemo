package coreJavaTraning;

public class SuperChildDemo extends SuperParentDemo {
	
	String name = "Academy";
	public void getStringData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getData()
	{
		super.getData();
		System.out.println("I m class class");
	}

	public SuperChildDemo()
	{
		super(); // its should always be at first line in child
		System.out.println("Child class contructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SuperChildDemo cd = new SuperChildDemo();
		cd.getStringData();
		cd.getData();
	}

}
