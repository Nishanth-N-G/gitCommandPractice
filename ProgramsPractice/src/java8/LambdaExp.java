package java8;

@FunctionalInterface
interface Drawable{  
    public void draw();  
}  

public class LambdaExp {

	public static void main(String[] args) {
		
		Drawable d=()->System.out.println("drawing");
		
		d.draw();

	}

}
