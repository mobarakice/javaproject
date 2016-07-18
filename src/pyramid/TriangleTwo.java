package pyramid;
import java.util.Scanner;

public class TriangleTwo {
	
	 static void printLowerTriangleGivenAnOddNumber(int oddNumber,int offset){
		int lineNumber;
		for(lineNumber=0;(oddNumber-2*lineNumber)>0;lineNumber++){
			printSpaces(lineNumber+offset+5);
			printStars(oddNumber-2*lineNumber);
			System.out.println("");
		}
	 }
	 static void printUperTriangleGivenAnOddNumber(int oddNumber){
		int lineNumber;
		for(lineNumber=0;(2*lineNumber+1)<=oddNumber;lineNumber++){
			int numberOfSpaces = (oddNumber-(2*lineNumber+1))/2;
			printSpaces(numberOfSpaces+5);
			int numberOfStars = 2*lineNumber+1;
			printStars(numberOfStars);
			System.out.println("");
		}
	 }
	 static void printRhombusGivenAnOddNumber(int oddNumber){
		 printUperTriangleGivenAnOddNumber(oddNumber);
		 printLowerTriangleGivenAnOddNumber(oddNumber-2,1);
	 }
	 static void printStars(int number){
	   int i;
	   for(i=0;i<number;i++){
	    System.out.print("*");
	   }
	 }
	 static void printSpaces(int number){
	   int i;
	   for(i=0;i<number;i++){
	    System.out.print(" ");
	   }
	 }
	 public static void main(String args[]){
		 int num;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter an odd number: ");
		 num = sc.nextInt();
		// TriangleTwo obj = new TriangleTwo();
		 TriangleTwo.printLowerTriangleGivenAnOddNumber(num,0);
		 TriangleTwo.printUperTriangleGivenAnOddNumber(num);
		 System.out.println("");
		 TriangleTwo.printRhombusGivenAnOddNumber(num);
		 
	 }
	 
	}
