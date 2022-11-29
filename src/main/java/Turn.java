import chars.BaseHero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

public class Turn {
    //По индексам
    // 0 бойцы 1 лучники 2 маги 3 крестьяне - последовательно вызывать метод step у каждого персонажа
    private static String [] [] PHASE = new String [][] { //фазы раунда
        {"Robber", "Spearman"},
        {"Sniper", "Xbowman"},
        {"Monk", "Warlock"},
        {"Peasant"}
    };

    private ArrayList<BaseHero> light = Main.lightSide;
    private ArrayList<BaseHero> dark = Main.darkSide;

    public static void order() {
        Main.lightSide.forEach(n -> n.step(Main.darkSide));
        Main.darkSide.forEach(n -> n.step(Main.lightSide));
        }
}

