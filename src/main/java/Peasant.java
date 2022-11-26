import java.util.ArrayList;

public class Peasant extends BaseHero {

    public Peasant(ArrayList<BaseHero> myParty) {
       super(1, 1, new int[]{1, 1}, 1, 3, "Peasant", myParty);
    }

    @Override
    public void step() {

    }
}
