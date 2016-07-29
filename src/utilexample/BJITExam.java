package utilexample;

import java.util.Scanner;

public class BJITExam {

	 private int[] list;
	 private int arraySize;
	 
	 public BJITExam(int size){
		 arraySize = size;
		 list = new int[size];
	 }
	 
	public static void main(String[] args) {
		 BJITExam obj = new BJITExam(6);
		 obj.generateArray();
		 int max = obj.findMaximum(obj.list);
		 System.out.println("Maximum is: "+max+" "+obj.findMaximumRecursively(obj.list,0));
		 obj.reverseArray();
		 int repeat = obj.repeatNumber(obj.list);
		 System.out.println("Repeat number is: "+repeat);

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
	
	public int findMaximum(int[] array){
		int max = array[0];
		for(int i=1; i<array.length; i++){
//			if(array[i]>max){
//				max = array[i];
//			}
			max = Math.max(max, array[i]);
		}
		return max;
	}
	
	// Find max value in an unsorted array of ints.
	public int findMaximumRecursively(int[] array, int startIndex){
		if (startIndex == array.length - 1) {
			return array[startIndex];
		} else {
			return Math.max (array[startIndex],
					findMaximumRecursively(array, startIndex+1)) ;
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

}
