package coreJavaTraning;

public abstract class AbstractAircraft {

	//A class which is declared with the abstract keyword is known as an abstract class in Java. 
	//It can have abstract and non-abstract methods (method with the body).
	//A method which has abstract method , even the class should be abstract
	
	public void engine()
	{
		System.out.println("follow engine guildlines");
	}
	
	public void safetyGuidline()
	{
		System.out.println("follow safety guildlines");
	}
	
	public abstract void bodycolor();
	
	
}
