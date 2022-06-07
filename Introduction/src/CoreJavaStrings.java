
public class CoreJavaStrings {

	public static void main(String[] args) {
		
		//string is an object
		//string literal - this will not create new object if value is the same
		String s = "   Matthew James McKenna   ";
		//String s1 = "Matthew";
		//System.out.println(s);
		
		//string with new keyword - this will create another object
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");
		
		String[] splittedString = s.split("James"); //this will turn s into an array
		System.out.println(splittedString[1]);
		System.out.println(splittedString[0].trim());
		
		//print string in reverse
		for(int i=s.length()-1;i>=0;i--)
		
		{
			System.out.println(s.charAt(i));
		}
		
		
		
		
	}

}
