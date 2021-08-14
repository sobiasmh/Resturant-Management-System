package project;
import java.util.Scanner;

public class Order  {
	
		private boolean order;
	 	private Biryani b;
	    private Karhai k;
	    private Kebabs kb;
	    private Roti r;
	    private ParathaRoll pr;
	    private Drinks d;
	    private double total;
	    static Scanner input = new Scanner(System.in);
	    
	    public Order(boolean order) {
	    	this.order = order;
	    	
	    }
	    
	    public void setTotal(double a) {
	    	total = a;
	    }
	    public double getTotal() {
	    	return total;
	    }
	    public void setorder(boolean a) {
	    	order = a;
	    }
	    public boolean getOrder() {
	    	return order;
	    }
	    public void setBiryani(Biryani bir) {
	    	b = bir;
	    }
	    public Biryani getBiryani() {
	    	return b;
	    }
	    public void setKarhai(Karhai ker) {
	    	k = ker;
	    }
	    public Karhai getKarhai() {
	    	return k;
	    }
	    public void setKebabs(Kebabs kebs) {
	    	kb = kebs;
	    }
	    public Kebabs getKebabs() {
	    	return kb;
	    }
	    public void setRoti(Roti ro) {
	    	r = ro;
	    }
	    public Roti getRoti() {
	    	return r;
	    }

	    public void setParathaRoll(ParathaRoll par) {
	    	pr = par;
	    }
	    public ParathaRoll getParathaRoll() {
	    	return pr;
	    }
	    public void setDrinks(Drinks dr) {
	    	d = dr;
	    }
	    public Drinks getDrinks() {
	    	return d;
	    }
	    
	    
	    public double calculateBill(int foodItem) {
	    	if (foodItem == 1) {
	    		//biryani
	            if(b.aloo==true) {
            		total = b.cost+10;}
            else {
            	total = b.cost;
            }
	    	}
	    	if (foodItem == 2) {
	    		//karhai
	    		total = k.cost;        
	        }
	    	if (foodItem == 3) {
	            // Kebabs = Rs.50  	
	             if(kb.chatni==true) {
	             		total = kb.cost+20;}
	             else {
	             	total = kb.cost;
	             }
	        }
	    	if (foodItem == 4) {
	            // Paratha Roll = Rs.100	        	 
	    		if(pr.cheese==true) {
	             		total = pr.cost+40;}
	             else {
	             	total = pr.cost;
	             }        }
	        if (foodItem == 5) {
	            // Roti  = Rs.10        	 
	             	total = r.cost;             
	        }
	        if (foodItem == 6) {
	            // Drinks  = Rs.30	        	 
	             if(d.ice==true) {
	             	total = d.cost+10;}
	             else {
	            	 total = d.cost;
	             }	             
	        }
	        return total;
	    }
	    
	    public double quantity() {
	        System.out.println("Enter quantity");
	        double quantity = input.nextDouble();
	        subTotal(quantity, total);
	        return quantity;
	    }

	    public double subTotal(double quantity, double total) {
	        double subTotal = quantity * total;
	        System.out.println("Subtotal: " + subTotal);
	        return subTotal;
	    }

	    public void done(double runningTotal) {
	        order = false;
	        System.out.println(runningTotal);
	        System.out.println("Enjoy your meal");
	    }


	}

	    


