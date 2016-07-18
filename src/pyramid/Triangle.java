package pyramid;
import java.util.Scanner;

public class Triangle {
	
	void printLowerTriangle(int oddNumber){
		int lineNumber;
		for(lineNumber=0;(oddNumber-lineNumber)>0;lineNumber++){
			printSpaces(lineNumber);
			printStars(oddNumber-lineNumber);
			System.out.println("");
		}
	 }
	
	 void printLowerTriangleGivenAnOddNumber(int oddNumber){
		int lineNumber;
		for(lineNumber=0;(oddNumber-2*lineNumber)>0;lineNumber++){
			printSpaces(lineNumber);
			printStars(oddNumber-2*lineNumber);
			System.out.println("");
		}
	 }
	 void printUperTriangleGivenAnOddNumber(int oddNumber){
		int lineNumber;
		for(lineNumber=0;(2*lineNumber+1)<=oddNumber;lineNumber++){
			int numberOfSpaces = (oddNumber-(2*lineNumber+1))/2;
			printSpaces(numberOfSpaces);
			int numberOfStars = 2*lineNumber+1;
			printStars(numberOfStars);
			System.out.println("");
		}
	 }
	 void printStars(int number){
	   int i;
	   for(i=0;i<number;i++){
	    System.out.print(" * ");
	   }
	 }
	 void printSpaces(int number){
	   int i;
	   for(i=0;i<number;i++){
	    System.out.print("   ");
	   }
	 }
	 public static void main(String args[]){
		 int num;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter an odd number: ");
		 num = sc.nextInt();
		 Triangle obj = new Triangle();
		 //obj.printLowerTriangle(num);
		 //obj.printLowerTriangleGivenAnOddNumber(num);
		 obj.printUperTriangleGivenAnOddNumber(num);
	 }
	 
	}
