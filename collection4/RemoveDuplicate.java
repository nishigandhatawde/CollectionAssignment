package collection4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//WAP to store elements in List and remove all duplicates names of items. After 
//duplicates are removed print all elements in descending order. 
public class RemoveDuplicate {
public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	list.add("laptop");
	list.add("mobile");
	list.add("laptop");
	list.add("tv");
	list.add("fridge");
	list.add("washingmachine");
	list.add("tv");
	System.out.println(list);
	
	 List<String> newList=list.stream().distinct().collect(Collectors.toList());
	 
	 Collections.sort(newList);
	 System.out.println(newList);
	
	
	

	
	
	
}
}
