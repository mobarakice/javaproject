package utilexample;

public class Gcd {

	public static void main(String[] args) {
		System.out.println("GCD: "+gcdRecursiveMethod(42,56));
		System.out.println("GCD: "+gcdDivisibleMethod(42,56));
		System.out.println("GCD: "+gcdSubtractMethod(42,56));
		System.out.println("LCM: "+lcm(21,6));

	}
	
	// Greatest common divisor
	public static int gcdRecursiveMethod(int a, int b){
		if(b==0){
			return a;
		}else{
			return gcdRecursiveMethod(b,a%b);
		}
	}
	public static int gcdDivisibleMethod(int a, int b){
		while(b>0){
			int temp = b;
			b = a%b;
			a= temp;
		}
		return a;
	}
	public static int gcdSubtractMethod(int a, int b){
		while(a != b){
			if(a>b){
				a = a-b;
			}else{
				b = b-a;
			}
		}
		return a;
	}
 // Least common divisor
	public static int lcm(int a, int b){
		return a*(b/gcdRecursiveMethod(a,b));
	}

}
