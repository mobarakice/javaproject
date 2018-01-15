package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
 * 1. Enter a string or number
 * 2. Do reverse that number or string
 * 3. if original string or number is equal to reverse
 * 4. then it Palindrome otherwise nope.
 */

public class PalindromeExample {

	 
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string to check palindrome: ");
		String palindrome = br.readLine();
		isPalindrome(palindrome);
		
		System.out.println("\n\nEnter a number to check palindrome: ");
		int num = Integer.parseInt(br.readLine());
		isPalindrome(num);

	}
	
	public static void isPalindrome(String palindrome){
		
		StringBuffer bf = new StringBuffer(palindrome);
		bf.reverse();
		String rev = bf.toString();
		if(palindrome.equals(rev)){
			System.out.println(palindrome+" is Palindrome.");
		}else {
			System.out.println("Nope");
		}

	}
	public static void isPalindrome(int num){
		
		int temp = num;
		//StringBuffer bf = new StringBuffer();
		String s = "";
		while(temp != 0){
			int digit = temp%10;
			//bf.append(digit);
			s = s+digit;
			temp = temp/10;
		}
		//int rev = Integer.parseInt((bf.toString()));
		int rev = Integer.parseInt(s);
		if(num==rev){
			System.out.println(num+" is Palindrome.");
		}else {
			System.out.println("Nope");
	
		}

	}

}
