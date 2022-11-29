import chars.BaseHero;
import chars.Team;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static final int TEAM_SIZE = 10;
    static ArrayList<BaseHero> lightSide;
    static ArrayList<BaseHero> darkSide;

    public static void main(String[] args) throws IOException { //кнопка вкл для всей игры

        String [] request = new String [] {"Peasant", "Robber", "Sniper", "Warlock"};
        String [] request1 = new String [] {"Peasant", "Spearman", "Xbowman", "Monk"};
        Main.lightSide = Team.make(Main.TEAM_SIZE, request, 0, 0);
        Main.darkSide = Team.make(Main.TEAM_SIZE, request1, 0, 9);

//       do {
//           ConsoleView.field(Main.TEAM_SIZE);
//           System.out.println("Press ENTER to continue. Press Q to exit");
//       } while ((char) System.in.read() != 'Q');


    }

}