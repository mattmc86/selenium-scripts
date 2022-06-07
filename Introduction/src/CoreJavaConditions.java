import java.util.ArrayList;

public class CoreJavaConditions {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		//get even numbers
		
		for(int i=0; i<arr.length;i++)
		{
			if (arr[i] % 2 == 0)
			{
			System.out.println(arr[i]);
			break; //this will stop the loop as soon as first condition is met
		
			}
			else
			{
			System.out.println("not even");
			}
		}
		
		//Array List
		
		ArrayList<String> a = new ArrayList<String>();
		
		// create object of the class - access by object.method
		
		a.add("Science");
		a.add("Maths");
		a.add("English");
		a.add("PE");
		
		//a.remove(2);
		
		System.out.println(a.get(3));
		
		

	}

}
