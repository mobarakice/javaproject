package stackandqueue;

import java.util.Arrays;

public class StackExample {
	
	private String[] stackArray;
	private int stackSize;
	
	// Sets stack as empty
	private int topOfStack = -1;
	
	public StackExample(int size){
		stackSize = size;
		stackArray = new String[stackSize];
		
		// Assigns the value of -1 to every value in the array
		// so I control what gets printed to screen
		Arrays.fill(stackArray, "-1");
	}
	
	public void displayTheStack(){
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < stackSize; n++){
			
			System.out.format("| %2s "+ " ", n);
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
		
		for(int n = 0; n < stackSize; n++){
			
			if(stackArray[n].equals("-1")) System.out.print("|     ");
			
			else System.out.print(String.format("| %2s "+ " ", stackArray[n]));
			
		}
		
		System.out.println("|");
		
		for(int n = 0; n < 61; n++)System.out.print("-");
		
		System.out.println();
	
}
 
	public boolean isFull(){
		return (topOfStack==stackSize-1);
	}
	
	public boolean isEmpty(){
		return (topOfStack==-1);
	}
	
	public void push(String input){
		if(isFull()){
			System.out.println("Sorry But the Stack is Full");
			displayTheStack();
			return;
		}else{
			topOfStack++;
			//topOfStack = topOfStack+1;
			stackArray[topOfStack]= input;
			//stackArray[++topOfStack]=input;
		}
		displayTheStack();
		System.out.println("PUSH " + input + " Was Added to the Stack\n");
	}
	
	public void pushMany(String multipleValuse){
		String[] tempString = multipleValuse.split(" ");
		for(int i=0;i<tempString.length;i++){
			push(tempString[i]);
		}
	}
	
	public String peek(){
		displayTheStack();
		System.out.println("PEEK " + stackArray[topOfStack] + " Is at the Top of the Stack\n");
		
		return stackArray[topOfStack];
	}
	
	public String pop(){
		if(isEmpty()){
			System.out.println("Sorry But the Stack is Empty");
			displayTheStack();
			return "-1";
		}else{
			displayTheStack();
			System.out.println("POP " + stackArray[topOfStack] + " Was Removed From the Stack\n");
			stackArray[topOfStack] = "-1";
			return stackArray[topOfStack--];
		}
	}
	
	public void popAll(){
		for(int i = topOfStack; i>=0;i--){
			pop();
		}
	}
	
	public void popDisplayAll(){

		String theReverse = "";

		for(int i = topOfStack; i >= 0; i--){

			theReverse += stackArray[i];

		}

		System.out.println("The Reverse: " + theReverse);

		popAll();

	}
	
	public static void main(String[] args) {

		StackExample s = new StackExample(5);
		s.displayTheStack();
		s.push("10");
		s.push("12");
		s.push("13");
		s.push("19");
		s.push("45");
		s.push("11");
		
		// Look at the top value on the stack
		s.peek();
		
		// Remove values from the stack (LIFO)
		s.pop();
		s.pop();
		s.pop();
		
		// Add many to the stack
		s.pushMany("D 87 36 A B");
		
		// Remove all values from the stack (LIFO)
		s.popAll();
		s.displayTheStack();
	}

}
