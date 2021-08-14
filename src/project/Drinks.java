package project;

public class Drinks extends Food {

	protected String type; //soft, tea and coffee
	protected String Flavor;
	protected boolean ice;
	
	
	public Drinks(double m, String a, String b, boolean c) {
		super(m);
		type = a;
		Flavor = b;
		ice = c;
		
		
	}
	
	public void setType(String a) {
		type = a;
	}
	public String getType() {
		return type;
	}
	
	public void setFlavor(String b) {
		Flavor = b;
	}
	public String getFlavor() {
		return Flavor;
	}
	
	public void setIce(boolean c) {
		ice = c;
	}
	public boolean getIce() {
		return ice;
	}
	
	
	
	
	public boolean availblityOfFood() {
		return true;
	}
	
	









}
