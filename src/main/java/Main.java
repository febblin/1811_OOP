import chars.BaseHero;
import chars.Team;

import java.util.ArrayList;

public class Main {
    public static final int GANG_SIZE = 10;
    static ArrayList<BaseHero> lightSide;
    static ArrayList<BaseHero> darkSide;

    public static void main(String[] args) { //кнопка вкл для всей игры
//        list.forEach(System.out::println); // list.forEach(n -> System.out.println(n));

        String [] request = new String [] {"Peasant", "Robber", "Sniper", "Warlock"};
        String [] request1 = new String [] {"Peasant", "Spearman", "Xbowman", "Monk"};
        Main.lightSide = Team.make(10, request);
        Main.darkSide = Team.make(10, request1);
        lightSide.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\n----\n");
        darkSide.forEach(n -> System.out.println(n.getInfo()));

        System.out.println("\u250c");
    }

}