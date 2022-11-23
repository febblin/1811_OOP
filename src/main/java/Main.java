import java.util.ArrayList;
import java.util.List;

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

//        list.forEach(System.out::println); // list.forEach(n -> System.out.println(n));
//        list.forEach(n -> System.out.println(n.getInfo()));
//        System.out.println("\n----\n");
//
//        int teamCount = 10;
//        ArrayList<Base> team = Team.teamMaker(teamCount);
//        Team.consoleFilter(new Sniper(), team);

        Monk m = new Monk();
        List<String> healers = List.of("Monk", "Wizard");
        boolean t = healers.contains(m.getClass().getSimpleName());
        System.out.println(t);



    }

}