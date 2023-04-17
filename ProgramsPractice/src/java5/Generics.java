package java5;

import java.util.ArrayList;

public class Generics {

	public static void main(String[] args) {
		
		ArrayList arrList=new ArrayList();
		
		arrList.add(10);
		arrList.add("10");
		arrList.add("Java");
		
		System.out.print(arrList);
		
		ArrayList<Integer> arrList2=new ArrayList<Integer>();
		
		arrList2.add(10);
		//arrList2.add("10"); //compile time error
		//arrList2.add("Java"); //compile time error
		
		System.out.print(arrList2);
	}

}
