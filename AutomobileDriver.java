import java.util.Scanner;

/**
 * 
 */

/**
 * @author CamilleDayao
 *@Description : To set and display the specs of the automobile
 *@DateCreated : 23/05/2022
 */
public class AutomobileDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);		//initialize scanner
		
		System.out.print("How many cars do you want to consider? ");
		int numCar = scan.nextInt();		// scan the number of automobile
		int counter = 0;
		Automobile auto = new Automobile();
		
		while(counter<numCar) {		
			auto.setMake();
			auto.setColor();
			auto.printColor();
			auto.printMake();
			counter++;
		}
			
		}
}

