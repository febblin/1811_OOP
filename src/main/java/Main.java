import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Base> list = new ArrayList<>();
        list.add(new Monk());
        list.add(new Peasant());
        list.add(new Robber());
        list.add(new Sniper());
        list.add(new Spearman());
        list.add(new Wizard());
        list.add(new Xbowman());

        list.forEach(System.out::println); // list.forEach(n -> System.out.println(n));
        System.out.println("\n----\n");

        int teamCount = 50;
        ArrayList<Base> team = Team.teamMaker(teamCount);
        Team.consoleFilter(new Sniper(), team);

    }

}