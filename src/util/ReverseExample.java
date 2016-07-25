package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseExample {


	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string: ");
		String original = br.readLine();
		reverseStringOrNumber(original);
		
		System.out.println("\n\nEnter a number: ");
		int num = Integer.parseInt(br.readLine());
		reverseStringOrNumber(num);

	}

	public static void reverseStringOrNumber(String original){
		System.out.println("The original string: "+original);
		StringBuffer b = new StringBuffer(original);
		b.reverse();
		System.out.println("The reverse string: "+b);
	}
	public static void reverseStringOrNumber(int num){
		System.out.println("The original number: "+num);
		int temp = num;
		System.out.print("\nThe reverse number: ");
		while(temp != 0){
			int digit = temp%10;
			System.out.print(digit);
			temp = temp/10;
		}

	}	

}
