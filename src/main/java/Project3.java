//import java.awt.Menu;
import javax.swing.JOptionPane;
import java.util.Scanner;


public class Project3 {
    boolean exit;

    public static void main(String[] args) {

        //Create  menu object
        Project3 menu = new Project3();

        menu.executeMenu();
    }

    public void executeMenu() {
        printMenuForm();
        if (!exit) {
            printMenu();
            int selectChoiceFromMenu = getUserSelection();
            performAction(selectChoiceFromMenu);
        }
    }

    private void printMenuForm() {
        System.out.println("          MENU           ");
        System.out.println("PLEASE SELECT FROM 1 TO 5");

    }

    private void printMenu() {
        //create menu of 5 categories
        System.out.println("0 - Triangle");
        System.out.println("1 - Square  ");
        System.out.println("2 - Diamond ");
        System.out.println("3 - Bow     ");
        System.out.println("4 - Exit    ");
    }

    private int getUserSelection() {
        Scanner a = new Scanner(System.in);
        int selectChoiseFromMenu = -1;
        while (selectChoiseFromMenu < 0 || selectChoiseFromMenu > 4) {
            try {
                System.out.println(" Enter your optioin ");
                selectChoiseFromMenu = Integer.parseInt(a.nextLine());
            }catch (NumberFormatException e) {
                System.out.println
                        ("Something is wrong. Please enter  a number from 0 to 4");
            }

        }
        return selectChoiseFromMenu;
    }


    private void performAction(int selectChoiseFromMenu) {
        switch (selectChoiseFromMenu) {
            case 0:
                drawTriangle();
                break;
            case 1:
                drawSquare();
                break;
            case 2:
                drawRectangle();
                break;
            case 3:
                drawBowl();
                break;
            case 4:
                exit = true;
                break;
        }
    }

    private void drawTriangle() {
        System.out.println("Please enter  number from 0 to 50");
        int usersNumber;
        int minMumber = 3;
        Scanner b = new Scanner(System.in);
        usersNumber = b.nextInt();
        if (usersNumber < minMumber) {
            System.out.println("Sorry, but minimum number for triangle is 4.");
        } else {
            for (int i = 1; i < usersNumber; i += 2) {
                for (int k = 0; k < ((usersNumber / 2) - i / 2); k++) {
                    System.out.print(" ");
                }
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }

    }

    private void drawSquare() {
        System.out.println("Please enter  number from 0 to 50");
        int usersNumber;
        int minMumber = 2;
        Scanner b = new Scanner(System.in);
        usersNumber = b.nextInt();
        if (usersNumber < minMumber) {
            System.out.println("Sorry, but minimum number for triangle is 2.");
        } else {
            for (int i = 0; i < usersNumber; i++) {
                for (int j = 0; j < usersNumber; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }

    private void drawRectangle() {
        System.out.println("Please enter  number from 0 to 50");
        int usersNumber;
        int minMumber = 2;
        Scanner b = new Scanner(System.in);
        usersNumber = b.nextInt();
        if (usersNumber < minMumber) {
            System.out.println("Sorry, but minimum number for triangle is 2.");
        } else {
            for (int i = 0; i < usersNumber; i++) {
                for (int j = 0; j < usersNumber / 2; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }

        }
    }

    private void drawBowl() {
        int minimumNumber = 3;
        int userNumber;
        System.out.println("Please enter a number from 0 to 50: ");
        Scanner input = new Scanner(System.in);
        userNumber = input.nextInt();
        if (userNumber < minimumNumber) {
            System.out.println("Sorry, but minimum number for triangle is 3.");
        }
        for (int a = 0; a < userNumber; a++) {
            //second for is for increasing +
            for (int v = 0; v <= a; v++) {
                System.out.print("*");
            }
            //third for is for decreasing empty space
            for (int y = 0; y < (userNumber - a); y++) {
                System.out.print(" ");
            }
            for (int b = 0; b < (userNumber - a - 1); b++) {
                System.out.print(" ");
            }
            //fourth for is for decreasing +
            for (int d = 0; d <= a; d++) {
                System.out.print("*");
            }

            //this method is using for ending line and starting the new one from the new line
            System.out.println();
        }


    }
}









