package utilexample;

public class A extends B{
	
	@Override
	public void print() {
		
		System.out.println("This is base class A");
		super.print();
	}
 
	public static void main(String[] args) {
		 
		C c = new C();
		B b = new B();
		A a = new A();
		
//		a.print();
//		a.age = 10;
//		a.name = "ABC";
//		
//		b.print();
//		b.age = 12;
//		b.name = "B";
//		b.printName();
//		
//		c.name = "C";
//		c.print();
		
		A a1 = new A();
		//A a2 = (A) new B();//throws classCustException
		
		B b1 = new A();
		B b2 = new B();
		//B b3 = (B)new C();//throws classCustException
		
		C c1 = new A();
		C c2 = new B();
		C c3 = new C();
		
		c1.print();
//		c2.print();
//		c3.print();
	}
	

}

class B extends C{
	public int age;
	
	@Override
	public void print() {
		System.out.println("This is base class B");
		super.print();
	}
	public void printName(){
		System.out.println("The the name is B");
	}
	
	
}

class C{
	public String name;
	private int rolNo;
	
	public void print(){
		System.out.println("This is base class C");
		printName();
	}
	private void printName(){
		System.out.println("The the name is C");
	}
}
