
enum Levels {
	LOW, MEDIUM, HIGH;
}

public class LetLearnAboutEnums {
	//AN enum is basically if an Array and a Class had a baby. 
	//It's a list of values that havent changed but its set up like a class and u access it like a class 
	
	public static void main(String[] args) {
		Levels l  = Levels.LOW;
		System.out.println(l);
		
		System.out.println(Levels.HIGH);
		
		switch(l) {
		case LOW:
			System.out.println("Low Level");
			break;
		case MEDIUM:
			System.out.println("Medium Level");
			break;
		case HIGH:
			System.out.println("High Level");
			break;	
		}
	}

}
