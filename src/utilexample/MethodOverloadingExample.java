package utilexample;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		 Cycle myCycle = new Cycle();
		 myCycle.printInfo();
		 
		 Cycle c1 = new ByCycle();
		 c1.printInfo();
	}

}

class Cycle{
	String type = "All type of cycle here";
	public void printInfo(){
		System.out.println(type);
	}
}

class ByCycle extends Cycle{
	String bye = "ByCycle here";
	@Override
	public void printInfo() {
		System.out.println(bye); 
	}
}

class GearCycle extends Cycle{
	String gear = "GearCycle here";
	@Override
	public void printInfo() {
		System.out.println(gear);
	}
}
