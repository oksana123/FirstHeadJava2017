/**
 * Created by oksanakuyek on 3/29/18.
 */
public class BowlingTeam {
    private String teamName;
    private String [] member = new String[4];



    public void setTeamName(String name) {
        teamName = name;
    }

    public String getTeamName(){
        return teamName;
    }
    //adding get and set method for memebers numbers and name
    public void setMember(int number, String name){
        member[number] = name;
    }
    public String getMember(int number){
        return member[number];
    }
}
