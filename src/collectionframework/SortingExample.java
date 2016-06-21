package collectionframework;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.ArrayList;

public class SortingExample {

	private static TreeSet<String>mSet;
	private static ArrayList<String> mList;
	public static void main(String[] args) {
		init();
		addItems();
		printItems();
		 

	}
	
	private static void init(){
		mSet = new TreeSet<>();
		mList = new ArrayList<>();
	}
	private static void addItems(){
		// add items on TreeSet.......
		mSet.add("Mobarak");
		mSet.add("Moe");
		mSet.add("Larry");
		mSet.add("Carly");
		mSet.add("Harry");
		
		// add items on ArrayList.......
		mList.add("Mobarak");
		mList.add("Moe");
		mList.add("Larry");
		mList.add("Carly");
		mList.add("Harry");
	}
	
	private static void printItems(){
		System.out.println("\n Items are always sorted ascending oder on TreeSet");
		for(String item:mSet){
			System.out.println(item);
		}
		
		System.out.println("\nBefore sorting ..........");
		for(String item:mList){
			System.out.println(item);
		}
		
		System.out.println("\nAfter sorting ..........");
		sortAscendingOder();
		sortDescendingOder();
		
	}
	private static void sortAscendingOder(){
		System.out.println("\nSorted ascending oder.......");
		Collections.sort(mList);
		for(String item:mList){
			System.out.println(item);
		}
	}
	
	private static void sortDescendingOder(){
		System.out.println("\nSorted descending oder.......");
		//Collections.sort(mList,Collections.reverseOrder());
		Collections.sort(mList, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		for(String item:mList){
			System.out.println(item);
		}
	}

}
