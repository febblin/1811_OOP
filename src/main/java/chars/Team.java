package chars;

import java.util.ArrayList;
import java.util.Random;

public class Team {
    public static ArrayList<BaseHero> make(int teamCount, String [] request, int x, int y) { //x и y (это по-хорошему должно быть в документации) - это начальные значения, от которых начинается отсчет
        ArrayList<BaseHero> team = new ArrayList<>();
        Random r = new Random();
        for (int i = 0; i < teamCount; i++) {
            switch (request[r.nextInt(request.length)]) {
                case "Monk" -> team.add(new Monk(team, x++, y));
                case "Peasant" -> team.add(new Peasant(team, x++, y));
                case "Robber" -> team.add(new Robber(team, x++, y));
                case "Sniper" -> team.add(new Sniper(team, x++, y));
                case "Spearman" -> team.add(new Spearman(team, x++, y));
                case "Warlock" -> team.add(new Warlock(team, x++, y));
                case "Xbowman" -> team.add(new Xbowman(team, x++, y));
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
