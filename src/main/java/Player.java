/**
 * Created by oksanakuyek on 3/16/18.
 */
public class Player {
    private int id;
    private String name;

    public Player(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Player (int id){
        this(id, "NO NAME");
    }
}
