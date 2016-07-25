package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PerfactNumberExample {

/**
 * 1. Enter a number
 * 2. Find all the factors and sum of all excluding itself
 * 3. If sum is equal to number then it is perfect number.
 * 4. Otherwise nope.
 **/
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		System.out.println("Enter a string to check palindrome: ");
//		int num = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=1000; i++){
			if(isPerfact(i)){
				System.out.println(i+" is  a perfact number!");
			}
		}
	
	}
	
	public static boolean isPerfact(int num){
		int sum = 0;
		for(int i=1;i<=num;i++){
			double factor = (double)num/i;
			if(factor==Math.ceil(factor)){
				sum = sum+(int)factor;
			}
		}
		sum = sum-num;
		if(num==sum){
			//System.out.println("Perfact Number");
			return true;
		}else{
			//System.out.println("Nope");
			return false;
		}
		
	}

}
