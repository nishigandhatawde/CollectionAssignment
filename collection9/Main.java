package collection9;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
public static void main(String[] args) {
	CopyOnWriteArrayList<Employee>list=new CopyOnWriteArrayList<>();
	Employee emp=new Employee(100,"nishigandha",45000,"IT","Pune");
	Employee emp1=new Employee(101,"shital",50000,"Testing","Mumbai");
	Employee emp2=new Employee(102,"komal",60000,"CS","solapur");
	Employee emp3=new Employee(103,"pallavi",55000,"DataScience","Thane");
	
	list.add(emp);
	list.add(emp1);
	list.add(emp2);
	list.add(emp3);
	
	
	
	for (Employee employee : list) {
		int objectElement=employee.getEmpid();
		 int index=objectElement%10;
		 list.add(index, employee);
	}
	list.forEach(System.out::println);
}



}

