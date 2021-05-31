package abstract_ion;
interface Webdriver{
	public void openapp();
	public void closeapp();
}
class Firefoxdriver implements Webdriver{
	public void openapp() {
		System.out.println(" firefox open");
	}
	
	@Override
	public void closeapp() {
		// TODO Auto-generated method stub
		System.out.println(" close firefoxfox");
		
	}
}
public class Chromedriver implements Webdriver{
	public void openapp() {
		System.out.println(" chromedriver open");
	}
@Override
public void closeapp() {
	// TODO Auto-generated method stub
	System.out.println(" chromedriver close");
}
public static void main(String[] args) {
	Firefoxdriver f=new Firefoxdriver();
	f.openapp();
	f.closeapp();
	Chromedriver c=new Chromedriver();
	c.openapp();
	c.closeapp();
	Webdriver d=new Firefoxdriver();
	d.openapp();
	d.closeapp();
	Webdriver d1=new Chromedriver();
	d.openapp();
	d.closeapp();
}
	
}




