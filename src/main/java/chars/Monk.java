package chars;

import java.util.ArrayList;

public class Monk extends BaseHero {

    public Monk(ArrayList<BaseHero> myParty) {
        super(12, 7, new int[]{-4,-4}, 30, 5, "chars.Monk", myParty);
    }

    public Monk(int attack, int protection, int[] damage, double health, int speed, String name, ArrayList<BaseHero> myParty) {
        super(attack, protection, damage, health, speed, name, myParty);
    }

    @Override
    public void step() {
        double mostDamaged = this.getMyParty().get(0).getHealth();
            int mostDamagedInd = 0;
            for (int i = 1; i < this.getMyParty().size(); i++) {
                if (this.getMyParty().get(i).getHealth() < mostDamaged) {
                    mostDamaged = this.getMyParty().get(i).getHealth();
                    mostDamagedInd = i;
                }
            }
        this.getMyParty().get(mostDamagedInd).damage(this.getDamage()[0]);
    }
}
