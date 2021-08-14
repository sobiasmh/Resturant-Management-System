package project;

public class Biryani extends Food implements DisplayDetails {

	protected String meatType; //Beef, chicken and mutton
	protected String SpiceLevel; //medium, high etc
	protected int Size;
	protected boolean aloo;
	
	public Biryani(double m, String a, String b, int c, boolean d) {
		super(m);
		meatType = a;
		SpiceLevel = b; 
		Size = c;
		aloo = d;
	}
	
	public void setMeat(String a) {
		meatType = a;
	}
	public String getMeat() {
		return meatType;
	}
	
	public void setSpice(String b) {
		SpiceLevel = b;
	}
	public String getSpice() {
		return SpiceLevel;
	}
	
	public void setSize(int c) {
		Size = c;
	}
	public int getSize() {
		return Size;
	}
	public void setAloo(boolean d) {
		aloo = d;
	}
	public boolean getAloo() {
		return aloo;
	}
	
	
	public void displayDetails() {
		System.out.println("Biryani \n1. Plates available = 5 \n2. Available in Beef, Mutton and Chicken \n3. Price: Rs.150");
	}
	
	
}



