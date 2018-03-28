/**
 * Created by oksanakuyek on 2/6/18.
 */
import java.util.Scanner;



public class chapter4 {



    public static void main (String [] args){

        int     itemBought;
        int     itemValue;
        int      discountRate;

        final int MIN_ITEM = 1;
        final int MIN_VALUE = 1;
        final int DISCOUNT = 10;




        /// getting data from user


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter  the Qty of items:");
        itemBought = input.nextInt ();

        System.out.println("Please enter  value of items:");
        itemValue = input.nextInt ();

        if (itemBought >= MIN_ITEM)
            discountRate = DISCOUNT;
        else
            if(itemValue >= MIN_VALUE)
                discountRate = DISCOUNT;

        if (itemBought >= MIN_ITEM || itemValue >= MIN_VALUE)
            discountRate = DISCOUNT;


        System.out.println("You bought " + itemBought + " item(s) for " + itemValue + " and get  amazing " +
                + DISCOUNT +" % OFF ");






    }
}
