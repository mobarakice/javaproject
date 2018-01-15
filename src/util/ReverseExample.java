package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ReverseExample {


	public static void main(String[] args)throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a string: ");
		String original = br.readLine();
		String rev = reverseStringRecursively(original);
		System.out.println("Original : "+original+"\n"+"Reverse : "+rev);
//		reverseString(original);
		reverseStringOrNumber(original);
		
//		System.out.println("\n\nEnter a number: ");
		int num = Integer.parseInt(br.readLine());
		reverseStringOrNumber(num);

	}
	// Reverse string without using building functions
	public static void reverseString(String input){
		// using for loop and charAt() method;
		for(int i=input.length()-1;i>=0;i--){
			System.out.print(input.charAt(i));
		}
		
		String reverse = "";
		for(int i=input.length()-1;i>=0;i--){
			reverse = reverse+input.charAt(i);
		}
		System.out.println("\nThe reverse string of "+input+ " is "+reverse);
		
		char[] a = input.toCharArray();
		int begin = 0, end = a.length-1;
		while(end>begin){
			char temp = a[begin];
			a[begin] = a[end];
			a[end]= temp;
			begin++;
			end--;
		}
		String r = new String(a);
		System.out.println("\nThe reverse string of "+input+ " is "+String.valueOf(a));
		
	}
	
	public static String reverseStringRecursively(String s){
		if(s.length()<2) return s;
		return reverseStringRecursively(s.substring(1))+s.charAt(0);
		
	}

	public static void reverseStringOrNumber(String original){
		System.out.println("The original string: "+original);
		//StringBuffer b = new StringBuffer(original);
		StringBuilder b = new StringBuilder(original);
		b.reverse();
		System.out.println("The reverse string: "+b);
	}
	public static void reverseStringOrNumber(int num){
		System.out.println("The original number: "+num);
		int temp = num;
		System.out.print("\nThe reverse number: ");
		String reverse = "";
		while(temp != 0){
			int digit = temp%10;
			//System.out.print(digit);
			reverse = reverse+digit;
			temp = temp/10;
		}
		int r = Integer.parseInt(reverse);
		System.out.print(r);

	}	

}
