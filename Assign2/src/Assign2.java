/*
 * Name: Oisin Hennessy
 * IDno: 20063948
 * Date: 20/1/2016
 */
public class Assign2 {

	public static void main(String[] args) {
		
		//2.1 CONSTRUCTORS
		//Create date objects:
		// I just noticed that the EasyDate dates are in American format :(
		SimpleDate date1; //Using default constructor
		date1 = new SimpleDate(1,20,1016); //Instalise date1
		SimpleDate date2 = new SimpleDate(1,21,2016); //Using parameter list
		//Print Dates
		System.out.println("Date1: " + date1.toString());
		System.out.println("Date2: " + date2.toString());
		System.out.println();
		
		//2.2 ACCESSOR/MUTATOR METHODS
		SimpleDate date3; //Create date object using default constructor
		date3 = new SimpleDate(8,6,1945); //instalise date3 to avoid error
		System.out.println("Day: " + date3.getDay()); //Display day
		System.out.println("Month: " + date3.getMonth()); //Display Month
		System.out.println("Year: " + date3.getYear()); //Display Year
		System.out.println();
		
		date3.setDate(20,3,1980); //Set date to March 20th 1980
		System.out.println(date3.toString());
		System.out.println();
		//Set date to 25th November, 1990 using separate methods
		date3.setDay(25); //Set day to 25
		date3.setMonth(11); //Set month to November --> 11
		date3.setYear(1980); //Set year to 1980
		System.out.println("Date3: " + date3.toString());
		System.out.println(); //break
		
		date3.nextDay(); //increment date by 1
		System.out.println("Advancing Date!");
		System.out.println("Date3 + 1: " + date3.toString());
		
		
	
	}

}
