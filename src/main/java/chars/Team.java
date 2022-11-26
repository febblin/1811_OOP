package chars;

import java.util.ArrayList;
import java.util.Random;

public class Team {
    public static ArrayList<BaseHero> make(int teamCount, String [] request) {
        ArrayList<BaseHero> team = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i <= teamCount; i++) {
            switch (request[r.nextInt(request.length)]) {
                case "chars.Monk" -> team.add(new Monk(team));
                case "chars.Peasant" -> team.add(new Peasant(team));
                case "chars.Robber" -> team.add(new Robber(team));
                case "chars.Sniper" -> team.add(new Sniper(team));
                case "chars.Spearman" -> team.add(new Spearman(team));
                case "chars.Warlock" -> team.add(new Warlock(team));
                case "chars.Xbowman" -> team.add(new Xbowman(team));
            }
        }
        return team;
    }

    public static void consoleFilter(BaseHero hero, ArrayList<BaseHero> team) {
        for (BaseHero n : team) {
            if (n.equalsClass(hero)) {
                System.out.println(n.getInfo());
            }
        }
    }

}
