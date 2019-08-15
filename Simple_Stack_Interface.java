/**
 * 
 */
package data_structures;


/**
 * @author peterokello
 *
 */
public interface Simple_Stack_Interface
{

	
	 void isEmpty();
	
	 void size();
	
	 void resize();
	 
	 void peek();
	
	 void pop();
	 
	 void push();
	
}

interface Stack<T>
{
	Stack<T> push(T elememnt);
	T pop();
}