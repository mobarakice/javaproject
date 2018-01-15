package util;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CountRepeatedWords {

	 
	public static void main(String[] args) {
		String s = "Hello! this is a first java program. Java is most popular programing language. java";
		String p = "java";
		int count = countWordFromAStringFileRecursively(s, p);
		System.out.println(count);
//		long t1 = System.nanoTime();
//		int count = countHi("Hi! I am mobarak");
//		long t2 = System.nanoTime();
//		System.out.println(count+"\n"+"Time taken "+(t2-t1)+" miliseconds");
//		
//		long t3 = System.nanoTime();
//		int count2 = countHi2("Hi! I am mobarak");
//		long t4 = System.nanoTime();
//		System.out.println(count2+"\n"+"Time taken "+(t4-t3)+" miliseconds");
		
//		System.out.println(strCount("iiiijj","ii"));
		
//		int count = countRepeatWord(s, p);
//		System.out.println(count);
		
		//findDuplicate(s);
		//countRepeatedWord(s);
		 
	}
	
	public static int countWordFromAStringFile(String s, String pattern){
		String temp = s;
		int count = 0;
		while(temp.length()>0){
			int index = temp.indexOf(pattern);
			//System.out.println(index);
			if(index != -1){
			   temp = temp.substring(index+pattern.length(),temp.length());
			}else{
				break;
			}
			count++;
		}
		return count;
	}
	
	public static int countWordFromAStringFileRecursively(String s, String pattern){
		if(s.length()<=0){
			return 0;
		}
			int index = s.indexOf(pattern);
			if(index != -1){
			s = s.substring(index+pattern.length(),s.length());
			return 1+ countWordFromAStringFileRecursively(s, pattern);
			}else{
				return 0;
			}
	}
	
/*	public static int countHi(String str) {
		  if(str.length()<2){
			  return 0;
		  }
		  int count = 0;
		  int index = str.indexOf("hi");
		  if(index != -1){
			  str = str.substring(index+2,str.length());
			  count++;
		  }else {
			  return 0;
		  }
		  return count+countHi(str);
		  
	}
	public static int countHi2(String str) {
		  if (str.length() <= 1) return 0;
		  int count = 0;
		  if (str.substring(0, 2).equals("hi")) count = 1;  // could use startsWith()
		  return count + countHi(str.substring(1));
		}
*/	
	
	
	public static int countX(String str) {
		  if (str.length() < 1) return 0;
		  int count = 0;
		  if (str.substring(0,1).equals("x")){
			  count++;  // could use startsWith()
		  }
		  return count + countX(str.substring(1));
		}
	
	public static int strCount(String str, String sub){
		if(str.length()<sub.length()){
		    return 0;
		  }
		  int index = str.indexOf(sub);
		  if(index != -1){
		    return 1+ strCount(str.substring(index+sub.length(),str.length()),sub);
		  }
		  return 0;
	}
	
	public static int countRepeatWord(String s, String p){
		//s = s.toLowerCase();
		//p = p.toLowerCase();
		//System.out.println(s+"\n"+p);
		String[] temp = s.split(" ");
		int count = 0;
		for(String word:temp){
			if(word.equalsIgnoreCase(p)) count++;
		}
		 
		return count;
	}
	
	//Count repeated word using Map.
	public static Map<String,Integer> findDuplicate(String s){
		String[] temp = s.toLowerCase().split(" ");
		Map<String,Integer> wordMap = new HashMap<String,Integer>();
		for(String word:temp){
			Integer count = wordMap.get(word);
			if( count == null){
				 count = 0;
			}
			wordMap.put(word, count+1);
		}
        //Retrieve word and number of repeat
		for(Map.Entry m: wordMap.entrySet()){
			System.out.println(m.getKey()+" : "+m.getValue());
		}
		// Retrieve which word is repeat maximum
		Map.Entry<String, Integer> maxEntry = null;
		for(Map.Entry<String,Integer> entry: wordMap.entrySet()){
			if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
		        maxEntry = entry;
		    }
		}
		
		System.out.println("\n\nMaximum repeating word is: "+maxEntry.getKey()
				+"\nAnd it repeated "+maxEntry.getValue()+" times");
		
		return wordMap;
	}
	
	// Count repeated word using Collection.frequency() method
	public static void countRepeatedWord(String s){
		//String[] temp = s.toLowerCase().split(" ");
		List<String> temp = Arrays.asList(s.toLowerCase().split(" "));
		Set<String> words = new HashSet<String>(temp);
		for(String word: words){
			System.out.println(word+" : "+Collections.frequency(temp, word));
		}
 	}

}
