package utilexample;

import java.util.Scanner;

import util.Factorial;

public class BJITExam {

	 private int[] list;
	 private int arraySize;
	 private static int lastIndex = 0;
	 
	 public BJITExam(int size){
		 arraySize = size;
		 list = new int[size];
	 }
	 
	public static void main(String[] args) {
		 BJITExam obj = new BJITExam(6);
		 obj.generateArray();
		 obj.printArray();
		// obj.reverseArray(obj.list,0);
		// obj.printArray();
		 int min = obj.findMinimumRecursively(obj.list, 0);
		 System.out.println("Maximum is: "+min+" "+obj.findMaximumRecursively(obj.list,0));
//		 obj.reverseArray();
//		 int repeat = obj.repeatNumber(obj.list);
//		 System.out.println("Repeat number is: "+repeat);
		 int sum = obj.sumUpToN(5);
		 System.out.println("Sum is: "+sum);
		 System.out.println("Factorial is: "+obj.factorial(5));
	}
	
	public void generateArray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter "+arraySize+" numbers one per line.");
		for(int i=0;i<arraySize;i++){
			list[i]=sc.nextInt();
		}
		printArray();
	}
	public void printArray(){
		System.out.println("Index"+"\t"+"Items");
		System.out.println("-----"+"\t"+"-----");
		for(int j=0;j<arraySize;j++){
			System.out.println(j+"\t"+list[j]);
		}
	}
	/**
	 * 
	 * @param array
	 * @return
	 */
	public int findMaximum(int[] array){
		int max = array[0];
		for(int i=1; i<array.length; i++){
			max = max(max, array[i]);
//			max = Math.max(max, array[i]);
		}
		return max;
	}
	
	/**
	 * Invoke to find maximum value in an unsorted array of Integer types
	 * @param array
	 * @param startIndex
	 * @return
	 */
	public int findMaximumRecursively(int[] array, int startIndex){
		if (startIndex == array.length - 1) {
			return array[startIndex];
		} else {
//			return Math.max (array[startIndex],
//					findMaximumRecursively(array, startIndex+1)) ;
			return max (array[startIndex],
					findMaximumRecursively(array, startIndex+1)) ;
		}
	}
	
	/**
	 * Invoke to find maximum between two numbers
	 * @param a
	 * @param b
	 * @return maximum
	 */
	public int max(int a, int b){
		return a>b?a:b;
	}
	
	/**
	 * Invoke to find minimum between two numbers
	 * @param a
	 * @param b
	 * @return minimum
	 */
	public int min(int a, int b){
		return a>b?b:a;
	}
	
	public int findMinimumRecursively(int[] array, int startIndex){
		if (startIndex == array.length - 1) {
			return array[startIndex];
		} else {
//			return Math.min (array[startIndex],
//					findMinimumRecursively(array, startIndex+1)) ;
			return min (array[startIndex],
					findMinimumRecursively(array, startIndex+1)) ;
		}
	}
	public void reverseArray(){
		int j = arraySize-1;
		for(int i=0;i<arraySize/2;i++){
			swap(i,j);
			j--;
		}
		printArray();
	}
	
	public int[] reverseArray(int[] a, int startIndex ){
		lastIndex=(a.length-1);
		if(startIndex==(a.length/2)-1){
			return a;
		}else{
		//swap(startIndex, lastIndex-startIndex);
			int temp = a[startIndex];
			a[startIndex] = a[lastIndex-startIndex];
			a[lastIndex-startIndex] = temp;
		return reverseArray(a, startIndex++);
		}
	}
	
	public void swap(int a,int b){
		int temp = list[a];
		list[a] = list[b];
		list[b] = temp;
	}
	
	public int repeatNumber(int[] array){
		int repeat = 0;
		for(int i=0;i<array.length;i++){
			for(int j = i+1;j<array.length;j++){
				if(array[i]==array[j])
					repeat = array[i];
			}
		}
		return repeat;
	}
	public int sumUpToN(int n){
		 if(n<=1){
			  return 1;
		 }
		 return (n+sumUpToN(n-1));
	}
	public long factorial(int n){
		if(n<=1){
			return 1;
		}
		return n*factorial(n-1);
	}

}
