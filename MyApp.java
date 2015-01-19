
public class MyApp {

	public static void main(String[] args) {
		
		int[][] numbers ={
			{1, 2, 3, 4},
			{5, 6, 7, 8},
			{9, 10, 11, 12}
		};
		
		/*Here we have a outer and inner loop.  The outer loop increases integer variable row while less than its
		 * length.
		 */
		
		//Basically, the outer loop runs once as row 0 and then runs the inner for loop which cycles through all
		//index elements.  So think of it this way: Row 0 then cycle column 0,1,2,3 print
		// Row 1 then cycle column 0,1,2,3 print
		// Row 2 then cycle column 0,1,2,3 print
		//This keeps happening until the end of the array so we print 1-12.
		for(int row = 0; row<numbers.length; row++){
			for(int col = 0; col<numbers[row].length; col++){
				System.out.println(numbers[row][col]);
			}
			
		}
		
	}

}
