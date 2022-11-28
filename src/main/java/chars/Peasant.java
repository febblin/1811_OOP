package chars;

import java.util.ArrayList;

public class Peasant extends BaseHero {

    public Peasant(ArrayList<BaseHero> myParty, int x, int y) {
       super(1, 1, new int[]{1, 1}, 1, 3, "Peasant", myParty, x, y);
    }

    @Override
    public void step() {

    }
}
