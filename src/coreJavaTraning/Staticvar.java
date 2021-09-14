package coreJavaTraning;

public class Staticvar {
	
	//Instance var
	String name;
	String address;
	static String city; // Static will use same data throughout the program, value will not change, this will not create new memory in heap 
	static int i;
	int b =0;
	
	static
	{
		city = "bangalore";
		i = 0;
		
	}
	
	//need not to create var for static data
	public Staticvar(String name,String address ) //local var
	{
		this.name=name;
		this.address=address;
		i++;
		System.out.println(i);
		b++;
		System.out.println(b); // it is not static, it freshly access new var everytime
		
	}
	
	public void getAddress()
	{
		System.out.println(address+" "+city);
	}
	
	public static void getCity()
	{
		//it will accept only static variable
		System.out.println(city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Staticvar obj = new Staticvar("sam","rayapuram");
		Staticvar ob = new Staticvar("ram","jayanagar");
		obj.getAddress();
		ob.getAddress();
		Staticvar.getCity(); // all static method can be accessed by classname.methodname
		Staticvar.i=3;
		
		obj.address="xyz";

	}

}
