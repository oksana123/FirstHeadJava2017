/**
 * Created by oksanakuyek on 2/4/18.
 */
import javax.swing.JOptionPane;
import java.util.Scanner;


public class chapter3 {

    public static void main(String[] args) {

        int sum;
        int difference;
        double avarage;

       //declare the scanner object so the keyboard input can be accepted
        Scanner input = new Scanner(System.in);
        //getting  the first integer
        System.out.println("Please enter the first number: ");
        int firstNumber = input.nextInt();

        //getting  the second integer
        System.out.println("Please enter the second number: ");
        int secondNumber = input.nextInt();


        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        avarage = (double) (firstNumber + secondNumber)/2;

        System.out.println(firstNumber + " + " + secondNumber +" = " + sum);
        System.out.println(firstNumber + " - " + secondNumber +" = " + difference);
        System.out.println("Avarage of " + firstNumber + " and " + secondNumber + " = " + avarage);


    }
}
