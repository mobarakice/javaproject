package algorithms;

import java.util.Scanner;

public class BinarySearchExample {
	
	private static int[] primes = new int[25];
	//private static int[] nums = {24,65,8,98,76,86,23,12,32};

	 
	public static void main(String[] args) {
		 insertNumber();
		 printAllItems();
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter finding prime number: ");
		 int n = sc.nextInt();
		 int position = findAnItemByUsingBanarySearch(primes,n);
		 System.out.println("Index is "+position);

	}
	
	public static void insertNumber(){
		int index = 0;
		for(int i = 1; i<=100; i++){
			if(isPrime(i)){
				primes[index]=i;
				index++;
			}
		}
	}
	
	public static void printAllItems(){
		for(int item: primes){
			System.out.print(item+" ");
		}
		System.out.println("\n");
	}
	
	public static boolean isPrime(int num){
		int count = 0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count==2){
			return true;
		}
		return false;
	}
	
	public static int findAnItemByUsingBanarySearch(int[] array, int findingItem){
		int min=0, max= array.length-1,result = 0;
		int avg = (max+min)/2;
		
		while(max>=min){
			if(array[avg]==findingItem){
				result = avg;
				break;
			}
			else if(array[avg]>findingItem){
				max = avg-1;
			}else {
				min = avg+1;
			}
			avg = (max+min)/2;
		}
		if(min>max){
			System.out.println("The item is not found!");
			result = -1;
		}
		return result;
	}

}
