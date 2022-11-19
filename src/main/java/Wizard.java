public class Wizard extends Monk {

    public Wizard() {
        super(17, 12, new int[]{-5, -5}, 30, 9, "Wizard", true);
    }

    public Wizard(int attack, int protection, int[] damage, double health, int speed, String name, boolean magic) {
        super(attack, protection, damage, health, speed, name, magic);
    }

}

