package chars;

import java.util.ArrayList;

public class Xbowman extends BaseHero {
    private int shoot;
    public Xbowman(ArrayList<BaseHero> myParty, int x, int y) {
        super(6, 3, new int[]{2,3}, 10, 4,  "Xbowman", myParty, x, y);
        this.shoot = 16;
    }
    public Xbowman(int attack, int protection, int[] damage, double health, int speed, String name, int shoot, ArrayList<BaseHero> myParty, int x, int y) {
        super(attack, protection, damage, health, speed, name, myParty, x, y);
        this.shoot = shoot;
    }

    public int getShoot() {
        return shoot;
    }

    public void setShoot(int shoot) {
        this.shoot = shoot;
    }


    @Override
    public String getInfo() {
        return super.getInfo() +
                ", shoot=" + shoot;
    }

    @Override
    public void step(ArrayList<BaseHero> party) {
        for (BaseHero h: this.getMyParty()) {
            if (h.getName().equals("Peasant") && h.status.equals("stand")) {
                this.shoot++;
                h.status = "used";
                break;
            }
        }
        if (this.shoot<1) return;
        BaseHero target = this.getPosition().findNearest(party);
        double dist = this.getPosition().distance(target.getPosition());
        target.damage(dist < this.getSpeed() ?
                super.damageValue(target) :
                (super.damageValue(target)/2));
        this.shoot--;
        }
}
