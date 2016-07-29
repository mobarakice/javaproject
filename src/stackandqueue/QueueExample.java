package stackandqueue;

import java.util.Arrays;

public class QueueExample {
	
	// Queues allow access to the first item inserted (FIFO)
	
	private String[] queueArray;
	private int queueSize;
	int front,numberOfItems=0, rear=0;
	
	public QueueExample(int size) {
		queueSize = size;
		queueArray = new String[queueSize];
		
		// Assigns the value of -1 to every value in the array
		// so I control what gets printed to screen
		Arrays.fill(queueArray, "-1");
	}
	
	public boolean isEmpty(){
		return (numberOfItems==0);
	}
	public boolean isFull(){
		return (numberOfItems==queueSize);
	}
	public int size(){
		return numberOfItems;
	}
	public void peek(){
		if(isEmpty()){
			System.out.println("Sorry But the Queue is Empty");
			return;
		}
		System.out.println("The First Element is " + queueArray[front]);
	}
	
	public void insert(String input){
		if(isFull()){
			System.out.println("Sorry But the Queue is Full");
			return;
		}else{
			queueArray[rear] = input;
			rear++;
			numberOfItems++;
			System.out.println("INSERT " + input + " Was Added to the Stack\n");
		}
	}
	
	public void priorityInsert(String input){
		int i;
		if(isEmpty()){
			insert(input);
		}else{
			for(i=numberOfItems-1;i>=0;i--){
				if(Integer.parseInt(input)>Integer.parseInt(queueArray[i])){
					queueArray[i+1]=queueArray[i];
				}else break;
			}
			queueArray[i+1]=input;
			rear++;
			numberOfItems++;
		}
	}
	
	 
	
	public void remove(){
		if(isEmpty()){
			System.out.println("Sorry But the Queue is Empty");
			return;
		}else{
			
			System.out.println("REMOVE " + queueArray[front] + " Was Removed From the Queue\n");
			
			// Just like in memory an item isn't deleted, but instead is just not available
			queueArray[front] = "-1";
			front++;
			numberOfItems--;
		}
	}
	
	public void displayTheQueue(){

		for(int n = 0; n < 61; n++)System.out.print("-");

		System.out.println();

		for(int n = 0; n < queueSize; n++){

			System.out.format("| %2s "+ " ", n);

		}

		System.out.println("|");

		for(int n = 0; n < 61; n++)System.out.print("-");

		System.out.println();

		for(int n = 0; n < queueSize; n++){


			if(queueArray[n].equals("-1")) System.out.print("|     ");

			else System.out.print(String.format("| %2s "+ " ", queueArray[n]));

		}

		System.out.println("|");

		for(int n = 0; n < 61; n++)System.out.print("-");

		System.out.println();

		// Number of spaces to put before the F

		int spacesBeforeFront = 3*(2*(front+1)-1);

		for(int k = 1; k < spacesBeforeFront; k++)System.out.print(" ");

		System.out.print("F");

		// Number of spaces to put before the R

		int spacesBeforeRear = (2*(3*rear)-1) - (spacesBeforeFront);

		for(int l = 0; l < spacesBeforeRear; l++)System.out.print(" ");

		System.out.print("R");

		System.out.println("\n");

	}
	 
	public static void main(String[] args) {
		
		QueueExample q = new QueueExample(5);
//		q.displayTheQueue();
//		q.insert("8");
//		q.displayTheQueue();
//		q.insert("48");
//		q.displayTheQueue();
//		q.insert("81");
//		q.displayTheQueue();
//		q.insert("28");
//		q.displayTheQueue();
//		q.insert("85");
//		q.displayTheQueue();
//		q.insert("87");
//		q.displayTheQueue();
		
		q.priorityInsert("15");
		q.displayTheQueue();
		q.priorityInsert("56");
		q.displayTheQueue();
		q.priorityInsert("5");
		q.displayTheQueue();
		q.peek();
		
//		q.peek();
//		q.remove();
//		q.remove();
//		q.remove();
//		q.remove();
//		q.remove();
//		q.displayTheQueue();
//		q.peek();
		 
	}

}
