package collection6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;

//WAP to store data in hashmap. Keys are the city name and values are the population. 
//Now you have to sort the all elements (on the basis of city name ) in hashmap and 
//print the detail
public class HashmapCityPopulation {

	static HashMap<String, Integer> hashmap = new HashMap<>();
    
	public static void sortbykey()
	        {
	            ArrayList<String> sortedKeys
	                = new ArrayList<String>(hashmap.keySet());
	     
	            Collections.sort(sortedKeys);
	     
	           
	            for (String x : sortedKeys)
	                System.out.println("Key = " + x);
	                                   
	        }
	        public static void main(String args[])
	        {
	          
	            hashmap.put("Pune", 80);
	            hashmap.put("indore", 90);
	            hashmap.put("Nagar", 80);
	            hashmap.put("Nanded", 75);
	            hashmap.put("Mumbai", 40);
	            
	            System.out.println(hashmap);
	               sortbykey();
	        }
	
	
}

