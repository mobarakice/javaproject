package algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class InsertionSortExample {
	
	private static ArrayList<Integer>items;
	
	public static int[] insertionSort(int[] arr) {
	      int i, j, newValue;
	      
	      for (i = 1; i < arr.length; i++) {
	    	  
	            newValue = arr[i];
	            j = i;
	            while (j > 0 && arr[j - 1] > newValue) {
	                  arr[j] = arr[j - 1];
	                  j--;
	            }
	            arr[j] = newValue;
	      }
	      return arr;
	}
	
	public static void main(String[] args)throws Exception {
		
		items = new ArrayList<>();
		String item = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nPlease enter list of element, one element per line. " +
				"\nWrite stop when list is completed.");
		
		while(!(item = br.readLine()).equalsIgnoreCase("stop")){
			int element = Integer.parseInt(item);
			items.add(element);
		}
		
		// print array--------
		int[] list = new int[items.size()];
		System.out.println("\n\n----Before sorting-------");
		for(int i=0;i<items.size();i++){
			list[i]=items.get(i);
			System.out.print(items.get(i)+" ");
		}
		
		// sorting the array..........
		list = insertionSort(list);
		System.out.println("\n\n----After sorting-------");
		for(int i:list){
			System.out.print(i+" ");
		}
		 

	}

}
