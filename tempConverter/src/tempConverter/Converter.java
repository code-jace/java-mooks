/*
 * Name: 		Oisín Hennessy
 * Student no:	20063948
 * Date:		12/1/2016
 * tempConverter
 */

package tempConverter;

public class Converter {
	public static void main(String[]args)
	
	{	
		double tC;
		double tF;
	
		tF = 96;
		tC = (tF - 32) * 5/9;
	
		System.out.println(tF + " degrees Farenheit = " + tC + "degrees Celsius.");
	}
}
