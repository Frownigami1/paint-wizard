package paintWizard;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Paint> paintList = new ArrayList<Paint>();
	
		Paint cheapo = new Paint("CheapoMax", 19.99f, 20.0f, 10);
		Paint average = new Paint("AverageJoes", 17.99f, 15.0f, 11);
		Paint dulux = new Paint("DuluxourousPaints", 25.00f, 10.0f, 20);
		Room room;
		
		
		
		paintList.add(cheapo);
		paintList.add(average);
		paintList.add(dulux);
		
		System.out.println("Welcome to Paint Wizard! Got a room to paint? Got some paint? Then you're in luck!");
		System.out.println("Given a room's total surface area and some brands of paint, this program can tell");
		System.out.println("you which is the cheapest or least wasteful to use.");
		System.out.println();

		room = new Room(Input.userInput());
		
		System.out.println();
		
		for (Paint p : paintList) {
			room.paintRoom(p);
			System.out.println();
		}
		
		System.out.println();
		
		float leastFloat;
		int leastIndex = 0;
		leastFloat = paintList.get(0).getTotalCost();
		for (int i = 0; i < (paintList.size() - 1); i++) {
			if (paintList.get(i+1).getTotalCost() < leastFloat) {
				leastIndex = i+1;
			}
		}
		
		System.out.println("The cheapest brand to paint this room with is: " + paintList.get(leastIndex).getName());
		
		leastIndex = 0;
		leastFloat = paintList.get(0).getWastedPaint();
		for (int i = 0; i < (paintList.size() - 1); i++) {
			if (paintList.get(i+1).getWastedPaint() < leastFloat) {
				leastIndex = i+1;
			}
		}
		
		System.out.println("Painting this room using " + paintList.get(leastIndex).getName() + " will result in the least amount of paint being wasted.");
	}
}