package project;

public class Roti extends Food {

	protected String type; //naan, roti and rogni etc
	protected int quantity; 
	
	
	public Roti(double m,String a, int b) {
		super(m);
		type = a;
		quantity = b; 
		
	}
	
	public void setType(String a) {
		type = a;
	}
	public String getType() {
		return type;
	}
	
	public void setQuantity(int b) {
		quantity = b;
	}
	public int getQuantity() {
		return quantity;
	}
	
	
	public boolean availblityOfFood() {
		return true;
	}
	

}
