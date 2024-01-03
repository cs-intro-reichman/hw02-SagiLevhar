
/**
 *  Simulates the formation of a family in which the parents decide 
 *  to have children until they have at least one child of each gender.
 */
public class OneOfEach {
	public static void main (String[] args) {
		
		double RandomNum = Math.random();
		char FirstGender = ' ', NextGender = ' ';
		int counter = 1;
		if (RandomNum > 0.5){
			FirstGender = 'b';
		} else {
			FirstGender = 'g';
		}
		System.out.print(FirstGender + " ");
		NextGender = FirstGender;
		
		while (NextGender == FirstGender){
			RandomNum = Math.random();
			if (RandomNum > 0.5){
				NextGender = 'b';
			} 	else {
				NextGender = 'g';
			}
			System.out.print(NextGender + " ");
			counter ++;
		}
		System.out.println();
		System.out.println("you made it... and you have " + counter + " childrens." );

	}
}
