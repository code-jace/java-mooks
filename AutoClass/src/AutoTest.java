
public class AutoTest {

	/*
	 * Name: 		Oisín Hennessy
	 * StudentID:	20063948
	 * Date:		21/1/2016
	 * 
	 * +++QUESTION ANSWERS+++
	 * 1. 	The instance variables in the implementation code are declared at the top, in the public class.
	 * 		They are labeled in this case.
	 * 
	 * 2.	Accessors are used to Access or get a variable from an object.
	 * 		Mutators are used to Mutate, alter or set a variable in an object.
	 * 
	 * 3.		
	 */
	public static void main(String[] args) {
		Auto superCar, familyCar; //Declaration of objects
		
		//Initialise superCar
		superCar = new Auto( "Tesla", 100, 50.5 );
		//Initialise familyCar
		familyCar = new Auto( "PzIV", 2053, 60 );
				
		//Mutate superCar
		superCar.setMilesDriven(200);
		
		//Access and Display
		System.out.println("SuperCar Model: "+superCar.getModel());
		System.out.println("SuperCar MilesDriven: "+superCar.getMilesDriven());
		System.out.println("SuperCar GallonsOfGas: "+superCar.getGallonsOfGas());
		System.out.println();
		System.out.println("FamilyCar Model: "+familyCar.getModel());
		System.out.println("FamilyCar MilesDriven: "+familyCar.getMilesDriven());
		System.out.println("FamilyCar GallonsOfGas: "+familyCar.getGallonsOfGas());

	}

}
