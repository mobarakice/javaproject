package algorithms;

public class MergeSortExample {

	 private int[] array;
	    private int[] tempMergArr;
	    private int length;
	 
	    public static void main(String a[]){
	         
	        int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
	        MergeSortExample mms = new MergeSortExample();
	        mms.sort(inputArr);
	        for(int i:inputArr){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	    }
	     
	    public void sort(int inputArr[]) {
	        this.array = inputArr;
	        this.length = inputArr.length;
	        this.tempMergArr = new int[length];
	        doMergeSort(0, length - 1);
	    }
	 
	    private void doMergeSort(int lowerIndex, int higherIndex) {
	         
	        if (lowerIndex < higherIndex) {
	            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
	            // Below step sorts the left side of the array
	            doMergeSort(lowerIndex, middle);
	            // Below step sorts the right side of the array
	            doMergeSort(middle + 1, higherIndex);
	            // Now merge both sides
	            mergeParts(lowerIndex, middle, higherIndex);
	        }
	    }
	 
	    private void mergeParts(int lowerIndex, int middle, int higherIndex) {
	 
	        for (int i = lowerIndex; i <= higherIndex; i++) {
	            tempMergArr[i] = array[i];
	        }
	        int i = lowerIndex;
	        int j = middle + 1;
	        int k = lowerIndex;
	        while (i <= middle && j <= higherIndex) {
	            if (tempMergArr[i] <= tempMergArr[j]) {
	                array[k] = tempMergArr[i];
	                i++;
	            } else {
	                array[k] = tempMergArr[j];
	                j++;
	            }
	            k++;
	        }
	        while (i <= middle) {
	            array[k] = tempMergArr[i];
	            k++;
	            i++;
	        }
	 
	    }
	    
	    public void merging(int low, int mid, int high) {
	    	int l1, l2, i;

	    	for(l1 = low, l2 = mid + 1, i = low; l1 <= mid && l2 <= high; i++) {
	    		if(array[l1] <= array[l2])
	    			tempMergArr[i] = array[l1++];
	    		else
	    			tempMergArr[i] = array[l2++];
	    	}

	    	while(l1 <= mid)    
	    		tempMergArr[i++] = array[l1++];

	    	while(l2 <= high)   
	    		tempMergArr[i++] = array[l2++];

	    	for(i = low; i <= high; i++)
	    		array[i] = tempMergArr[i];
	    }

	    public	void sort(int low, int high) {
	    	int mid;

	    	if(low < high) {
	    		mid = (low + high) / 2;
	    		sort(low, mid);
	    		sort(mid+1, high);
	    		merging(low, mid, high);
	    	}else { 
	    		return;
	    	}   
	    }
}
