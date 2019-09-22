package tutorial_03;

public class WarmUp {

	public static void main(String[] args) {
		// Question 1
		/*All variable names must begin with 
		 * a letter of the alphabet, 
		 * an underscore, or ( _ ), 
		 * or a dollar sign ($).
		 * */
		char firstLetter = 'p';       //add single quotation mark to p
		int way = 89;                 //remove digit 2
//		String name = "Ricky";        //add double quotation mark to Ricky
		int student_score = 89;       //remove spacing between student & score
		double $class = 4.5;          //Double to double
		double _parents = 20.5;       //int to double
		String name = "Greg";         //string to String
		
		//Question 2
		int a = 10;
		
		a = 25 / 4;
		
		a = 15 % 9 + 2 * 5 - 3;
		
		a = 17 + 25 % 3 * (34 * 4 % 3);
		
		System.out.println("a = " + a);
	}

}
