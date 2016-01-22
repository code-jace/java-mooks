/*
 * Name: Oisín Hennessy
 * IDNo: 20063948
 * Date: 21/1/2016
 * STUDENT CLASS
 */
public class Student {

	private String id;
	private String stuName;
	private int gradeAverage;
	
	//Default Constructor
	public Student() {
		super();
	}

	//Parameterised Constructor
	public Student(String id, String stuName, int gradeAverage) {
		super();
		this.id = id;
		this.stuName = stuName;
		this.gradeAverage = gradeAverage;
	}
	
	

	//Accessors + Mutators for id
	public String getId() { //Accessor
		return id;
	}
	public void setId(String id) { //Mutator
		this.id = id;
	}
	//Accessors + Mutators for stuName
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	//Accessors + Mutators for gradeAverage
	public int getGradeAverage() {
		return gradeAverage;
	}
	public void setGradeAverage(int gradeAverage) {
		this.gradeAverage = gradeAverage;
	}

}
