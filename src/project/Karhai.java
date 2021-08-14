package project;

public class Karhai extends Food {

	protected String meatType; //Beef, chicken and mutton
	protected String type; //white, green or standard
	protected String quantity; //half, full
	
	public Karhai(double m, String a, String b, String c) {
		super(m);
		meatType = a;
		type = b; 
		quantity = c;
		
	}
	
	public void setMeat(String a) {
		meatType = a;
	}
	public String getMeat() {
		return meatType;
	}
	
	public void setType(String b) {
		type = b;
	}
	public String getType() {
		return type;
	}
	
	public void setQuantity(String c) {
		quantity = c;
	}
	public String getQuantity() {
		return quantity;
	}
	
	
	public boolean availblityOfFood() {
		return true;
	}
	
	








}
