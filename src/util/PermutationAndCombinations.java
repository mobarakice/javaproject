package util;

import java.util.Arrays;

public class PermutationAndCombinations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 permutation("ab");
//		 int[] a={1,2,1};
//		 do {  // Must start at lowest permutation
//			    System.out.println(Arrays.toString(a));
//			} while (nextPermutation(a));

	}
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0) System.out.println(prefix);
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}
	
	/**
	 * Computes the next lexicographical permutation of the specified
	 * array of integers in place, returning whether a next permutation
	 * existed. (Returns {@code false} when the argument is already the
	 * last possible permutation.)
	 * @param array the array of integers to permute
	 * @return whether the array was permuted to the next permutation
	 */
	public static boolean nextPermutation(int[] array) {
	    // Find non-increasing suffix
	    int i = array.length - 1;
	    while (i > 0 && array[i - 1] >= array[i])
	        i--;
	    if (i <= 0)
	        return false;
	    
	    // Find successor to pivot
	    int j = array.length - 1;
	    while (array[j] <= array[i - 1])
	        j--;
	    int temp = array[i - 1];
	    array[i - 1] = array[j];
	    array[j] = temp;
	    
	    // Reverse suffix
	    j = array.length - 1;
	    while (i < j) {
	        temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	        i++;
	        j--;
	    }
	    return true;
	}

}
