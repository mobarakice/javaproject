package io;

import java.io.Console;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOExample {

	 
	public static void main(String[] args) {
		
		//writeFile();
		//readFile();
		//readAndWriteFile();
		readDataFromKeyboardByUsingConsole();

	}
	
	public static void writeFile(){
		try {
			FileOutputStream fo = new FileOutputStream("abc.txt");
			String s = "Bangladesh is a developing country";
			byte[] b = s.getBytes();
			fo.write(b);
			fo.close();
			System.out.println("Success...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readFile(){
		try {
			FileInputStream fi = new FileInputStream("abc.txt");
			int i = 0;
			while((i=fi.read()) != -1){
				System.out.print((char)i);
			}
			fi.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void readAndWriteFile(){
		try {
			FileInputStream inputStream = new FileInputStream("abc.txt");
			FileOutputStream outputStream = new FileOutputStream("test.txt");
			int i = 0;
			while((i=inputStream.read()) != -1){
				outputStream.write(i);
			}
			outputStream.close();
			inputStream.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void readDataFromKeyboardByUsingConsole(){
		Console c = System.console();
		if(c==null){
			System.out.println("Consle is null.");
			return;
		}
		System.out.println("Enter yor name..........");
		String name = c.readLine();
		System.out.println("Your name is "+name);
	}

}
