package java8;

@FunctionalInterface
interface readable{
	void read(String msg);
}

public class FunctionalInterFace implements readable {

	public static void main(String[] args) {
		readable r=  new FunctionalInterFace();
		r.read("you will read me now");

	}

	@Override
	public void read(String msg) {
		System.out.println(msg);
	}

}
