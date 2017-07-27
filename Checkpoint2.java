/*Ryan Frost
**Checkpoint 2
**1/27/17
*/

import java.util.*;

public class Checkpoint2{
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int fortune = 1;

        do {



        System.out.println("Pick a number between 1 and 6: "); //recieve user input
        fortune = in.nextInt(); //save as variable fortune


        //if statement for error
        if (fortune>6){
            System.out.println("Error, you aint gettin no fortune fool");
            break;
        }

        //create array of strings for fortune
        String[] fortuneString = new String[6];
        fortuneString[0] = "You will be very wealthy";
        fortuneString[1] = "Hard times are ahead";
        fortuneString[2] = "Do or do not, there is no try";
        fortuneString[3] = "cash me ousside how bout dat";
        fortuneString[4] = "2017 is your year";
        fortuneString[5] = "The road to success is paved with homework";

        //switch using array values above
        switch (fortune) {
            case 1: System.out.println(fortuneString[0]);
                    break;
            case 2: System.out.println(fortuneString[1]);
                    break;
            case 3: System.out.println(fortuneString[2]);
                    break;
            case 4: System.out.println(fortuneString[3]);
                    break;
            case 5: System.out.println(fortuneString[4]);
                    break;
            case 6: System.out.println(fortuneString[5]);
                    break;
            }
        } while (fortune<7 && fortune>=1);




    }

}
