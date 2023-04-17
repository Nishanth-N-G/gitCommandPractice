package java8;

import java.util.ArrayList;

public class ForEach {

	public static void main(String[] args) {
		ArrayList<String> games=new ArrayList<String>();
		
		games.add("Cricket");
		games.add("FootBall");
		games.add("BasketBall");
		games.add("Kabaddi");
		
		games.forEach(System.out::println);
		
		games.stream().forEach(System.out::println);
	}

}
