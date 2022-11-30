import chars.BaseHero;
import chars.Team;

import java.io.IOException;
import java.util.ArrayList;
import java.util.function.Predicate;

public class Main {
    public static final int TEAM_SIZE = 10;

    public static int step = 0;
    static ArrayList<BaseHero> lightSide;
    static ArrayList<BaseHero> darkSide;

    public static void main(String[] args) throws IOException { //кнопка вкл для всей игры
//          Для финальной программы
        String [] request = new String [] {"Peasant", "Robber", "Sniper", "Warlock"};
        String [] request1 = new String [] {"Peasant", "Spearman", "Xbowman", "Monk"};
//        String [] request = new String [] {"Peasant", "Sniper", "Warlock"};
//        String [] request1 = new String [] {"Peasant", "Xbowman", "Monk"};
        Main.lightSide = Team.make(Main.TEAM_SIZE, request, 0, 0);
        Main.darkSide = Team.make(Main.TEAM_SIZE, request1, 0, Main.TEAM_SIZE-1);

        Predicate<BaseHero> isDead = x -> !x.getStatus().equals("dead");

        lightSide.forEach(n -> System.out.println(n.toString()));
        lightSide.addAll(darkSide);

        System.out.println("+ темная сторона");
        lightSide.forEach(n -> System.out.println(n.toString()));
//       do {
//               ConsoleView.field(Main.TEAM_SIZE);
//               Turn.order();
//       } while ((char) System.in.read() != 'Q');


//        Main.darkSide.forEach(n -> System.out.println(
//                n.getName() + " HP: " + n.getHealth() + ", Status: " + n.getStatus()));
//        BaseHero damager = new Sniper(Main.lightSide, 0, 5);
//        BaseHero healer = new Warlock(Main.darkSide, 4, 0);
//
//        for (int i = 0; i < 3; i++) {
//            damager.step(Main.darkSide);
//            System.out.println("\nВыстрел сделан");
//            Main.darkSide.forEach(n -> System.out.println(
//                    n.getName() + " HP: " + n.getHealth() + ", Status: " + n.getStatus()));
//
//            healer.step(Main.darkSide);
//            System.out.println("\nСкастовали лечилку");
//            Main.darkSide.forEach(n -> System.out.println(
//                    n.getName() + " HP: " + n.getHealth() + ", Status: " + n.getStatus()));
//        }



    }

}