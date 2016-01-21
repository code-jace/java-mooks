/*
 * Name: 		Oisín Hennessy
 * StudentID:	20063948
 * Date:		13/1/2016
 */
import java.util.*;
public class Array2D {
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//Take in values for array size
		System.out.print("Enter required number of columns: ");
		int colNo =  sc.nextInt;
		System.out.print("Enter required number of rows: ");
		int rowNo =  sc.nextInt;
		
		//Create 2D array
		int[][] array1 = new int[colNo][rowNo];
		
		//User enters values to be inserted in array.
		System.out.println("(one entry per line): ");
		for (int c1 = 0; c1 < array1.length; c1++){
			for (int c2 = 0; c2 < array1[0].length; c2++){
				System.out.print("Enter value for (" + c1 + ", " + c2 +"): ");
				array1[c1][c2] = sc.nextInt;
			}
		}
		
		//Print entered array
		System.out.println("Print entered array!! ");
		for (int c1 = 0; c1 < array1.length; c1++) {
			for (int c2 = 0; c2 < array1[0].length; c2++){
				System.out.print (array1[c1][c2] + " ");
			}
			System.out.println();
		}
		
	}

}
