import java.util.ArrayList;

class StudentSort {
    
    public static void main(String [] args) {
	ArrayList<Student> roster = new ArrayList<Student>();
	roster.add(new Student(6234567,"Bob",3.25,"CMPSC"));
	roster.add(new Student(7152353,"Charlie",3.96,"CMPSC"));
	roster.add(new Student(2352353,"Alice",3.97,"CMPEN"));
	roster.add(new Student(2888888,"Danielle",4.00,"CMPSC"));
	roster.add(new Student(1152353,"Ed",2.90,"CMPEN"));

	java.util.Collections.sort(roster);
	
	for (Student s: roster) {
	    System.out.println(s);
	}	
    }
}
