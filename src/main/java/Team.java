import java.util.ArrayList;
import java.util.Random;

public class Team {
    public static ArrayList<Base> teamMaker(int teamCount) {
        Random rand = new Random();
        ArrayList<Base> team = new ArrayList<>();
        for (int i = 0; i < teamCount; i++) {
            switch (rand.nextInt(7)) {
                case 0:
                    team.add(new Monk());
                    break;
                case 1:
                    team.add(new Peasant());
                    break;
                case 2:
                    team.add(new Robber());
                    break;
                case 3:
                    team.add(new Sniper());
                    break;
                case 4:
                    team.add(new Spearman());
                    break;
                case 5:
                    team.add(new Wizard());
                    break;
                case 6:
                    team.add(new Xbowman());
                    break;
            }
        }
        return team;
    }

    public static void consoleFilter(Base hero, ArrayList<Base> team) {
        for (Base n : team) {
            if (n.equalsClass(hero)) {
                System.out.println(n);
            }
        }
    }

}
