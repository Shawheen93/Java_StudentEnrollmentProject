
public class Driver {

	public static void main(String[] args) {
 
		Student_Info student1 = new Student_Info();
		Student_Info student2 = new Student_Info();
		
	student1.setName("Shawheen");
	student1.setMajor("CS");
	student1.setAge(25);
	student1.setEnroll(true);	
	student2.setName("Mo");
	student2.setMajor("SE");
	student2.setAge(29);
	student2.setEnroll(false);
	
	System.out.println("Student name is "+ student1.getName());
	System.out.println("Student major is "+ student1.getMajor());

	}
	}
