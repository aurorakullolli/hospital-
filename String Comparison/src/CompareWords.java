import java.util.Scanner;

public class CompareWords {

	public static void main(String[] args) {
		
		//Read first word input
        Scanner stringScan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String input1 = stringScan.next();
        //Read second word input
        System.out.println("Enter second word: ");
        String input2 = stringScan.next();
        //Read the starting index number
        System.out.println("Enter the starting index from where to compare: ");
        int index = stringScan.nextInt();
        
        //Conditional for checking the characters
        if (input1.regionMatches(true, index, input2, index, input1.length()-index))
            System.out.println("Text entered is the same.");
        else
            System.out.println("Text entered is different.");
        
        stringScan.close();			//Close resource
	}

}
