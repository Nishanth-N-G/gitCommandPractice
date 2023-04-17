package java7;

public class MutipleException {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException, ArithmeticException {
		try{    
            int array[] = new int[10];    
            array[10] = 30/0;    
        }    
        catch(Exception e){  
            System.out.println(e.getMessage());  
        }    
	}

}
