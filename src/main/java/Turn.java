import chars.BaseHero;
import chars.Team;

import java.util.*;
import java.util.function.Predicate;

public class Turn {
    //По индексам
    // 0 бойцы 1 лучники 2 маги 3 крестьяне - последовательно вызывать метод step у каждого персонажа
    private static String [] [] PHASE = new String [][] { //фазы раунда
        {"Robber", "Spearman"},
        {"Sniper", "Xbowman"},
        {"Monk", "Warlock"},
        {"Peasant"}
    };

    private static List <String> phase1 = List.of("Robber", "Spearman");
    private static List <String> phase2 = List.of("Sniper", "Xbowman");
    private static List <String> phase3 = List.of("Monk", "Warlock");
    private static List <String> phase4 = List.of("Peasant");


    public static void orderBySpeed() {

        if (Main.step == 0) {
            Team.sortBySpeed(Main.lightSide);
            Team.sortBySpeed(Main.darkSide);
            Main.lightSide.forEach(n -> n.step(Main.darkSide));
            Main.darkSide.forEach(n -> n.step(Main.lightSide));
        } else {
            Main.lightSide.forEach(n -> n.step(Main.darkSide));
            Main.darkSide.forEach(n -> n.step(Main.lightSide));
        }
        /*
        for (BaseHero h: Main.lightSide) {
            if (!(h.getStatus().equals("dead")) && phase1.contains(h.getName()))
                h.step(Main.darkSide);
        }
        for (BaseHero h: Main.darkSide) {
            if (!(h.getStatus().equals("dead")) && phase1.contains(h.getName()))
                h.step(Main.lightSide);
        }
        //Вторая фаза
        for (BaseHero h: Main.lightSide) {
            if (!(h.getStatus().equals("dead")) && phase2.contains(h.getName()))
                h.step(Main.darkSide);
        }
        for (BaseHero h: Main.darkSide) {
            if (!(h.getStatus().equals("dead")) && phase2.contains(h.getName()))
                h.step(Main.lightSide);
        }
        //Третья фаза
        for (BaseHero h: Main.lightSide) {
            if (!(h.getStatus().equals("dead")) && phase3.contains(h.getName()))
                h.step(Main.darkSide);
        }
        for (BaseHero h: Main.darkSide) {
            if (!(h.getStatus().equals("dead")) && phase3.contains(h.getName()))
                h.step(Main.lightSide);
        }
        //Четвертая фаза
        for (BaseHero h: Main.lightSide) {
            if (!(h.getStatus().equals("dead")) && phase4.contains(h.getName()))
                h.step(Main.darkSide);
        }
        for (BaseHero h: Main.darkSide) {
            if (!(h.getStatus().equals("dead")) && phase4.contains(h.getName()))
                h.step(Main.lightSide);
        }
        */

    }
}

