package collection1;
//WAP to sort Collection elements in ascending order
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SortAscending {
public static void main(String[] args) {
	ArrayList a=new ArrayList();
	a.add(30);
	a.add(60);
	a.add(10);
	a.add(40);
	Collections.sort(a);
	System.out.println(a);
}
}
