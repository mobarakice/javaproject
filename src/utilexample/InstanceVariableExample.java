package utilexample;

import model.Student;

public class InstanceVariableExample {
	
	private String name;
	private char c;
	private int num;
	private float floatNumber;
	private double doubleNumber;
	private long longNumber;
	private boolean b;
	private Student st;
	
	public static void main(String args[]){
		InstanceVariableExample iv = new InstanceVariableExample();
	
		print(iv.name);
		print(iv.c);
		print(iv.num);
		print(iv.longNumber);
		print(iv.floatNumber);
		print(iv.doubleNumber);
		print(iv.b);
		print(iv.st);
		
	}
	
	private static<K> void print(K a){
		System.out.println(a);
	}

}
