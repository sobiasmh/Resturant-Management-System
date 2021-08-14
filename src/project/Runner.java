package project;
import java.util.Scanner;
public class Runner {
	static Scanner input=new Scanner(System.in);

	public static void main() {
		Biryani b = new Biryani(150, "Beef", "High", 1, true);
		Karhai k = new Karhai(200, "Chicken", "White", "Half");
		Kebabs keb = new Kebabs(50, "Mutton", "Seekh", 3, false);
		ParathaRoll p = new ParathaRoll(100, "Chicken", true);
		Roti r = new Roti(10, "Naan", 3);
		Drinks d = new Drinks(30, "Soft", "Sprite", true);
		Order o = new Order(true);
		int choice;
		double sum=0;
		String order="";

		do {
			
			System.out.println("Enter 1,2,3 etc to add to the cart and 0 to Exit");
	        choice=input.nextInt();
	        switch(choice){
	        case 0:break;
            case 1:
            	System.out.println("Biryani"+"\n");
                    sum=sum+ o.calculateBill(1);
                    order=order.concat("Biryani"+"\n");
                break;
            case 2:
                System.out.println("Karhai");
                sum=sum+ o.calculateBill(2);
                order=order.concat("Karhai"+"\n");
                
                   break;
            case 3:
                System.out.println("Kebabs");
                sum=sum+ o.calculateBill(3);
                order=order.concat("Kebabs"+"\n");
                  break;
            case 4:
                System.out.println("Paratha Roll");
                sum=sum+ o.calculateBill(4);
                order=order.concat("Paratha Roll"+"\n");
                  break;
            case 5:
                System.out.println("Roti");
                sum=sum+ o.calculateBill(5);
                order=order.concat("Roti"+"\n");
                  break;
            case 6:
                System.out.println("Drinks");
                sum=sum+ o.calculateBill(6);
                order=order.concat("Drinks"+"\n");
                  break;
            default:
                System.out.println("Wrong input");
	        }
	        

		
		

    System.out.println("Your Orders are:\n"+order);
    System.out.println("Your total bill="+sum);
    System.out.println("Thank you");
    }
		while(choice!=0);
		}
}
