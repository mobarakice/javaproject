package util;

import java.util.Scanner;

public class FibonacciExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number upto which fibonacci series print");
		int number = sc.nextInt();
		
		// Simple for loop 
		fibonacciNumber(number);
		System.out.println("\n Fibonacci series upto "+number);
		//for(int i=0;i<=number;i++){
		//System.out.print(" "+fibonacci(number));
			//System.out.print(" "+fibonacciNumber2(i));
		//}
		printFiboSeriesUpToN(number);
		

	}
	
	public static void fibonacciNumber(int number){
		int f1=0, f2=1, fn=1;
		for(int i=0;i<=number; i++){
			fn = f1+f2;
			System.out.print(" "+f1);
			f1=f2;
			f2= fn;
		}
	}
	
	public static int fibonacciNumber2(int number){
		if(number==0){
			return 0;
		}
		if(number==1 || number==2){
			return 1;
		}
		int f1=1, f2=1, fn=1;
		for(int i=3;i<=number; i++){
			fn = f1+f2;
			f1=f2;
			f2= fn;
		}
		return fn;
	}
	
	/*
     * Java program for Fibonacci number using recursion.
     * This program uses tail recursion to calculate Fibonacci number for a given number
     * @return Fibonacci number
     */
    public static int fibonacci(int number){
    	if(number==0){
    		return 0;
    	}
        if(number == 1 || number == 2){
            return 1;
        }
      
        return fibonacci(number-1) + fibonacci(number -2); //tail recursion
    }
    
    public static void printFiboSeriesUpToN(int n){
    	for(int i=0;i<=n;i++){
    		System.out.print(" "+fibonacci(i));
    	}
    }


}
