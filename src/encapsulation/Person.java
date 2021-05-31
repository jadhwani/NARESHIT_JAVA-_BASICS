package encapsulation;

public class Person {
	private String s="java";
	private int Age= 20;
	public void name() {
		System.out.println("my name is:"+s);
		System.out.println("my age:"+Age);
	}
	public static void main(String[] args) {
		Person p=new Person();
		p.name();
		
	}

}
