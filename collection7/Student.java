package collection7;

//WAP to store the student class objects in List. Student class structure :-
//Student{ 
//int rollno;
// String sname, classname;
//String totalmarks; // marks out of 500, total five subjects each subject marks 100. 
//}
//On the basis of the detail entered by the user. Now you have to perform the following 
//operations. 
//a) Print the name of students who secure first, second and third position. 
//b) Print name of those students who’s marks are below 50%.
//c) Print name of those students who’s marks are below 35% it means they are 
//fail.
//d) Print name of those students who’s marks are above average score. 
//e) Print detail of all students on the basis of Name
public class Student {

	int rollno;
	String sname;
	String classname;
	int totalmarks;

	public Student(int rollno, String sname, String classname, int totalmarks) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.classname = classname;
		this.totalmarks = totalmarks;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getClassname() {
		return classname;
	}

	public void setClassname(String classname) {
		this.classname = classname;
	}

	public int getTotalmarks() {
		return totalmarks;
	}

	public void setTotalmarks(int totalmarks) {
		this.totalmarks = totalmarks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", classname=" + classname + ", totalmarks="
				+ totalmarks + "]";
	}
//
//	public int getAvg() {
//		// TODO Auto-generated method stub
//		return 0;
//	}

}
