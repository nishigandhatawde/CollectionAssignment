package collection7;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
public static void main(String[] args) {
	List<Student> studentList=Arrays.asList(new Student(101,"Nishi","IT", 45),
			new Student(102, "Manisha","JAVA", 40),
			new Student(103, "Ashwini","ANGULAR", 70),
			new Student(104, "Unnati","REACT", 75));
	List<Integer> collect2 = studentList.stream().map(Student::getTotalmarks).collect(Collectors.toList());
	
	List<Integer> firstThreeNumbers = collect2.stream().sorted().collect(Collectors.toList());
	
	firstThreeNumbers.forEach(System.out::println);
	
	List<Student> nameBelowFiftyMarks = studentList.stream().filter(s->s.getTotalmarks()<50).collect(Collectors.toList());
	
	nameBelowFiftyMarks.forEach(System.out::println);
	
	List<Student> nameBelowThirtyfive = studentList.stream().filter(s->s.getTotalmarks()<35).collect(Collectors.toList());
	
	nameBelowThirtyfive.forEach(System.out::println);
	List<String> byName = studentList.stream().map(Student::getSname).collect(Collectors.toList());
	byName.forEach(System.out::println);	
	
	

}

}
