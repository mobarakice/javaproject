package utilexample;

public class Inc {


	public static void main(String[] args) {
		int[] i = {1};
		System.out.println(i.length);
		Inc in = new Inc();
		in.increment(i);
		System.out.println(i[i.length-1]);

	}
	void increment(int[] i){
		i[i.length-1]++;
	}

}
