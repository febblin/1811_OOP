public class Xbowman extends Base {
    private int shoot;
    public Xbowman() {
        super(6, 3, new int[]{2,3}, 10, 4,  "Xbowman");
        this.shoot = 16;
    }
    public Xbowman(int attack, int protection, int[] damage, double health, int speed, String name, int shoot) {
        super(attack, protection, damage, health, speed, name);
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

}
