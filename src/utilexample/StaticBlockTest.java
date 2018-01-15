package utilexample;

import java.util.Arrays;

public class StaticBlockTest {

	public static void main(String[] args) {
		System.out.println("Main Method");
		Derived d = new Derived();
		
		System.out.println(Arrays.toString("\u0041".getBytes()));
		int x=0;
		for(int i=0; i<10000000;i++){
			x = x+1;
		}
		System.out.println("Value of X: "+x);

	}

}


