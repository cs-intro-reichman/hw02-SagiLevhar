
/**
 * Prints a given string, backward. Then prints the middle character in the string.
 * The program expects to get one command-line argument: A string.
 */
public class Reverse {
	public static void main (String[] args){
		String Word = args[0];
		String ReverseWord = "";
		char MiddleChar = Word.charAt((Word.length() - 1) / 2);
		
		for (int i = Word.length() - 1; i >= 0; i--){
			ReverseWord += Word.charAt(i);
		}
		System.out.println(ReverseWord);
		System.out.println("The middle character is " + MiddleChar);

	}
}
