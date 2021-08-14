package project;

public class Kebabs extends Food{

	protected String meatType; //Beef, chicken and mutton
	protected String type; //seekh, chapli etc
	protected int quantity;
	protected boolean chatni;
	
	public Kebabs(double m, String a, String b, int c, boolean d) {
		super(m);
		meatType = a;
		type = b; 
		quantity = c;
		chatni = d;
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
	
	public void setQuantity(int c) {
		quantity = c;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setChatni(boolean d) {
		chatni = d;
	}
	public boolean getChatni() {
		return chatni;
	}
	
	public boolean availblityOfFood() {
		return true;
	}
	
	
	

}
