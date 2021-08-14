package project;

public class ParathaRoll extends Food {

	protected String meatType; //Beef, chicken and mutton
	protected boolean cheese;
	
	
	public ParathaRoll(double m, String a, boolean b) {
		super(m);
		meatType = a;
		cheese = b; 
		
		
	}
	
	public void setMeat(String a) {
		meatType = a;
	}
	public String getMeat() {
		return meatType;
	}
	
	public void setCheese(boolean b) {
		cheese = b;
	}
	public boolean getCheese() {
		return cheese;
	}
	
	
	
	
	public boolean availblityOfFood() {
		return true;
	}
	
	










}
