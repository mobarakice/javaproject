package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.stream.

public class ListExample {
	
	private List<String> mList;
	public static void main(String[] args){
		ListExample  example = new ListExample();
//		example.getListForLoop();
//		example.getListForEachLoop();
//		example.getListIterator();
//		example.getListWhileLoop();
//		example.removeItems();
		example.removeAllIetms();
		
	}
	
	private List setList(List<String> list){
	 list = new ArrayList<>();
		for(int i=0;i<10;i++){
			list.add("Index "+i);
		}
		return list;
	}
	
	private void getListForEachLoop(){
		System.out.println("\n----Enhanched For Loop Example----");
		List<String> list = new ArrayList<>();
		list = setList(mList);
		if(list.isEmpty()){
			return;
		}
		System.out.println(" No \t Index ");
		System.out.println("----\t ------");
		for(String index:list){
			System.out.println(list.indexOf(index)+"\t"+index);
		}
		
	}
	
	private void getListForLoop(){
		System.out.println("----------For Loop Example---------");
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
	private void getListIterator(){
		System.out.println("\n-------Iterator Example---------");
		List<String> list = new ArrayList<>();
		list = setList(mList);
		if(list.isEmpty()){
			return;
		}
		System.out.println(" No \t Index ");
		System.out.println("----\t ------");
		Iterator iterator = list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
	}
	
	private void getListWhileLoop(){
		System.out.println("\n-------While Loop Example---------");
		List<String> list = new ArrayList<>();
		list = setList(mList);
		if(list.isEmpty()){
			return;
		}
		System.out.println(" No \t Index ");
		System.out.println("----\t ------");
		int i = 0;
		while(i<list.size()){
			System.out.println(" "+i+" \t "+list.get(i));
			i++;
		}
		
	}
	
	private void getListCollectionStream(){
		System.out.println("\n-------Collection Stream Example---------");
		List<String> list = new ArrayList<>();
		list = setList(mList);
		if(list.isEmpty()){
			return;
		}
		System.out.println(" No \t Index ");
		System.out.println("----\t ------");
		
//		while(iterator.hasNext()){
//			System.out.println(iterator.next());
//		}
		
	}
	private void removeItems(){
		List items = setList(mList);
		if(items.isEmpty()){
			return;
		}
		System.out.println("\n-----Before removing element-----");
		System.out.println(items.toString());
		System.out.println("\n-----After removing element-----");

		// Remove a specific element 
		
//		if(items.get(1).equals("Index 1")){
//			items.remove(1);
//			System.out.println(items.toString());
//		}else{
//			System.out.println("Item is not exist.");
//		}
		
		//remove all element
//		if(!items.isEmpty()){
//			items.removeAll(items);
//		}
		items.clear();
		System.out.println(items.toString());
		
	}
	private void removeAllIetms(){
		// for loop example---
		List<String>items = setList(mList);
		if(items.isEmpty()){
			return;
		}
		System.out.println("\n-----Before removing element-----");
		System.out.println(items.toString());
		System.out.println("\n-----After removing element-----");
//		for(int i = (items.size()-1);i>=0;i--){
//			items.remove(i);
//			System.out.println(items.toString());
//		}
//		for(String item:new ArrayList<>(items)){
//			items.remove(item);
//			System.out.println(items.toString());
//		}
		Iterator<String> iterator = items.iterator();
		while(iterator.hasNext()){
			String s = iterator.next();
			iterator.remove();
			System.out.println("Removed: ");
		}
		System.out.println(items.toString());
	}
	

}
