package coreJavaTraning;

public class AbtractChildAircraft extends AbstractAircraft {

	// mandtory add un implemented methods
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AbtractChildAircraft c = new AbtractChildAircraft();
		c.bodycolor();
		c.safetyGuidline();
		c.engine();
		
		//you cannot instaniate the abstract class
		//AbstractAircraft bc = new AbstractAircraft();
	}

	@Override
	public void bodycolor() {
		// TODO Auto-generated method stub
		System.out.println("red color on the child");
	}

}
