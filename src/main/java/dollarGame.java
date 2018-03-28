import java.util.Scanner;

public class dollarGame {

    public static void main (String [] args){

        final int DOLLAR = 100;
        final int PENNY = 1;
        final int NICKELS = 5;
        final int DIMES   = 10;
        final int QUARTERS = 25;
        int qtyOfPenny;
        int qtyOfNickels;
        int qtyOfDimes;
        int qtyOfQuarters;
        int total;

        Scanner input = new Scanner(System.in);

        System.out.println( "Please enter qty of penny: ");
        qtyOfPenny = input.nextInt();

        System.out.println( "Please enter qty of nickels: ");
        qtyOfNickels = input.nextInt();

        System.out.println( "Please enter qty of dimes: ");
        qtyOfDimes = input.nextInt();

        System.out.println( "Please enter qty of quarters: ");
        qtyOfQuarters = input.nextInt();

        total = (qtyOfPenny * PENNY) + (qtyOfDimes * DIMES) + (qtyOfNickels * NICKELS ) +
                (qtyOfQuarters * QUARTERS);


        if (total == DOLLAR)

            System.out.println("!!!!CONGRADULATION!!!!!");

        else
        if ( total> DOLLAR)
            System.out.println(" Amount you entered is more than 1 dollar ");

        else
            System.out.println(" Amount you entered is less than 1 dollar");






    }

}
