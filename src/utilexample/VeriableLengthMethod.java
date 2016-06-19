package utilexample;

public class VeriableLengthMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 double total = add(5,4,1,10,100,52);
		 System.out.println(total);

	}
	private static double add(double...numbers){
		double total = 0;
		for(double num: numbers){
			total = total+num;
		}
		return total;
	}

}
