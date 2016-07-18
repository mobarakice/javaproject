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
		printAllPrimeNumberFromZeroToN(num);
//		if(isPrime(num)){
//			System.out.println(num+" is a prime.");
//		}else{
//			System.out.println(num+" is not a prime.");
//		}
		 
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
			if(isPrime(j)){
				System.out.println(j+" is a prime.");
			} 
		}
		
	}

}
