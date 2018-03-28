import java.util.Random;

public class Coin {
    private String sideUp = "heads";
    private String sideDown = "tails";

    public static void main(String[] args) {
        int upNumber = 0;
        int downNumber = 0;
        final int  totalTossed = 20;
        //constructor
        Coin tossedCoin = new Coin();

        Random randN = new Random();


        for (int i = 0; i < totalTossed; i++) {
            int select = randN.nextInt(2);

            if (select == 1) {

                System.out.print(" \n The coin faces up " + tossedCoin.getSideUp());
                 upNumber ++;
            } else if (select == 0)
                downNumber ++;
                System.out.print("\n The coin faces up " + tossedCoin.getSideDown());
                //downNumber ++;
        }

        System.out.println("\n Total heads are: " + upNumber + " and the total tails are: "
        + downNumber);
    }





    //getting and setting
    public void setSideUp(String up){
        sideUp = up;
    }
    public String getSideUp(){
        return sideUp;
    }
    public void setSideDown(String down){
        sideDown = down;
    }
    public String getSideDown(){
        return sideDown;
    }
        }







