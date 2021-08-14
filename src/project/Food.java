package project;

public abstract class Food {
	protected double cost;
	
	public Food(double a) {
		cost = a;
	}
	
	public void setCost(double x) {
		cost = x;
	}
	
	public double getCost() {
		return cost;
	}
	
	public abstract boolean availblityOfFood() {
	}
	
	

}



