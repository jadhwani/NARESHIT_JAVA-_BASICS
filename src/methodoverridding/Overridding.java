package methodoverridding;
class Override{
	public void add(int x,int y) {
		System.out.println(" overriding ");
		System.out.println(x+y);
	}
}
public class Overridding extends Override {
	public void add(int x,int y) {
		System.out.println(" overridding");
		System.out.println(x-y);
	}
	public static void main(String[] args) {
		Overridding o1=new Overridding();
		o1.add(45, 5);
//		Override o2=new Override();
		o1.add(71, 6);
	}
	 

}
