package paintWizard;

public class Paint {

	private String pName;
	private float price;
	private float quantity;
	private int coverage;
	private float totalCoverage;
	
	private float wastedPaint;
	private float totalCost;
	
/* ---------- Constructor Methods ---------- */
	
	public Paint(String pName, float price, float quantity, int coverage) {
		this.pName = pName;
		this.price = (float) price;
		this.quantity = (float) quantity;
		this.coverage = coverage;
		this.totalCoverage = coverage * quantity;
		
		this.wastedPaint = 0.0f;
		this.totalCost = 0.0f;
	}
	
/* -------------- Get Methods -------------- */
	
	public String getName() {
		return this.pName;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public float getQuantity() {
		return this.quantity;
	}
	
	public int getCoverage() {
		return this.coverage;
	}
	
	public float getTotalCoverage() {
		return this.totalCoverage;
	}
	
	public float getWastedPaint() {
		return this.wastedPaint;
	}
	
	public float getTotalCost() {
		return this.totalCost;
	}
	
/* -------------- Set Methods -------------- */
	
	public void setWastedPaint(float wastedPaint) {
		this.wastedPaint = wastedPaint;
	}
	
	public void setTotalCost(float totalCost) {
		this.totalCost = totalCost;
	}
}