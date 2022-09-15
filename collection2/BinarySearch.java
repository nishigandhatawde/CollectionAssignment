package collection2;
//WAP to store all Collection elements in Array and perform the Binary Search
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BinarySearch {
public static void main(String[] args) {
	List<Integer> al = new ArrayList<Integer>();
    al.add(1);
    al.add(2);
    al.add(3);
    al.add(10);
    al.add(20);
    
    int index = Collections.binarySearch(al, 10);
    System.out.println(index);

    //13 is not present. 13 would have been inserted
    // at position 4. So the function returns (-4-1)
    // which is -5.
    index = Collections.binarySearch(al, 13);
    System.out.println(index);
    
    index=Collections.binarySearch(al,15);
    System.out.println(index);
}
}
