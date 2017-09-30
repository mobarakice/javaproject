package utilexample;

public class Gcd {

	public static int first(int a, int b){
		if(b==0 || a<0){
			return a;
		}else{
			return second(b,a-b);
		}
	}
	public static int second(int a, int b){
		if(a==0 || b<0){
			return b;
		}else{
			return first(b,a);
		}
	}
	public static void main(String[] args) {
		System.out.println(gcdRecursiveMethod(42,56));
		System.out.println(gcdDivisibleMethod(42,56));
		System.out.println(gcdSubtractMethod(42,56));

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


}
