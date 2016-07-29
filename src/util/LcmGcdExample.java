package util;

import java.util.Scanner;

public class LcmGcdExample {


	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number that you want to calculate GCD: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		gcdCalculator(a, b);
		gcdRecursive(a, b);
		//lcmCalculator(a, b);
		

	}


    public static int lcm(int bigNumber, int smallNumber){
    	if(bigNumber<= smallNumber){
    		return -1;
    	}
    	int lcm = 0;
    	if(bigNumber%smallNumber==0){
			lcm = bigNumber;
		}else{
			int factor = 2;
			boolean foundLCM = false;
			while(!foundLCM){
				int multiple = bigNumber*factor;
				if(multiple%smallNumber==0){
					lcm = multiple;
					foundLCM = true;
				}
				factor++;
			}
		}
			return lcm;
    }
	
    public static int lcmCalculator(int a,int b){
		int lcm=0;
		if(a==0 || b==0){
			lcm = 0;
		}else{
			if(a>b){
				/*if(a%b==0){
					lcm = a;
				}else{
					int factor = 2;
					boolean foundLCM = false;
					while(!foundLCM){
						int multiple = a*factor;
						if(multiple%b==0){
							lcm = multiple;
							foundLCM = true;
						}
						factor++;
					}
				}*/
				lcm = lcm(a, b);

			}else if(a<b){
				/*if(b%a==0){
					lcm = b;
				}else{
					int factor = 2;
					boolean foundLCM = false;
					while(!foundLCM){
						int multiple = b*factor;
						if(multiple%a==0){
							lcm = multiple;
							foundLCM = true;
						}
						factor++;
					}
				}*/
				lcm = lcm(b, a);

			}else{
				lcm = a;
			}
		}

		System.out.println("LCM is "+lcm);
		return lcm;

	}

	public static int gcdCalculator(int a,int b){

		int gcd = 0;
		if(a==0 || b==0){
			gcd = 0;
		}else{
			if(a<b){
				for(int i =b; i>0;i--){
					if(a%i==0 && b%i==0){
						gcd=i;
						break;
					}
				}
			}else if(a>b){
				for(int i =a; i>0;i--){
					if(a%i==0 &&b%i==0){
						gcd=i;
						break;
					}
				}
			}else{
				gcd=a;
			}
		}
		System.out.println("GCD is "+gcd);

		return gcd;

	}

	public static int gcdRecursive(int a, int b){
		int gcd=0;
		if(a==0 && b !=0){
			gcd=b;
		}else if(a != 0 && b==0){
			gcd = a;
		}else if(a==0&&b==0){
			gcd=0;
		}else{
			if(a>b){
				 gcd = GCD(a, b);
			}else{
				gcd = GCD(b,a);
			}
		}
		System.out.println("\n\nGCD is "+gcd);
		return gcd;
	}
	public static int GCD(int big,int small){
		int temp=0;
		while(small != 0){
			temp = small;
			small = big%small;
			big = temp;
		}
		return big;
	}
}
