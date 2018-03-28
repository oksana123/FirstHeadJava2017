import java.util.Scanner;
import javax.swing.JOptionPane;



public class Project1 {

    public static void main (String [] args){
        //variables
        final double hourRate = 30.00;
        String firstName;
        String lastName;
        long  socialSecurity;
        int  hoursInWeek;
        double weekly;
        double biweekly;
        double monthly;
        double yearly;


        ////declare the scanner object so the keyboard input can be accepted
        Scanner input = new Scanner(System.in);
        //getting  the first integer
        System.out.println("Please enter the first name: ");
        firstName = input.next();
        //getting  the last name
        System.out.println("Please enter the last name: ");
        lastName = input.next();
        //getting the SS from user
        System.out.println("Please enter you Social Security Number: ");
        //getting SS #
        socialSecurity =input.nextLong();
        //getting hours per week
        System.out.println("Please enter how many hours you work per week: ");
        hoursInWeek = input.nextInt();


   weekly = displayWeeklyWage(hourRate, hoursInWeek);
   biweekly = displayBiWeeklyWage(hourRate, hoursInWeek);
   monthly = displayMonthlyWage(hourRate,  hoursInWeek);
   yearly = displayYearlyWage(hourRate, hoursInWeek);

    //dialog windows with outputs
   JOptionPane.showMessageDialog(null, firstName + " " +lastName +
           '\n' +" your weekly wage is " + weekly +
           '\n' + "your biweekly wage is "+ biweekly +
           '\n' + "your monthly wage is " + monthly +
           '\n' + "your yearly wage is " + yearly);

    }


    // method
    public static double displayWeeklyWage(double hourRate,  int hoursInWeek)
    {
        double weeklyWage;
        weeklyWage = (double) hoursInWeek * hourRate;

        return  weeklyWage;

    }
        //method
    public static double  displayBiWeeklyWage(double hourRate, int hoursInWeek)
    {
        double biWeeklyWage;
        biWeeklyWage = (double) hoursInWeek * hourRate * 2;

        return biWeeklyWage;

    }

    //method

    public static double  displayMonthlyWage(double hourRate,  int hoursInWeek)
    {
        double monthlyWage;
        monthlyWage = (double) hoursInWeek * hourRate * 4 + 10 * hourRate;

        return monthlyWage;

    }
        //method

    public static double  displayYearlyWage(double hourRate,  int hoursInWeek)
    {
        double yearlyWage;
        yearlyWage = (double) hoursInWeek * hourRate * 52;

        return yearlyWage;
    }



}
