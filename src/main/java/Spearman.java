public class Spearman extends Base {
    public Spearman() {
        super(4, 5,  new int[]{1,3}, 10, 4,  "Spearman");
    }

    public Spearman(int attack, int protection, int[] damage, double health, int speed, String name) {
        super(attack, protection, damage, health, speed, name);
    }

}
