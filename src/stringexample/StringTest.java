package stringexample;

public class StringTest {

	/**
	 * Difference between String, new String().
	 */
	public static void main(String[] args) {
		 
      String s1 = "hello";
      String s2 = new String(s1);
      String s3 = new String("hello");
      String s4 = new String(s3);
      String s5 = new String(s4);
      String s6 = "hello";
      
      System.out.println(s1==s2);
      System.out.println(s1.equals(s2));
      System.out.println("\n");
      
      System.out.println(s2==s3);
      System.out.println(s2.equals(s3));
      System.out.println("\n");
      
      System.out.println(s3==s4);
      System.out.println(s3.equals(s4));
      System.out.println("\n");
      
      System.out.println(s5==s2);
      System.out.println(s5.equals(s2));
      System.out.println("\n");
      
      System.out.println(s1==s6);
      
	}

}
