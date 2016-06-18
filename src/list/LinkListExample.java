package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkListExample {
	
	private LinkedList<String> mList; 

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LinkListExample example = new LinkListExample();
		example.setlinkedListItems();
		example.printAllItems();
		 

	}
	
	private void setlinkedListItems(){
		mList = new LinkedList<>();
		for(int i = 0; i<5;i++){
			mList.add("Index value "+(i+1));
		}
	}
	private LinkedList getList(){
		return mList;
	}
	
	private void printAllItems(){
		LinkedList<String> items = getList();
		if(items.isEmpty()){
			return;
		}
		// For Loop Example
		System.out.println("\n----Simple for loop-----");
		System.out.println(" No \t Index ");
		System.out.println("----\t ------");
		for(int i=0;i<items.size();i++){
			System.out.println(" "+i+"\t"+items.get(i));
		}
		
		// Enhanced For Loop Example
		System.out.println("\n----Enhanced for loop-----");
		System.out.println(" No \t Index ");
		System.out.println("----\t ------");
		for(String index: items){
			System.out.println(" "+items.indexOf(index)+"\t"+index);
		}
		
		// Iterator Loop Example
		System.out.println("\n----Iterator loop Example-----");
		System.out.println("     Index  ");
		System.out.println("--------------");
		Iterator<String> iterator = items.iterator();
		while(iterator.hasNext()){
			System.out.println(" "+iterator.next());
		}
	}

}
