import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Gradebook{
	private Map<String, String> grades = new HashMap<>(); //Intializes the map
	
	public Gradebook(){
		grades = grades;
		
	}
	
	public void menu(){
		Scanner in = new Scanner(System.in);

		System.out.println("A)dd R)emove M)odify P)rint Q)uit");

		String a = "a";
		String r = "r";
		String m = "m";
		String p = "p";
		String q = "q";


		String response = in.next().toLowerCase(); //Makes the input to lowercase

		do{
			if (response.equals("a")){ //Method for adding students (Option a)
				System.out.println("Enter the student's name: ");
				String name = in.next();
				System.out.println("Enter the student's grade: ");
				String letter = in.next();

				grades.put(name, letter);

				System.out.println("A)dd R)emove M)odify P)rint Q)uit");
				response = in.next().toLowerCase();
				
			}

			else if (response.equals("r")){
				System.out.println("Which student?: ");
				String name = in.next();

				grades.remove(name);
				System.out.println(grades);
				
				System.out.println("A)dd R)emove M)odify P)rint Q)uit");
				response = in.next().toLowerCase();
			}

			else if (response.equals("m")){
				System.out.println("Enter the student's name: ");
				String name = in.next();
				System.out.println("Enter the student's grade: ");
				String letter = in.next();

				grades.put(name, letter);

				System.out.println("A)dd R)emove M)odify P)rint Q)uit");
				response = in.next().toLowerCase();
			}

			else if (response.equals("p")){
				System.out.println(grades);

				System.out.println("A)dd R)emove M)odify P)rint Q)uit");
				response = in.next().toLowerCase();
			}

			else if (response.equals("q")){
				break;
			}

			else {
				System.out.println("Invalid Response");
				System.out.println("A)dd R)emove M)odify P)rint Q)uit");
				response = in.next().toLowerCase();
			}
		}

		while (!response.equals(a) || !response.equals(r) || !response.equals(m) || !response.equals(p) || !response.equals(q) );{
			System.out.println("Invalid Response");
			System.out.println("A)dd R)emove M)odify P)rint Q)uit");
			response = in.next().toLowerCase();
		}
	}
}