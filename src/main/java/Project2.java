import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.Random;

public class Project2 {

    public static void main(String[] args) {

        Random randN = new Random();
        int randomNumber = randN.nextInt(20);

        //creating loop for 10 attempts
        for (int a = 1; a < 10; a++){
            //generating random number
            Scanner input = new Scanner(System.in);

        //getting  user's numbers
        System.out.println("Please Enter a Number from 1 to 20: ");
            //waiting for 2 seconds.
            try {
                Thread.sleep(2000);
            } catch(InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            //assign user's data to int userNumber
        int userNumber = input.nextInt();
           //condition when user's number does not match to random  number
            if ( userNumber!=randomNumber){
            System.out.println("Keep Trying!! You have few more chances.");
        }
            //condition when user's number equals random  number
        else if (userNumber==randomNumber){
            System.out.println(" YOU ARE WINNER!!!! RANDOM NUMBER WAS " + randomNumber);
            break;}
        }
    }
}
