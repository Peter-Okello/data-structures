package data_structures;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMap_example 
{	
	
	public static void main(String[] args) 
	{
		HashMap<Integer, String> zip = new HashMap<>(); //initialize HashMap
		//HashMap of zip that contains the zip number & location
		
		
		//place contents in HashMap
		zip.put(784, "Neptune");
		zip.put(254, "Kenya");
		zip.put(12726, "Venusr");
		zip.put(672, "Nebula");
		zip.put(876176, "Intrega");
		zip.put(12726, "Venus"); //HashMap ignores duplicates
		
		System.out.println(zip); //print all contents in HashMap
		
		zip.remove(784); //remove the content w/ key 784 which is "Neptune"
		
		System.out.println(zip);
		
		Set set = zip.entrySet();
		
		System.out.println(set);
		
		
		Iterator iterator = set.iterator(); 
		
		while(iterator.hasNext())
		{
			Map.Entry mapEntry = (Map.Entry)iterator.next();
			System.out.println("Area zip: "+mapEntry.getKey() 
			+" " +" Area name: " +mapEntry.getValue());
		}
		
		
	}

}
