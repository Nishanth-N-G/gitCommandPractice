package java8;

import java.util.Optional;

public class OptinalEx {

	public static void main(String[] args) {
		String[] str = new String[10]; 
		str[5]="5th element";
        Optional<String> checkNull = Optional.ofNullable(str[5]);  
        if(checkNull.isPresent()){   
            String lowercaseString = str[5].toLowerCase();  
            System.out.print(lowercaseString);  
        }else  
            System.out.println("string value is not present");          
	}

}
