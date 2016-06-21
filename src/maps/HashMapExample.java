package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import model.Student;

public class HashMapExample {

	private static HashMap<Integer, String> mMap;
	private static HashMap<String, Student> mStudentMap;
	//private static Scanner sc;
	public static void main(String[] args) {
		
		 intializedMap();
		 // Add items on map
		 mMap.put(100, "Mobarak");
		 mMap.put(105, "Tuhin");
		 mMap.put(110, "Tarek");
		 mMap.put(110, "Tarek");
		 mMap.put(115, "Rupom");
		 mMap.put(120, "Mostafiz");
		 
		 addStudent();
		// addItemsIntoMap();
		 printMapItems(mMap);
		 removeItem(mMap);

	}
	private static void intializedMap(){
		mMap = new HashMap<>();
		mStudentMap = new HashMap<>();
	}
	
	private static void addItemsIntoMap(){
		Scanner	sc = new Scanner(System.in);
		System.out.print("Enter key and name.....");
		for(int i=0; i<5;i++){
			int key = sc.nextInt();
			String name = sc.nextLine();
			mMap.put(key,name);
		}
	}
	private static <K, V> void printMapItems(HashMap<K,V> maps){
		if(maps == null){
			return;
		}
		System.out.println(" Key \t Value ");
		System.out.println("-----\t-------");
		for(Map.Entry m: maps.entrySet()){
			System.out.println(m.getKey()+"\t"+m.getValue().toString());
		}
	}
	private static<K,V> void removeItem(HashMap<K,V> maps){
		if(maps.containsKey(110)){
			maps.remove(110);
			System.out.println("After removing one item.....");
			
			printMapItems(maps);
		//	printMapItems(mMap);
			
		}else if(maps.containsValue("Mobarak")){
			String name = (String) maps.get(100);
			System.out.println("Value is: "+name);
		}else{
			System.out.println("Item is not exist.....");
		}
	}
	
	private static void addStudent(){
		Student s1 = new Student("200", "Larry", 23);
		Student s2 = new Student("210", "Carly", 22);
		Student s3 = new Student("222", "Moe", 24);
		Student s4 = new Student("225", "Lam", 23);
		Student s5 = new Student("207", "Harry", 25);
		
		mStudentMap.put("s1", s1);
		mStudentMap.put("s2", s2);
		mStudentMap.put("s3", s3);
		mStudentMap.put("s4", s4);
		mStudentMap.put("s5", s5);
		
	}
	

}
