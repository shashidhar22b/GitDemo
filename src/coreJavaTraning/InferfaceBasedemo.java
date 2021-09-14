package coreJavaTraning;

public class InferfaceBasedemo implements InterfaceDemo,InterfaceDemotwo {

	//Interface will forcely implements all the methods from InterfaceDemo
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceDemo a = new InferfaceBasedemo();
		a.greenGo();
		a.yellowFlash();
		a.redStop();
		
		InferfaceBasedemo at = new InferfaceBasedemo();
		at.walkonSymbol();
		
		InterfaceDemotwo b = new InferfaceBasedemo();
		b.trainSymbol();

	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println("Green implemented");
	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println("Red implemented");
	}

	@Override
	public void yellowFlash() {
		// TODO Auto-generated method stub
		System.out.println("Yellow implemented");
	}
	
	public void walkonSymbol()
	{
		System.out.println("Walking");
	}

	@Override
	public void trainSymbol() {
		// TODO Auto-generated method stub
		System.out.println("Train");
	}

}
