import java.awt.*;
import java.util.Scanner;
public class Employee {
    private  int empNum;
    private String empFirstName;
    private String empLastName;
    private String empAddress;
    private double empSalary;
    private int empSNN;


    public int getEmpNum() {
        return empNum;
    }

    public void setEmpNum(int emp) {
        empNum = emp;
    }
    public String getEmpLastName() {
        return empLastName;
    }
    public  void  setEmpLastName(String name){
        empLastName = name;
    }
    public String getEmpFirstName() {
        return empFirstName;
    }
    public  void  setEmpFirstName(String name){
        empFirstName = name;
    }
    public double getEmpSalary(){
        return  empSalary;
    }

    public void setEmpSalary(double sal) {
        empSalary = sal;
    }
    public int getEmpSNN() {
        return empSNN;
    }

    public void setEmpSNN(int empSNNNumber) {
        empSNN = empSNNNumber;
    }
    public String getEmpAddress() {
        return empAddress;
    }
    public  void  setEmpAddress(String address){
        empAddress = address;
    }

    public static void main (String[] args){
        Employee clerk = new Employee();
        Employee driver = new Employee();

        // Sett the data from  clerk ;

        Scanner inputSal = new Scanner(System.in);
        System.out.println(" Please enter your Salary ");
        double s = inputSal.nextDouble();
        clerk.setEmpSalary(s);

        Scanner inputEmpNum = new Scanner(System.in);
        System.out.println(" Please enter your  Employee Number: ");
        int n = inputEmpNum.nextInt();
        clerk.setEmpNum(n);

        Scanner inputEmpSNN = new Scanner(System.in);
        System.out.println(" Please enter your last four of your SSN: ");
        int snn = inputEmpSNN.nextInt();
        clerk.setEmpSNN(snn);

        Scanner inputFirstName = new Scanner(System.in);
        System.out.println(" Please enter your First Name ");
        String fn= inputFirstName.next();
        clerk.setEmpFirstName(fn);

        Scanner inputLastName = new Scanner(System.in);
        System.out.println(" Please enter your  Last Name ");
        String ln = inputLastName.next();
        clerk.setEmpLastName(ln);

        Scanner inputAddress = new Scanner(System.in);
        System.out.println(" Please enter your  address ");
        String ad = inputAddress.next();
        clerk.setEmpAddress(ad);

        // Sett the data from  driver ;
        Scanner inputSalDr = new Scanner(System.in);
        System.out.println(" Please enter your Salary ");
        double sDr = inputSalDr.nextDouble();
        driver.setEmpSalary(sDr);

        Scanner inputEmpNumDr = new Scanner(System.in);
        System.out.println(" Please enter your  Employee Number: ");
        int nDr = inputEmpNumDr.nextInt();
        driver.setEmpNum(nDr);

        Scanner inputEmpSNNDr = new Scanner(System.in);
        System.out.println(" Please enter your last four of your SSN: ");
        int snnDr = inputEmpSNNDr.nextInt();
        driver.setEmpSNN(snnDr);

        Scanner inputFirstNameDr = new Scanner(System.in);
        System.out.println(" Please enter your First Name ");
        String fnDr= inputFirstNameDr.next();
        driver.setEmpFirstName(fnDr);

        Scanner inputLastNameDr = new Scanner(System.in);
        System.out.println(" Please enter your  Last Name ");
        String lnDr = inputLastNameDr.next();
        driver.setEmpLastName(lnDr);

        Scanner inputAddressDr = new Scanner(System.in);
        System.out.println(" Please enter your  address ");
        String adDr = inputAddressDr.next();
        driver.setEmpAddress(adDr);


        System.out.print("Thank you " + clerk.getEmpFirstName() + " " +clerk.getEmpLastName() +
                ", your Employee ID is " + '\n'+clerk.getEmpNum() + ". Our Data Base displays that your salary is " + '\n'+
                clerk.getEmpSalary() + "  For " + "security reasons we display only 4 numbers of your SSN " + '\n'+
                clerk.getEmpSNN() + ". All additional info will be sent to your address " + '\n'+
                clerk.getEmpAddress() + " by mail.");

        System.out.println("Thank you " + clerk.getEmpFirstName() + " " +clerk.getEmpLastName() + '\n'+
                ", your Employee ID is " + clerk.getEmpNum() + ". Our Data Base displays that your salary is " + '\n'+
                clerk.getEmpSalary() + "  For " + "security reasons we display only 4 numbers of your SSN " + '\n'+
                clerk.getEmpSNN() + ". All additional info will be sent to your address " + '\n'+
                clerk.getEmpAddress() + " by mail.");

    }
}
