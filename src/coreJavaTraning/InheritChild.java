package coreJavaTraning;

public class InheritChild extends InheritParent {

	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("engine code in child");
	}
	
	public void brakes() {
		// TODO Auto-generated method stub
		System.out.println("brakes code in parent");
	}
	
	public void color() {
		// TODO Auto-generated method stub
		System.out.println(color);
	}
	
	
	
	//funtional overloading
	//multiple methods can have same name but
	//either argument count should be diff or argument return/datatype should be different
	public void getData(int a) {
		
	}
	public void getData(String a) {
		
	}
	public void getData(int a,int b) {
		
	}
	
	
	public void audioSystem() {
		// TODO Auto-generated method stub
		System.out.println("audioSystem code in child");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InheritChild a = new InheritChild();
		a.color();
		a.brakes();
		//funtional overloading
		a.getData(2);
		a.getData("hello");
		a.getData(3, 4);
		
		a.audioSystem();//both parent and child have same method and same sign, same parameter

	}

}
