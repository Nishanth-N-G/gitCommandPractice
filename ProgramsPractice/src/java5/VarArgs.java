package java5;

public class VarArgs {

	public static void main(String[] args) {
		display();
		display("my","name","is","java5");
		display("hello");
	}
	
	static void display(String... values) {
		System.out.println("display method invoked ");
		for (String s : values) {
			System.out.print(s+" ");
		}
		System.out.println();
	} 

}
