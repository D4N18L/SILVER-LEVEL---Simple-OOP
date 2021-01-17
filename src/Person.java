public class Person {
	//Create private variables to prevent outside changes 
	private String name;
	private float height;
	private float weight;
	private float Grades;
	
	//// Use Getter and Setter to retrieve and modify variables without accessing them directly
	
	// Getter Setter for Height 
	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	// Getter Setter for Height 
	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getGrades() {
		return Grades;
	}

	public void setGrades(float grades) {
		Grades = grades;
	}

	public Person(String name) {
		this.name = name;
	}
	
	
	public void walks() {
		//Before Calculation
		System.out.println("You use to weigh: " + this.getWeight()+"lbs");
		
		//Uses the getter inside the setter to perform the calculation of a 10% reduction
		this.setWeight((float) (this.getWeight() * 0.9));
		//After Calculation
		System.out.println(this.name + "! You lost weight !!!!");
		System.out.println("You now weigh: " + this.getWeight()+"lbs");
	}
	
	public void eats() {
		//Before Calculation
		System.out.println("You use to weigh: " + this.getWeight());
		
		//Uses the getter inside the setter to perform the calculation of a 20% increase
		this.setWeight((float) (this.getWeight() * 1.2));
		//After Calculation 
		System.out.println("You now weigh: " + this.getWeight());
	}
	
	public void Grades(float percentage) {
		//Implementation a standard conditional statement that computes grade boundaries
		if (percentage >= 80) {
			System.out.println("Congrats!, "  + this.name +  " you got an A*");	
		}
		else if (percentage >=70 && percentage <80) {
			System.out.println("Congrats, you got an A");		
		}
		else if (percentage >=60 && percentage <69) {
			System.out.println("Congrats, you got an B");
		}
		else if (percentage >=50 && percentage <59) {
			System.out.println("Congrats, you got an C");
		}
		else if (percentage >=40 && percentage <49) {
			System.out.println("Congrats, you got an D");
		}
		else{
			System.out.println("Congrats, you got an F");
		}
	}
	
	
}
