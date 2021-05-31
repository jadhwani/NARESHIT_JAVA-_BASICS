package methodoverloading;

public class Overload {
	public void a(int a,int b) {
		System.out.println(" different signature");
		System.out.println(a+b);
		
	}
	public void a(int a,int b,int c ) {
		System.out.println(" different signature");
		System.out.println(a+b+c);
		
	}
	public static void main(String[] args) {
		Overload o=new Overload();
		o.a(10, 20);
		o.a(20, 20, 10);
	}

}
