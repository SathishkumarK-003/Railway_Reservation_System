package miniproject;
import java.util.Scanner;
public class Miniproject {
    static Scanner in =new Scanner(System.in);
    static Train t=new Train();
    public static void main(String[] args) {
        int choice;
	boolean end=false; 
        do{ 
            System.out.println("1.Booking");
            System.out.println("2.Cancel");
            System.out.println("3.Display All");
            System.out.println("4.Available");
            System.out.println("Enter your choice:");
            choice=in.nextInt();
	    switch(choice) {
	    	case 1:  
                    t.bookTicket(generateTicket());	
                    break;

	    	case 2: 
                    t.cancelTicket(generateTicket());
	    	    break;

	    	case 3:
                    t.displayAllTickets();
	    	    break;
                    
                case 4:
                    t.availableTickets();
                    break;

	    	case 5:
                    end=true;
	    	    break;
            }
        }while(choice!=5);
    }
//   public static void display() {
//	   train.displayTicket();
//   }

    public static Ticket generateTicket() {
	System.out.println("Name:");
	String name=in.next();
	System.out.println("Age:");
	int age=in.nextInt();
	System.out.println("Gender:");
	String gender=in.next();
	System.out.println("Berth preference:");
	String berthpref=in.next();
	return new Ticket(name,age,gender,berthpref);
    }
}