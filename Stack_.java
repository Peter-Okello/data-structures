/**
 * 
 */
package data_structures;

/**
 * @author peterokello
 *
 *
 *	This is a simple Stack_ implementation
 *	This implementation has the following functions
 *		pop(), push(), peek(), isEmpty()

 *
 */

public class Stack_ 
{
	
	private int stack_max_size;
	private int top_index;

	private int[] array;
	
	public Stack_() 
	{

		
		//set the size of the array
		stack_max_size = 4;
		
		//set top_index to -1
		top_index = 0;
		
		//set the size of the array to  the stack's max size
		array = new int[stack_max_size];
		
	}
	

	
	
	void push(int temp_number)
	{
		//first we check to see if the stack is within the allowable limit
		if (top_index >= stack_max_size - 1) 
		{
			try
			{			
				top_index++;
			}
			catch (Exception e) 
			{
				System.out.println("Ooops... seems there may be a Stack oveflow");
			}
		}
		else
		{
			array[++top_index] = temp_number;
			System.out.println(array[top_index] + " has been pushed onto the Stack");
		}
	}

	
	void pop()
	{
		if (array[top_index] <= 0) 
		{			
			System.out.println("Ooops... seems there may be a Stack underflow");

		}
		else
		{
			int temp_number;
			temp_number = array[top_index--];
			
			System.out.println(temp_number + " has been popped off the Stack");
			
			
		}
		
	}
	
		//function that is going to allow us to peek at top index in array
		void peek()
		{
			System.out.println(array[top_index--] + " is at the peek of the Stack");
		}
	
	//function that is going to see if array is empty
		boolean isEmpty()
		{
			return (array[top_index] < 0); 
			
		}
		
	
	
	public static void main(String[] args) 
	{
		Stack_ ss  = new Stack_();
		ss.push(20);
		
		ss.push(35);
		ss.push(44);
		ss.peek();

		ss.push(90);
		ss.pop();
		ss.push(86);
		ss.pop();
		ss.pop();
		ss.pop();
		ss.peek();

		
	}
}
