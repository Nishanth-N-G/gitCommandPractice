package java5;

public class EnumExample {
	
	public enum Name{VISHWA, VIKAS, VINOD, VIPRAV};
	
	public static void main(String[] args) {
		for(Name name:Name.values()) {
			System.out.print(name);
		}
		
		//System.out.println(Name.Naveen);

	}

}
