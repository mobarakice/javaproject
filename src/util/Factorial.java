package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a number that you want to calculate factorial: ");
		int n = Integer.parseInt(br.readLine());
		
		 System.out.println(n+" factorial is "+calculateFactorialUsingRecursion(n));
		 calculateFactorial(n);

	}
	
	private static long calculateFactorial(int n){
		long result = 1;
		for(int i=1;i<=n;i++){
			result = result*i;
		}
		System.out.println(n+" factorial is "+result);
		return result;
	}
	
	// Calculate factorial by using recursion algorithms
	private static long calculateFactorialUsingRecursion(int n){
		if(n==0){ 
			return 1;
		}
		return n*calculateFactorialUsingRecursion(n-1);
	}

}
