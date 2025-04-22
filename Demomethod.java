public class Demomethod{
	// instance variable
	public String name="Hello";
	
	//static variable
	static String res="world";
	
	void display()
	{
		//local variable
		String val="Bhavana";
		System.out.println(name);
    System.out.println(val);
	}
	
	public static void main(String args[])
	{
		Demomethod obj=new Demomethod();
		obj.display();
		System.out.println(res);
	}
}
