/**
 * 
 */
package data_structures;

/**
 * @author peterokello
 *
 */

public class Simple_Stack<T> implements Stack<T> {

	/**
	 * 
	 */
	
	private T[] array;
	private int total;
	
	public Simple_Stack() 
	{
		// TODO Auto-generated constructor stub
		array = (T[]) new Object[2];
	}
	
	private void resize(int capacity)
	{
		T[] tmp = (T[]) new Object[capacity];
		System.arraycopy(array, 0, tmp, 0, total);
		array = tmp;
	}
	
	public Simple_Stack<T> push(T element)
	{
		if(array.length == total)
			resize(array.length * 2);
		array[total++] = element;
		
		return this;
	}
	
	public T pop()
	{
		if(total == 0)
			throw new java.util.NoSuchElementException();
		T element = array[--total];
		array[total] = null;
		if(total > 0 && total == array.length / 4)
			resize(array.length / 2);
		return element;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return java.util.Arrays.toString(array);
	}
}
