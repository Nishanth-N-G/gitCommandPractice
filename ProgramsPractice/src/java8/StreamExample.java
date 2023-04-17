package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }  
}  

public class StreamExample {

	public static void main(String[] args) {
		List<Product> productsList = new ArrayList<Product>();  

        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f)); 
          
        List<Float> productPriceList = productsList.stream()  
                .filter(p -> p.price > 30000)  
                .map(p->p.price)         
                .collect(Collectors.toList());   
        System.out.println("productPriceList "+productPriceList);
        
        productsList.stream()  
        			.filter(product -> product.price == 30000)  
        			.forEach(product -> System.out.println("productName "+product.name));  
        
        Float totalPrice = productsList.stream()  
                .map(product->product.price)  
                .reduce(0.0f,(sum, price)->sum+price);   
        System.out.println("totalprice " +totalPrice); 
        
        Product productMax= productsList.stream().max((product1,product2)->product1.price>product2.price?1:-1).get();
        System.out.println(productMax.price);
        
        Product productMin= productsList.stream().max((product1,product2)->product1.price<product2.price?1:-1).get();
        System.out.println(productMin.price);
        
        Stream.iterate(1, element->element+1).filter(element->element%5==0).limit(5).forEach(System.out::println);
        
        Set<Float> set= productsList.stream()
        							.map(product->product.price)
        							.collect(Collectors.toSet());
        System.out.println("set "+set);
        
        Map<Integer, Float> map= productsList.stream()
											.collect(Collectors.toMap(p->p.id, p->p.price));
        System.out.println("map "+map);

	}

}
