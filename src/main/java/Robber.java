import java.util.ArrayList;

public class Robber extends BaseHero {
    public Robber(ArrayList<BaseHero> myParty) {
        super(8, 3, new int[]{2,4}, 10, 6, "Robber", myParty);
    }

    @Override
    public void step() {

    }
}
