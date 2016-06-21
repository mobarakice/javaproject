package sorting.model;

import java.util.Comparator;
import model.Student;

public class AgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
			Student s1 = (Student)o1;
			Student s2 = (Student)o2;
			// ascending oder......
			// for descending oder only alter the s1 and s2
			if(s1.getAge()==s2.getAge()){
				return 0;
			}else if(s1.getAge()>s2.getAge()){
				return 1;
			}else {
				return -1;
			}
	}

}
