package utilexample;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        
       
         int []arr = new int [6];
        
        for(int id:ar){
            arr[id]++;
        }
        
        int maxValue = 0; 
        int maxPos=0;
    
        for(int i =1;i<6;i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
                maxPos =  i;
            }       
        }
        return maxPos;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = in.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the elments of array: ");
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}
