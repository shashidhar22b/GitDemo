package coreJavaTraning;

public class ThisDemo {

	//global var
	int a =2;
	public void getData()
	{
		//local var
		int a = 3;
		int b = a+this.a;
		System.out.println(a);
		//THIS refer to current object , object code lies in class level
		System.out.println(this.a); // print the global var
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThisDemo t= new ThisDemo();
		t.getData();

	}

}
