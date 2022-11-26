import chars.BaseHero;
import chars.Team;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) { //кнопка вкл для всей игры
//        list.forEach(System.out::println); // list.forEach(n -> System.out.println(n));

        //В кждый из списков добавить по десять экземпляров наследников chars.BaseHero. Крестьянин, Разбойник, Снайпер и Колдун могут быть в одном и Крестьянин Разбойник, копейщик, арбалетчик и монах в другой

        String [] request = new String [] {"chars.Peasant", "chars.Robber", "chars.Sniper", "chars.Warlock"};
        String [] request1 = new String [] {"chars.Peasant", "chars.Spearman", "chars.Xbowman", "chars.Monk"};
        ArrayList<BaseHero> lightSide = Team.make(10, request);
        ArrayList<BaseHero> darkSide = Team.make(10, request1);
        lightSide.forEach(n -> System.out.println(n.getInfo()));
        System.out.println("\n----\n");
        darkSide.forEach(n -> System.out.println(n.getInfo()));

    }

}