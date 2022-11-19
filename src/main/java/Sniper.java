public class Sniper extends Xbowman {

    public Sniper() {
        super(12, 10, new int[]{8, 10}, 15, 9, "Sniper", 32);
    }

    public Sniper(int attack, int protection, int[] damage, double health, int speed, String name, int shoot) {
        super(attack, protection, damage, health, speed, name, shoot);
    }

}
