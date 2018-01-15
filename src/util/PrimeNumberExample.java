package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumberExample {

	 
	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int num = 0;
		System.out.println("Enter a number: ");
		num = Integer.parseInt(br.readLine());
		//printAllPrimeNumberFromZeroToN(num);
//		if(isPrime(num)){
//			System.out.println(num+" is a prime.");
//		}else{
//			System.out.println(num+" is not a prime.");
//		}
		 System.out.println(checkPrime(num));
		 System.out.println(isPrime(num));
	}
	
	public static boolean checkPrime(int a){
		if(a==1 ||a== 0) return false;
		else if(a == 2) return true;
		else {
			for(int i=3; i<=a/2;i++){
				if(a%i==0) return false;
			}
		}
		return true;
		//for(int i=2;i)
	}
	
	
	public static boolean isPrime(int number){
		int count = 0;
		for(int i=1;i<=number; i++){
			if(number%i==0){
				count++;
			}
		}
		if(count==2){
			return true;
		}
		return false;
	}
	
	public static void printAllPrimeNumberFromZeroToN(int n){
		for(int j=2;j<=n;j++){
			if(isPrimeOrNot(j)){
				System.out.print(j+" ");
			} 
		}	
	}
	
	void printPrimeNumbersUpto(int n){
		int i;
		for(i=2;i<=n;i++){
			if(isPrimeOrNot(i)) System.out.println(i);
		}
	}
	static boolean isPrimeOrNot(int a){
		if(a==1) return false;
		if(a>2){
			int i;
			for(i=2; i<=a/2;i++){
				if(a%i == 0) return false;
			}
		}
		return true;
}

}
