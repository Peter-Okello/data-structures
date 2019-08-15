/**
 * 
 */
package data_structures;

/**
 * @author peterokello
 *
 */
public class DS_main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Simple_Stack<String> simple_Stack  = new Simple_Stack<>();
		
		simple_Stack.push("James");
		simple_Stack.push("Sasha");
		
		System.out.println(simple_Stack);
		
		simple_Stack.pop();
		
		System.out.println(simple_Stack);
	}

}
