package java8;

import java.util.Arrays;
import java.util.List;

public class MethodRef {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);

//		Consumer<Integer> ele = new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer arg0) {
//				System.out.println(arg0);
//			}
//
//		};

		list.forEach(System.out::println);

	}
}
