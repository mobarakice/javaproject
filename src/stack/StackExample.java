package stack;

public class StackExample {

	private static final int MAXSIZE = 4;
	private static int[] stack = new int[MAXSIZE];
	static int top = -1;

	public static void main(String[] args) {
		push(54);
		push(58);
		push(62);
		push(40);

		System.out.println("Element at top of the stack: "+peek());
		System.out.println("Elements: \n");
		

		// print stack data 
		while(!isEmpty()) {
			int data = pop();
			System.out.println(""+data);
		}
		//push(70);
		//push(70);

		System.out.println("Stack full: " +isFull());
		System.out.println("Stack empty: "+isEmpty());

	}
	public static boolean isEmpty(){
		if(top==-1){
			return true;
		}else {
			return false;
		}
	}
	public static boolean isFull(){
		if(top==MAXSIZE-1){
			return true;
		}else {
			return false;
		}
	}
	public static int peek(){
		return stack[top];
	}

	public static int pop(){
		int data;
		if(!isEmpty()){
			data = stack[top];
			top = top-1;
			return data;
		}else{
			System.out.println("Could not retrieve data, Stack is empty.\n");
			return -1;
		}
	}

	public static void push(int data) {

		if(!isFull()) {
			top = top + 1;   
			stack[top] = data;
		}else {
			System.out.println("Could not insert data, Stack is full.\n");
			return;
		}
	}



}
