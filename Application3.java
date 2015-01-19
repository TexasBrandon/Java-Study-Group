import java.util.Scanner;
 
 
public class Application3 {
     
    public static void main(String[] args){
         
        Scanner input = new Scanner(System.in);
         
        //String Array called words with 4 values
        String[] words = new String[4];
         
        //Now we have defined each element at each index 0-3 (4 indexes total)
        words[0] = "Apple";
        words[1] = "Ball";
        words[2] = "Tree";
        words[3] = "Car";
         
        //This is easy enough to tell what it does, it prints stuff out
        System.out.println("Pick a word:");
        System.out.println("1. Apple ");
        System.out.println("2. Ball ");
        System.out.println("3. Tree ");
        System.out.println("4. Car ");
        System.out.println("5. Computer " );
        System.out.println("6. Bricks");
         
        /*Here we are going to create a loop that will enable us to pick the right word.
         * This is achieved by looping until we get the desired word.
         */
        int i;
        
        for(i = 0; i<words.length; i++){ 
            String word = input.nextLine();
            //Correct Answer Coding which checks word against the array
            if(word.equalsIgnoreCase(words[i])){
                System.out.println("You picked the right word!");
                break;   
                
            } else {
            //Incorrect answer prompting them to try again until it is right
            	System.out.println("Please try again!");
            }
             
        }
         
    }
     
}
