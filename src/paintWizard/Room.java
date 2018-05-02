package paintWizard;

public class Room {

	private float totalWallArea;
	
/* ---------- Constructor Methods ---------- */
	
	public Room(float totalWallArea) {
		this.totalWallArea = (float) totalWallArea;
	}
	
/* -------------- Get Methods -------------- */
	
	public float getTotalWallArea() {
		return this.totalWallArea;
	}
	
/* ------------ Object Methods ------------- */
	
	public void paintRoom(Paint paint) {
		int tinsNeeded;
		
		// The number of tins needed to paint the whole room
		tinsNeeded = (int) Math.ceil(totalWallArea / paint.getTotalCoverage());
		// How much leftover paint there will be once the room is painted
		paint.setWastedPaint((tinsNeeded * paint.getTotalCoverage()) - totalWallArea);
		paint.setTotalCost(tinsNeeded * paint.getPrice());
		
		System.out.println("If you use " + paint.getName() + " to paint this room...");
		System.out.println("You will need " + tinsNeeded + " tins of paint.");
		System.out.println("It will cost £" + paint.getTotalCost() + " in total.");
		System.out.println("There will be " + paint.getWastedPaint() + " litres of wasted paint.");
	}
}