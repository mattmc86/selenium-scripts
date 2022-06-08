public class CoreJavaMethods {

	public static void main(String[] args) {
	//to call method create object of the method
		CoreJavaMethods d = new CoreJavaMethods ();
		// then call method like below
		String name = d.getData2(); // this one if not static in getData method
		String name2 = getData(); // this one if getData method is static
		System.out.println(name);
		MethodsDemo2 d1 = new MethodsDemo2();
		d1.getUserData(); //from other class
		getData();
		
		
	}

	//create methods outside of main block, as its public can be used in other classes
	//next word is what the method returns e.g. int or string, if nothing its void
	//static means it belongs to class not object
	public static String getData()
	{
		System.out.println("Hello");
		return "greetings";
		
	}
	
	public String getData2()
	{
		System.out.println("Hello2");
		return "greetings2";
		
	}
	
}
