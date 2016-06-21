package sorting.model;

public class Student implements Comparable {
	String roll;
	String name;
	int age;
	
	public Student(){
		
	}
	public Student(String roll,String name,int age){
		this.roll = roll;
		this.name = name;
		this.age = age;
	}
	public String getRoll() {
		return roll;
	}
	public void setRoll(String roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return roll + "\t" + name + "\t" + age;
	}
	@Override
	public int compareTo(Object o) {
		 Student st = (Student)o;
		 // sorted by age
//		 if(age==st.getAge()){
//			 return 0;
//		 }else if(age>st.getAge()){
//			return 1;
//		 }else{ 
//		   return -1;
//		 }
		 // sorted by name
		 return name.compareTo(st.getName());
	}
	 
	
	

}
