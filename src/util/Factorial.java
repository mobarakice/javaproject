package util;

public class Factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 System.out.println(factorial(20));

	}
	private static long factorial(int number){
		if(number==1){ 
			return 1;
		}
		return number*factorial(number-1);
	}

}
