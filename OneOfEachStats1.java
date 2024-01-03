/**
 *  Computes some statistics about families in which the parents decide 
 *  to have children until they have at least one child of each gender.
 *  The program expects to get one command-line argument: an int value
 * 	that determines how many families to simulate.
 */
public class OneOfEachStats1 {
	public static void main (String[] args) {
		
		int T = Integer.parseInt(args[0]);
		int counter = 0, TwoChil = 0, ThreeChil = 0, FourMoreChil = 0, CommoNum = 0;
		double RandomNum = 0,  Avg = 0;
		char FirstGender = ' ', NextGender = ' ';
		
		for (int i = 1; i <= T; i++){	
			
			RandomNum = Math.random();
			if (RandomNum > 0.5){
				FirstGender = 'b';
			} else {
				FirstGender = 'g';
			}
			NextGender = FirstGender;
			counter = 1;
			Avg ++;
		
			while (NextGender == FirstGender){
				RandomNum = Math.random();
				if (RandomNum > 0.5){
					NextGender = 'b';
				} 	else {
					NextGender = 'g';
				}
				counter ++;
				Avg ++;
			}

			if (counter == 2){
				TwoChil++;
			} else if (counter == 3){
				ThreeChil++;
			} else {
				FourMoreChil++;
			}
		}
		
		Avg = Avg/T;
		CommoNum = Math.max(TwoChil, ThreeChil);
		CommoNum = Math.max(CommoNum, FourMoreChil);
		
		System.out.println("Average: " + Avg + " children to get at least one of each gender.");
		System.out.println("Number of families with 2 children: " + TwoChil);
		System.out.println("Number of families with 3 children: " + ThreeChil);
		System.out.println("Number of families with 4 or more children: " + FourMoreChil);
		
		if (CommoNum == FourMoreChil){
			System.out.println("The most common number of children is 4 or more.");
		} else if (CommoNum == ThreeChil){
			System.out.println("The most common number of children is 3.");
		} else {
			System.out.println("The most common number of children is 2.");
		}
		


		
		
	}
}
