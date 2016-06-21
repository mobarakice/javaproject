package collectionframework;
import java.util.ArrayList;

import model.Student;

public class ArrayListExample {

	private static ArrayList<Student> mList;
	 
	public static void main(String[] args) {
		mList = new ArrayList<>();
		ArrayListExample example = new ArrayListExample();
		example.addStudent();
		System.out.println("Added one item:-----\n"+mList.toString());
		ArrayList<Student> list = example.addStudents();
		System.out.println("Added multiple items:-----\n"+mList.toString());
		example.retainAll(list);
		System.out.println("After retain items:-----\n"+mList.toString());
		 
	}
	
	private void addItems(Student student){
		if(student==null){
			return;
		}
		mList.add(student);
		
	}
    private void addItems(ArrayList<Student> students){
    	if(students==null){
    		return;
    	}
    	mList.addAll(students);
		
	}
    private void addStudent(){
    	Student st = new Student("110","Mobarak",23);
    	addItems(st);
    }
    private ArrayList addStudents(){
    	ArrayList<Student> items = new ArrayList<>();
    	items.add(new Student("111","Rakib",23));
    	items.add(new Student("115","Tuhin",25));
    	items.add(new Student("113","Tarek",22));
    	addItems(items);
    	
    	return items;
    }
    
    private void retainAll(ArrayList<Student>list){
    	 mList.retainAll(list);
    	 
    }


}
