import chars.BaseHero;
import chars.Team;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static final int TEAM_SIZE = 10;
    static ArrayList<BaseHero> lightSide;
    static ArrayList<BaseHero> darkSide;

    public static void main(String[] args) throws IOException { //кнопка вкл для всей игры
//        list.forEach(System.out::println); // list.forEach(n -> System.out.println(n));
        String [] request = new String [] {"Peasant", "Robber", "Sniper", "Warlock"};
        String [] request1 = new String [] {"Peasant", "Spearman", "Xbowman", "Monk"};
        Main.lightSide = Team.make(Main.TEAM_SIZE, request, 0, 0);
        Main.darkSide = Team.make(Main.TEAM_SIZE, request1, 0, 9);

//        Scanner scanner = new Scanner(System.in);
       do {
           ConsoleView.field(Main.TEAM_SIZE);
           System.out.println("Press ENTER to continue. Press Q to exit");
       } while ((char) System.in.read() != 'Q');
//        (!scanner.nextLine().equals("Q"));


//        lightSide.forEach(n -> System.out.println(n.getInfo()));
//        System.out.println("\n----\n");
//        darkSide.forEach(n -> System.out.println(n.getInfo()));


    }

}

//Альтернатива System.in.read()
// Scanner scanner = new Scanner(System.in);
//
//        while (true){
//            ConsoleView.view();
//            System.out.println("Press ENTER");
//            scanner.nextLine();
//        }