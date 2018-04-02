import java.util.Scanner;
public class BowlingTeamDemo2 {
    public static void main (String[] args){
        String name;
       // BowlingTeam bowlteam = new BowlingTeam();
        int x;
        int y;
        final int NUM_TEAM_MEMBERS =4;
        final int NUM_TEAM = 4;
        BowlingTeam[] teams = new BowlingTeam[NUM_TEAM];
        Scanner input = new Scanner(System.in);
        for (y = 0; y < NUM_TEAM; y++){
            teams[y] = new BowlingTeam();
            System.out.println("Enter team name >> ");
            name = input.nextLine();
            teams[y].setTeamName(name);
            for (x = 0; x< NUM_TEAM_MEMBERS; x++){
                System.out.println("Enter players name >>");
                name = input.nextLine();
                teams[y].setMember(x,name);
            }
        }
        for(y = 0; y < NUM_TEAM; y++){
            System.out.println("\nPlayers of team " + teams[y].getTeamName());
            for (x = 0; x< NUM_TEAM_MEMBERS; x++){
                System.out.print(" " + teams[y].getMember(x));
                System.out.println();
            }
        }

        }
    }

