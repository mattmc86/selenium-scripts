public class CoreJava1 {

	public static void main(String[] args) {
		int myNum = 5;
		int yourNum = 10;
		String myName = "Matt";
		char letter = 'j';
		double anotherNum = 5.99;
		boolean myCard = true;
		//float can also be used for decimals
		
	//	System.out.println("Name is " + myName + myNum + yourNum);
		
		//Arrays
		int[] myArray  = new int [5];
		myArray[0] = 1;
		myArray[1] = 10;
		myArray[2] = 20;
		myArray[3] = 30;
		myArray[4] = 40;
		
		int[] arr2 = {1,2,4,5,6,75,40};
		
		//System.out.println(myArray[0]);
		//System.out.println(arr2[3]);
		
		//for loop
		for(int i=0; i<myArray.length; i++)
		{
			System.out.println(myArray[i]);
		}
		
		String[] names = {"Matt","Sophie","George"};
		
		for(int i=0; i<names.length; i++)
		{
			System.out.println(names[i]);
			
		}
		//enhanced for loop
		for(String s: names)
		{
			System.out.println(s);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

