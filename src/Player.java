import java.util.Scanner; 

public class Player {
	
	public static void main(String[] args) {
		//Input Line 
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		//Set Daniel inside Person Class
		Person  Daniel = new Person("Daniel");
		
		
		//WEIGHTS 
		System.out.println("Before: "+ Daniel.getWeight());
		
		System.out.println("Type: ");
		Float n = input.nextFloat();
		//Store input inside n
		Daniel.setWeight(n);
		//Execute Method
		Daniel.walks();
		///
		System.out.println();
		//
		
		//GRADES
		System.out.println(Daniel.getGrades());
		System.out.println("Type your mark to generate Grade:");
		Float g = input.nextFloat();
		//Store input inside n
		Daniel.setGrades(g);
		//pass percentage through n 
		Daniel.Grades(g);

	}
	
}