import java.util.Scanner;
import java.util.Random;


public class LotteryApplication {
    public static void main(String[] args) {
        int[] lottery = new int[5];
        int[] usersNumbers = new int[5];
        int index = 0;
        int totalNumbers = 5;
        int guessedNumber = 0;
        for (int a = 0; a < totalNumbers; a++) {
            //Populating lottery array
            Random randN = new Random();
            lottery[a] = randN.nextInt(9);
            System.out.print(lottery[a]);
        }
            //Populating usersNumber array
        for (int b = 0; b < totalNumbers; b++) {
                Scanner input = new Scanner(System.in);
                System.out.println("\nPlease Enter Five Numbers from 0 to 9 >>");
                while (input.hasNextInt()) {
                    usersNumbers[b] = input.nextInt();
                    b++;
                    if (b == 5) {
                        break;}
                }
            }
            //Printing out  Lottery Numbers
        System.out.print(" Lottery Numbers are ");
        for(int v = 0; v < lottery.length; v++) {
            System.out.print(lottery[v]);
        }
        //Printing out  Player's Numbers
        System.out.print("\n Player's Numbers are ");
        for (int q = 0; q< usersNumbers.length; q++){
            System.out.print(usersNumbers[q]);
        }
            //comparing two arrays
            for (int j = 0; j < totalNumbers;j++) {
                    if (usersNumbers[j] == lottery[j]) {
                        guessedNumber++;
                        System.out.println("\n For index " + index + " You enter " + usersNumbers[j] +
                                " and it matches lottery number " + lottery[j]);
                    }
                    //checking next index
                    index++;
                }
                if (guessedNumber==0)
                    System.out.println("\n Oops,  looks like you lost");
                if (guessedNumber==totalNumbers)
                    System.out.println("You Win!!!!");
                else
                System.out.println(" You guessed " + guessedNumber + " number(s) from " +totalNumbers);
            }
        }








