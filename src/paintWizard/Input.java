package paintWizard;

import java.util.Scanner;

public class Input {

	public static float userInput() {
		Scanner read = new Scanner(System.in);
		String input;
		float totalSurfaceArea = 12.0f;
		boolean cont = true;
	
		do {
			System.out.println("Please enter the total area of the surface you wish to paint in m^2. e.g. given 4");
			System.out.println("walls of 3m by 2m, total surface area = 24m^2:");
			
			System.out.print("> ");
			input = read.next();
			
			try {
				totalSurfaceArea = (float) Float.parseFloat(input);
				
				if (totalSurfaceArea > 0.0f) {
					cont = false;
				} else {
					cont = true;
					System.out.println("INVALID INPUT");
					System.out.println();
				}
			} catch (NumberFormatException e) {
				cont = true;
				System.out.println("INVALID INPUT");
				System.out.println();
			}
		} while (cont == true);
	
		read.close();
		return totalSurfaceArea;
	}
}