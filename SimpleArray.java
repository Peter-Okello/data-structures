package data_structures;

public class SimpleArray 
{

	int[] array_simple = {1,2,2,4,5};
	
	private void printArrayElements() 
	{
		// TODO Auto-generated method stub
		
		sumNumbersInArray(array_simple);
		
		
		
	}
	
	void sumNumbersInArray(int[] temp_array)
	{
		
		int sum=0;
		int x;
		
		for (int i = 0; i < temp_array.length; i++) 
		{
			 sum += array_simple[i];
 
			
		}
		
		System.out.println("Sum of all elements in array: " + sum);

		
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		SimpleArray simpleArray = new SimpleArray();
		simpleArray.printArrayElements();


	}

}
