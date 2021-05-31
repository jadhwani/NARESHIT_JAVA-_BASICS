package multilevelinheritance;
class A{
	int a=10;
	int b=20;
	public void selide() {
		System.out.println(" starting parent ");
	}
}
class B extends  A{
	int x=30;
	int y=40;
	public void selwebd() {
		System.out.println(" child ");
	}
}
public class C extends B {
	public void selrc() {
		System.out.println(" grand child");
		System.out.println(x+y);
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		C c1=new C();
		c1.selide();
		c1.selwebd();
		c1.selrc();
		
		
	}

}
