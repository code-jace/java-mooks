/*
 * Name: Oisín
 * IDNo: 20063948
 * Date: 21/1/2006
 * STUDENT IMPLEMENTATION 
 */
public class StudentClient {

	public static void main(String[] args) {
		// Declaration
		Student stu1; // using default constructor
		stu1 = new Student("12345", "Yuri", 100); // Initialize
		Student stu2 = new Student("12346", "Tomsk", 50); // Using parameter
															// list

		// Using Mutators
		stu2.setId("11111");
		stu2.setStuName("Sasha");
		stu2.setGradeAverage(90);

		// Using Accessors
		System.out.println("ID: " + stu1.getId() + ". Name: "
				+ stu1.getStuName() + ". Grade Average: "
				+ stu1.getGradeAverage() + ".");

		System.out.println("ID: " + stu2.getId() + ". Name: "
				+ stu2.getStuName() + ". Grade Average: "
				+ stu2.getGradeAverage() + ".");

	}

}
