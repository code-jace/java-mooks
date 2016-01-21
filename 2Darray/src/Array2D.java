/*
 * Name: 		Oisín Hennessy
 * StudentID:	20063948
 * Date:		21/1/2016
 */
import java.util.*;
public class Array2D {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in); //Uses sc instead of easy Scanner. More efficient.
		
		/*
		//Take in values for array size (This is not needed for assignment)
		System.out.print("Enter required number of rows: ");
		int rowNo =  EasyScanner.nextInt();
		System.out.print("Enter required number of columns: ");
		int colNo =  EasyScanner.nextInt();		
		*/
		
		//Declare and Initialize dimensions
		int colNo = 4;
		int rowNo = 3;
		
		//Create 2D array
		int[][] array1 = new int[rowNo][colNo];
		
		//User enters values to be inserted in array.
		System.out.println("(one entry per line): ");
		for (int i = 0; i < array1.length; i++){
			for (int j = 0; j < array1[0].length; j++){
				System.out.print("Enter value for (" + i + ", " + j +"): "); 
				array1[i][j] = sc.nextInt();
			}
		}
		
		//Print entered array
		System.out.println();
		System.out.println("Print entered array!! ");
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[0].length; j++){
				System.out.print (array1[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}