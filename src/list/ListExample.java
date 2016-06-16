package list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
	
	private List<String> mList;
	public static void main(String[] args){
		ListExample  example = new ListExample();
		example.getList();
		example.getTableList();
		
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
	
	private void getTableList(){
		List<String> list = new ArrayList<>();
		list = setList(mList);
		if(list.isEmpty()){
			return;
		}
		System.out.println(" No \t Index ");
		System.out.println("----\t ------");
		for(int i=0;i<list.size();i++){
			System.out.println(" "+i+" \t "+list.get(i));
		}
		
	}
	

}
