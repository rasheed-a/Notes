/**
import java.util.Scanner;

public class Hotel {
	
	public static void main(String[] args) {
		Hotel h = new Hotel();
		h.runMenu();
	}
	
	private Room r101 = new Room("101", 98.27);
	private	Room r105 = new Room("105", 53.12);
	private	Room r203 = new Room("203", 162.14);
	
	public Room getRoom(String room) {
		if(room.equals("101")) { // room 101
			return r101;
		} else if(room.equals("105")) { // room 105
			return r105;
		} else if(room.equals("203")) { // room 203
			return r203;
		} else { // no such room
			return null;
		}
	}
	
	public void runMenu() {
		Scanner input = new Scanner(System.in);
		
		char option;
		
		do {
			System.out.println("Check (I)n");
			System.out.println("Check (O)out");
			System.out.println("(D)isplay rooms");
			System.out.println("(Q)uit program");
			System.out.println("Enter an option: ");
			option = input.nextLine().charAt(0); // charAt(0) gets 1st char in string
			
			switch(option) {
			case 'I':
				System.out.println("Enter guest name: ");
				String name = input.nextLine();
				System.out.println("Enter requested room number: ");
				String room = input.nextLine();
				System.out.println("How many nights: ");
				int nights = input.nextInt();
				input.nextLine(); //consume the int line
				Room r = getRoom(room); // identifies which room to talk to
				r.setOccupied(true);
				r.setNights(nights);
				r.setName(name);
				break;
			case 'D':
				System.out.println(r101);
				System.out.println(r105);
				System.out.println(r203);
				break; // end of case
			case 'Q':
				System.out.println("Okay. See ya");
			}
			
		} while(option != 'Q');
		
//		r1.setOccupied(true);
//		r1.setNights(4)
//		r1.setName("Dr.Wilbur Q. Willowbottom IV, Esq.");
//		System.out.println(r1);
//		System.out.pintln(r2)
	}
	
}
**/

// mb