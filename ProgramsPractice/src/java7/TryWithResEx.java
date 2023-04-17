package java7;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class TryWithResEx {

	public static void main(String[] args) {

//		try (FileOutputStream fileOutputStream = new FileOutputStream("abc.txt")) {
//			String msg = "Welcome to the example";
//			byte byteArray[] = msg.getBytes(); 
//			fileOutputStream.write(byteArray);
//			System.out.println("Message written to file successfuly!");
//		} catch (Exception exception) {
//			System.out.println(exception);
//		}
		
		try(FileOutputStream fileOutputStream = new FileOutputStream("abc.txt");  
		        FileInputStream fileInputStream = new FileInputStream("abc.txt")){  
		          
		        String msg = "Welcome to javaTpoint!";      
		        byte byteArray[]= msg.getBytes();
		        fileOutputStream.write(byteArray);  
		        System.out.println("Data written into file");  
		        System.out.println(msg);  
		          
		       DataInputStream inst=new DataInputStream(fileInputStream);
		       int data= fileInputStream.available();
		       byte byteArray2[]=new byte[data];
		       inst.read(byteArray2);
		       String str= new String(byteArray2);
		       System.out.println("Data reading from file");
		       System.out.println(str);
		        
		}catch(Exception exception){  
		       System.out.println(exception);  
		}  finally{  
		       System.out.println("Finally executes after closing of declared resources.");  
		}   

	}

}
