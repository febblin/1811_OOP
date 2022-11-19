public class Robber extends Base{
    public Robber() {
        super(8, 3, new int[]{2,4}, 10, 6, "Robber");
    }

    public Robber(int attack, int protection, int[] damage, double health, int speed, String name) {
        super(attack, protection, damage, health, speed, name);
    }
}
