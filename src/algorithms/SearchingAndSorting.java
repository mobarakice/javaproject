package algorithms;

import java.util.Scanner;

public class SearchingAndSorting {

	private int[] array;
	private int arraySize;
	private int[] primesAraay;
	
	public SearchingAndSorting(int size){
		arraySize = size;
		array = new int[arraySize];
		primesAraay = new int[arraySize];
	}


	public boolean isPrime(int num){
		int count = 0;
		for(int i=1;i<=num;i++){
			if(num%i==0){
				count++;
			}
		}
		if(count==2){
			return true;
		}else{
			return false;
		}
	}

	public void generatePrimeArray(){
		int index = 0;
		for(int i=1; i<100;i++){
			if(isPrime(i)){
				primesAraay[index] = i;
				index++;
			}
		}
	}

	public void generateRandomArray(){
		for(int i=0;i<arraySize;i++){
			array[i] =(int)(Math.random()*10)+10;
		}
	}
	
	public void generateUnsortedArray(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers one per line until the array is completed.");
		for(int i=0;i<arraySize;i++){
			array[i] = sc.nextInt();
		}
		printArray(array);
	}

	public int[] getArray(){
		return array;
	}
	public int getArraySize(){
		return arraySize;
	}

	public void printArray(int[] arr){

		System.out.println("----------");

		for(int i = 0; i < arraySize; i++){

			System.out.println("| " + i + " | " + arr[i] + " |");
			System.out.println("----------");

		}

	}

	// Gets value at provided index

	public int getValueAtIndex(int index){

		if(index < arraySize) return array[index];

		return 0;

	}

	// Returns true or false if a value is in the Array

	public boolean doesArrayContainThisValue(int searchValue){

		boolean valueInArray = false;

		for(int i = 0; i < arraySize; i++){

			if(array[i] == searchValue){

				valueInArray = true;
			}
		}
		return valueInArray;

	}


	// Delete Array row for the index and move elements up

	public void deleteIndex(int index){

		if(index < arraySize){

			// Overwrite the value for the supplied index
			// and then keep overwriting every index that follows
			// until you get to the last index in the array

			for(int i = index; i < (arraySize - 1); i++){
				array[i] = array[i+1];
			}
			arraySize--;
		}
	}

	public void insertValue(int value){

		if(arraySize < 50){
			array[arraySize] = value;
			arraySize++;
		}
	}

	// Linear Search : Every index must be looked at
	public String linearSearchingForValue(int[] array, int value){
		boolean valueInAraay = false;
		String indexWithValues = "";
		System.out.print("The Value was Found in the Following Indexes: ");

		for(int i=0;i<arraySize;i++){
			if(array[i]==value){
				valueInAraay = true;
				System.out.print(i+ " ");
				indexWithValues += i+" ";
			}
		}
		if(!valueInAraay){
			indexWithValues = "None";
			System.out.print(indexWithValues);
		}
		System.out.println();
		return indexWithValues;
	}

	// The Binary Search is quicker than the linear search
	// because all the values are sorted. Because everything
	// is sorted once you get to a number larger than what
	// you are looking for you can stop the search. Also
	// you be able to start searching from the middle 
	// which speeds the search. It also works best when 
	// there are no duplicates

	public void binarySearchForValue(int[] arr, int value){
		int lowIndex = 0;
		int highIndex = arraySize-1;
		int middleIndex;
		
		while(lowIndex<=highIndex){
			middleIndex = (lowIndex + highIndex)/2;
			if(arr[middleIndex] < value){
				lowIndex = middleIndex+1;
			}else if(arr[middleIndex] > value){
				highIndex = middleIndex-1;
			}else{
				System.out.println("Found a Match for " + value + " at Index " + middleIndex);
				lowIndex = highIndex + 1;
			}
		}
	}
	
	// This bubble sort will sort everything from 
	// smallest to largest
	public void bubbleSortAscendindOder(){
		// i starts at the end of the Array
		// As it is decremented all indexes greater
		// then it are sorted
		
		for(int i = arraySize-1; i>1; i--){
			// The inner loop starts at the beginning of 
			// the array and compares each value next to each 
			// other. If the value is greater then they are 
			// swapped
			
			for(int j = 0; j<i; j++){
				if(array[j]>array[j+1]){
					swapValues(j,j+1);
				}
			}
		}
	}
	
	// This bubble sort will sort everything from 
	// largest to smallest 
	public void bubbleSortDescendindOder(){
		// i starts at the beginning of the array

		for(int i = 0; i<arraySize; i++){
			// The inner loop starts at the beginning of 
			// the array 1 index in more than i. 

			for(int j = 1; j<(arraySize-i); j++){
				
				// Here we check if the 1st index is less
				// than the next during the first run through
				// Then we just increase the indexes until
				// they have all been checked
				if(array[j-1]<array[j]){
					swapValues(j-1,j);
				}
			}
		}
	}
	
	// Selection sort search for the smallest number in the array
	// saves it in the minimum spot and then repeats searching
	// through the entire array each time

	public void selectionSort(){

		for(int x=0; x < arraySize; x++){
			int minimum = x;

			for(int y=x; y < arraySize; y++){

				// To change direction of sort just change 
				// this from > to <

				if(array[minimum]>array[y]){
					minimum = y;
				}
			}

			swapValues(x, minimum);
		}

	}

	// The Insertion Sort is normally the best of 
	// the elementary sorts. Unlike the other sorts that
	// had a group sorted at any given time, groups are
	// only partially sorted here.

	public void insertionSort(){

		for (int i = 1; i < arraySize; i++){
			int j = i;
			int toInsert = array[i];
			while ((j > 0) && (array[j-1] > toInsert)){
				array[j] = array[j-1];
				j--;
			}
			array[j] = toInsert;

			System.out.println("\nArray[i] = " + array[i] + " Array[j] = " + array[j] + " toInsert = " + toInsert + "\n");

		}

	}
	
	// Merge sort algorithm
	public void mergeSort(int[] arr){
		int length = arr.length;
		if(length<2){
			return;
		}
		
		// Split the array in half
		int mid = length/2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[length -mid];
        for(int i=0;i<mid;i++){
        	leftArr[i]=arr[i];
        }
        for(int i=mid;i<length;i++){
        	rightArr[i-mid]=arr[i];
        }
        
        // Recursive call
        mergeSort(leftArr);
        mergeSort(rightArr);
        // merging
        merging(leftArr,rightArr,arr);
	}
	

	private void merging(int[] leftArr, int[] rightArr, int[] arr) {
		 int i=0,j=0,k=0;
		 
		 while(i<leftArr.length && j<rightArr.length){
			 if(leftArr[i]<rightArr[j]){
				 arr[k++]=leftArr[i++];
			 }else{
				 arr[k++]=rightArr[j++];
			 }
		 }
		 while(i<leftArr.length){
			 arr[k++]=leftArr[i++];
		 }
		 while(j<rightArr.length){
			 arr[k++]=rightArr[j++];
		 }
		
	}


	private void swapValues(int firstIndex, int secondIndex) {
		 int temp = array[firstIndex];
		 array[firstIndex] = array[secondIndex];
		 array[secondIndex] = temp;
		
	}


	// Quick sort Algorithm
	
	public void quickSort(int[] arr, int startIndex, int endIndex){
		if(startIndex >= endIndex){
			return;
		}
		int partitionIndex = partition(arr,startIndex,endIndex);
		quickSort(arr, startIndex, partitionIndex-1);
		quickSort(arr, partitionIndex+1, endIndex);
		
	}
	
	private int partition(int[] arr, int startIndex, int endIndex) {
		// set pivot
		 int pivot = arr[endIndex];
		//set partition index
		 int partitionIndex = startIndex;
		 
		 for(int i = startIndex; i<endIndex;i++){
			 if(arr[i]<=pivot){
				 swap(arr, i, partitionIndex);
				 partitionIndex++;
			 }
		 }
		 swap(arr,partitionIndex,endIndex);
		 
		return partitionIndex;
	}


	private void swap(int[] arr, int i, int partitionIndex) {
		int temp = arr[i];
		arr[i] = arr[partitionIndex];
		arr[partitionIndex] = temp;
		
	}


	public static void main(String[] args) {
		SearchingAndSorting ss = new SearchingAndSorting(10);
		//		 ss.generateRandomArray();
		//		 ss.printArray();
		//		 ss.insertValue(55);
		//		 System.out.println("After insert the value 55");
		//		 ss.printArray();
		//		 ss.deleteIndex(6);
		//		 System.out.println("After insert the value 55");
		//		 ss.printArray();
		//		 
		//		 ss.linearSearchingForValue(11);

//		ss.generatePrimeArray();
//		ss.printArray();
//		ss.linearSearchingForValue(ss.primesAraay,17);
//		ss.binarySearchForValue(ss.primesAraay, 17);
	ss.generateUnsortedArray();
	//ss.mergeSort(ss.array);
	ss.quickSort(ss.array, 0, ss.array.length-1);
	ss.printArray(ss.array);
	//ss.bubbleSortDescendindOder();
	//System.out.println("After bubble sorting the array is: ");
	//ss.printArray(ss.array);

	}

}
