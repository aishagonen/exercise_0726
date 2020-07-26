package nn;
//SQ:106

class Student {
	
	String name;
	
	public Student(String name) {
		this.name = name;
	}
}

public class N137StudentTest {

	public static void main(String[] args) {
		
		Student[] students = new Student[3];
		
		students[1] = new Student("Richard");
		students[2] = new Student("Donald");

		for (Student s : students) {
			System.out.println("" + s.name);
		}
		
	}

}

/*
	What is the result?
	
	A. null Richard Donald
	B. Richard Donald
	C. Compilation fails.
	D. An ArrayIndexOutOfBoundsException is thrown at runtime.
	E. A NullPointerException is thrown at runtime.




*/