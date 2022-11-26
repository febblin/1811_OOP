import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) { //кнопка вкл для всей игры
//        list.forEach(System.out::println); // list.forEach(n -> System.out.println(n));

        //В кждый из списков добавить по десять экземпляров наследников BaseHero. Крестьянин, Разбойник, Снайпер и Колдун могут быть в одном и Крестьянин Разбойник, копейщик, арбалетчик и монах в другой

        String [] request = new String [] {"Peasant", "Robber", "Sniper", "Warlock"};
        String [] request1 = new String [] {"Peasant", "Spearman", "Xbowman", "Monk"};
        ArrayList<BaseHero> lightSide = Team.make(10, request);
        ArrayList<BaseHero> darkSide = Team.make(10, request1);
        lightSide.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\n----\n");
        darkSide.forEach(n -> System.out.println(n.getInfo()));

    }

}