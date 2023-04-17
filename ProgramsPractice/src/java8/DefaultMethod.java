package java8;

interface DefaultExample{
	void abstractMethod(String str);
	
	default void defaultMethod() {
		System.out.println("Hello, i'm default method");
	}
}

public class DefaultMethod implements DefaultExample{

	public static void main(String[] args) {
		DefaultExample defEx=new DefaultMethod();
		defEx.abstractMethod("i'm abstract method");
		defEx.defaultMethod();

	}

	@Override
	public void abstractMethod(String str) {
		System.out.println(str);
	}

}
