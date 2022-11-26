public class Monk extends Base {

    public Monk() {
        super(12, 7, new int[]{-4,-4}, 30, 5, "Monk");
    }

    public Monk(int attack, int protection, int[] damage, double health, int speed, String name) {
        super(attack, protection, damage, health, speed, name);
    }
}
