/**
 * 
 */
package data_structures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author peterokello
 *
 */
public class Set_example
{	
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Set<String> country = new HashSet<String>();
		Set<String> currency = new HashSet<String>();
		
		country.add("Great Britain");
		currency.add("BP-0.427");
		
		country.add("France");
		currency.add("EUR-1.097");
		
		country.add("Kenya");
		currency.add("KES-0.043");
		
		country.add("Kenya");
		currency.add("KES-0.043");
		
		System.out.println(country);
		System.out.println(currency);
		
		//Set using Tree Set
		Set<String> list = new TreeSet<String>(country);
		Set<String> list_2 = new TreeSet<String>(currency);
		
		System.out.println("\nUsing TreeSet \n \n" +country);
		System.out.println(currency);

		

		
		
		

	}

}
