package util;

import java.util.Scanner;

public class SimpleProblem {

	 
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
//		checkOddEven(num);
//		SumAndAverage(num);
//		SumAndAverageOnlyOddNuber(num);
		SumAndAverageOnlyDivisibleBy7(num);
		SumOfSquares(num);

	}
	/*
	 * Write a program called CheckOddEven 
	 */
	public static void checkOddEven(int num){
		if(num%2==0){
			System.out.println(num+" is even number");
		}else{
			System.out.println(num+" is odd number");
		}
	}
	
	/*
	 *  Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. 
	 *  Also compute and display the average 
	 */
	public static void SumAndAverage(int num){
		 int sum = 0;
		 double avg=0.0;
		 for(int i=1;i<=num;i++){
			 sum = sum+i;
		 }
		 avg = (double)sum/num;
		 System.out.println("The sum is "+sum);
		 System.out.println("The average is "+avg);
	}
	
	/*
	 *  Write a program called SumAndAverageOnlyOddNuber to produce the sum of 1, , 3, ..., to 100. 
	 *  Also compute and display the average 
	 */
	public static void SumAndAverageOnlyOddNuber(int num){
		 int sum = 0;
		 double avg=0.0;
		 int count = 0;
		 for(int i=1;i<=num;i++){
			 if(i%2 != 0){
			 sum = sum+i;
			 count++;
			 }
		 }
		 avg = (double)sum/count;
		 System.out.println("The sum is "+sum);
		 System.out.println("The average is "+avg);
	}
	
	/*
	 *  Write a program to sum those numbers from 1 to 100 that is divisible by 7. 
	 *  Also compute and display the average 
	 */
	public static void SumAndAverageOnlyDivisibleBy7(int num){
		 int sum = 0;
		 double avg=0.0;
		 int count = 0;
		 for(int i=1;i<=num;i++){
			 if(i%7 == 0){
			 sum = sum+i;
			 count++;
			 }
		 }
		 avg = (double)sum/count;
		 System.out.println("The sum is "+sum);
		 System.out.println("The average is "+avg);
	}
	
	/*
	 *  Find the "sum of the squares" of all the numbers from 1 to 100, i.e. 1*1 + 2*2 + 3*3 + ... + 100*100. 
	 *   
	 */
	public static void SumOfSquares(int num){
		 int sum = 0;
		 for(int i=1;i<=num;i++){
			sum = (int) (sum+Math.pow(i, 2));  
		 }
	
		 System.out.println("The sum of squares is "+sum);
		   
	}
	

}
