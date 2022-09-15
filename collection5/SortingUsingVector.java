package collection5;
//WAP to store data related to item in Vector and after that sort the data. 
import java.util.Collections;
import java.util.Vector;

public class SortingUsingVector {
public static void main(String[] args) {
	


Vector v=new Vector();
v.add("a");
v.add("d");
v.add("f");
v.add("b");
v.add("c");
v.add("e");

System.out.println(v);

Collections.sort(v);
System.out.println(v);
}
}
