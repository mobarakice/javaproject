package sorting;

import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.ArrayList;

import sorting.model.AgeComparator;
import sorting.model.NameComparator;
import model.Student;

public class SortingExample {

	private static TreeSet<String>mSet;
	private static ArrayList<String> mList;
	private static ArrayList<Student> mItems;
	public static void main(String[] args) {
		init();
		addItems();
		printItems();
		 

	}
	
	private static void init(){
		mSet = new TreeSet<>();
		mList = new ArrayList<>();
		mItems = new ArrayList<>();
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
		
		// Add students on list........
		Student s1 = new Student("R1","Tarek",22);
		Student s2 = new Student("R2","Mithun",25);
		Student s3 = new Student("R21","Khalid",22);
		Student s4 = new Student("R18","Sourav",23);
		Student s5 = new Student("R10","Tuhin",24);
		
		mItems.add(s1);
		mItems.add(s2);
		mItems.add(s3);
		mItems.add(s4);
		mItems.add(s5);
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
		
		// Comparable and Comparator interface Example
		// Before sorting of a customized(Student list) list
		System.out.println("\n\nBefore sorting ..........");
		for(Student st:mItems){
			System.out.println(st);
		}
		
		// After sorting of a customized(Student list) list
		// for this, need to import sorting.model
//		System.out.println("\n\nSorted by age(Comparable interface example) ..........");
//		Collections.sort(mItems);
//		for(Student st:mItems){
//			System.out.println(st);
//		}
		
		System.out.println("\n\nSorted by age(Comparator interface example) ..........");
		Collections.sort(mItems,new AgeComparator());
		for(Student st:mItems){
			System.out.println(st);
		}
		
		System.out.println("\n\nSorted by name(Comparator interface example) ..........");
		Collections.sort(mItems,new NameComparator());
		for(Student st:mItems){
			System.out.println(st);
		}
		
		
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
