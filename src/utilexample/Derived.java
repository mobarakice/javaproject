package utilexample;

public class Derived extends Base{
	
	static{
		System.out.println("Derived static block");
	}
	{
		System.out.println("Derived instance block");
	}
	public Derived(){
		System.out.println("Derived constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Main Method");
		Derived d = new Derived();

	}

}
