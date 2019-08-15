/**
 * 
 */
package data_structures;

import java.util.HashSet;

/**
 * @author peterokello
 *
 */
public class HashSet_example 
{

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		HashSet<String> countries = new HashSet<>();
		countries.add("Mali");
		countries.add("Kenya");
		countries.add("Spain");
		countries.add("Japan");
		countries.add("Fiji");
		
		System.out.println("List of countries in HashSet\n" +countries +"\n");
		
		System.out.println("List of contains Kenya: " +countries.contains("Kenya") +"\n");
		
		countries.remove("Japan");
		
		System.out.println("HashSet with Asian countries remove: \n" +countries);

	}

}
