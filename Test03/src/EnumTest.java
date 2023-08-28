import java.util.Scanner;

public class EnumTest {
	enum Grade{G,S,U}
	public static void main(String[] args) {
		String msg = "Unknow";
		System.out.print("Grade Level are : ");
		for(Grade gra:Grade.values())
			System.out.printf("%2s, ",gra);
		
		Scanner scan = new Scanner(System.in);
		System.out.println("\nEnter Your Grade : ");
		String g = scan.nextLine();
		for(Grade gra: Grade.values()) {
			if(g.equalsIgnoreCase(gra.toString())){
				switch(gra) {
				case G: msg = "Good";break;
				case S: msg = "Satisfy";break;
				case U: msg = "Unsatisfy";break;
				}
			}
		}
		System.out.println("Your Grade "+g+" = "+msg);
	}

}
