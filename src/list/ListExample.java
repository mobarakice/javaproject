package list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	private List<String> mList;
	public static void main(String[] args){
		System.out.println("List example");
		ListExample  example = new ListExample();
		example.getList();
		
	}
	
	private List setList(List<String> list){
	 list = new ArrayList<>();
		for(int i=0;i<10;i++){
			list.add("Index "+i);
		}
		return list;
	}
	
	private void getList(){
		List<String> list = new ArrayList<>();
		list = setList(mList);
		if(list.isEmpty()){
			return;
		}
		for(String index:list){
			System.out.println(index);
		}
		
	}
	

}
