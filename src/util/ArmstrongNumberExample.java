package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ArmstrongNumberExample {

/*
 * 1. Enter a number
 * 2. Find the length(convert to string to find length)
 * 3. Calculate power length of each digit and sum of all.
 * 4. If original number is equal to the sum
 * 5. then it is Armstrong number
 * 6. otherwise nope.
 */
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string to check palindrome: ");
		int num = Integer.parseInt(br.readLine());
		isArmstrong(num);

	}
	
	public static void isArmstrong(int num){
		int temp = num;
		String s = Integer.toString(num);
		int length = s.length();
		int sum=0;
		
		while(temp != 0){
			int digit = temp%10;
			sum = sum+(int)Math.pow(digit, length);
			temp = temp/10;
		}
		if(num==sum){
			System.out.println("Armstrong Number");
		}else{
			System.out.println("Nope");
		}
	}

}
