/**
 * Created by oksanakuyek on 2/13/18.
 */
public class patternDisplays {
    public static void main(String[] args) {
//first for is for vertical loop
        for (int a = 1; a < 10; a++) {
            //second for is for increasing +
            for (int v = 1; v <= a; v++) {
                System.out.print("+");}
             //third for is for decreasing empty space
            for (int y = 1; y <= (-1 * a + 20); y++) {
                System.out.print(" ");}
             //fourth for is for decreasing +
            for (int d = 1; d <= (-1 * a + 10); d++) {
                System.out.print("+");

            }
            //this method is using for ending line and starting the new one from the new line
                System.out.println();}
        }
    }


