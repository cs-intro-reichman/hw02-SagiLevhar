/**
 *  Gets a command-line argument (int), and chekcs if the given number is perfect.
 */
public class Perfect {
	public static void main (String[] args) {
		
		int CandidateNum = Integer.parseInt(args[0]);
		String Sum = CandidateNum + " is a perfect number since " + CandidateNum + " = 1";
		int counter = 1;
		
		for (int i = 2; i < CandidateNum; i++){
			if (CandidateNum % i == 0){
				counter += i;
				Sum += " + " + i;
			}	
		}
		
		if (counter == CandidateNum){
			System.out.println(Sum);
		} else {
			System.out.println(CandidateNum + " is not a perfect number");

		}


	}
}
