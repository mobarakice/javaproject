package algorithms;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

public class SelectionSortExample {
	
	private static void swap(int[] a, int firstIndex, int secondIndex) {
        int temp = a[firstIndex];
        a[firstIndex] = a[secondIndex];
        a[secondIndex] = temp;
    }
	private static int minimumOfIndexAscendingOder(int[] a,int minIndex){
		for (int j = minIndex + 1; j < a.length; j++) {
            if (a[j] < a[minIndex]) {
                minIndex = j;
            }
        }
		return minIndex;
	}
	
	private static int minimumOfIndexDescendingOder(int[] a,int i,int minIndex){
		for (int j = 1; j <=i ; j++) {
            if (a[j] < a[minIndex]) {
                minIndex = j;
            }
        }
		return minIndex;
	}
    
    public static int[] selectionSortAscendindOder(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            // Find the index of the minimum value
            int minIndex = minimumOfIndexAscendingOder(list, i);
//            for (int j = i + 1; j < list.length; j++) {
//                if (list[j] < list[minPos]) {
//                    minPos = j;
//                }
//            }
            swap(list, minIndex, i);
        }
        return list;
    }

	 
    public static void main(String args[]) throws Exception
    {
        String list="";
        
        SelectionSortExample s= new SelectionSortExample();
        ArrayList<Integer> arrlist=new ArrayList<Integer>();
        System.out.println("\n\nPlease enter the list of elements,one element per line");
        System.out.println("write 'STOP' when list is completed ");
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        while(!(list=bf.readLine()).equalsIgnoreCase("stop")){
            int intelement=Integer.parseInt(list);
            arrlist.add(intelement);
            
        }
        
        int elementlist[]  = new int[arrlist.size()];
        Iterator<Integer> iter = arrlist.iterator();
        for (int j=0;iter.hasNext();j++) {
            elementlist[j] = iter.next();
        }
        
        //elementlist=selectionSortAscendindOder(elementlist);
        //elementlist=doSelectionSortAscendindOder(elementlist);
        elementlist=doSelectionSortDescendindOder(elementlist);
        System.out.println("\n\nValues after Selection Sort : ");
        for (int j=0;j<elementlist.length;j++) {
            System.out.println(elementlist[j]+" ");
        }
    }
    
    public static int[] doSelectionSortAscendindOder(int[] arr){
        
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index])
                    index = j;
      
            int smallerNumber = arr[index]; 
            arr[index] = arr[i];
            arr[i] = smallerNumber;
            //swap(arr, index, i);
        }
        return arr;
    }
    
public static int[] doSelectionSortDescendindOder(int[] arr){
        
        for (int i = arr.length - 1; i >0 ; i--)
        {
            int index = minimumOfIndexDescendingOder(arr,i, 0);
            swap(arr, index, i);
//            for (int j = 1; j <= i; j++){
//                if (arr[j] < arr[index])
//                    index = j;
//            }
//            int smallerNumber = arr[index]; 
//            arr[index] = arr[i];
//            arr[i] = smallerNumber;
        }
        return arr;
    }
  

}
