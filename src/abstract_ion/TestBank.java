package abstract_ion;

abstract class Bank 
{
	abstract void credit();
	abstract void debit(); 
	}
class HDFC extends Bank
{ 
	void credit() 
	{ 
		System.out.println("Amount credit from HDFC");
		} 
	void debit() 
	{ 
		System.out.println("Amount debited from HDFC"); 
		}
	} 
class ICICI extends Bank
{
	void credit()
	{ 
     System.out.println("Amount credit from ICICI");
     } 
	void debit()
	{
		System.out.println("Amount debited from ICICI");
		}
	}
public class TestBank 
 { 
	public static void main(String args[])
	{
		HDFC h = new HDFC();
		h.credit(); 
		h.debit(); 
		ICICI i = new ICICI(); 
		i.credit(); 
		i.debit();
	}
 }
