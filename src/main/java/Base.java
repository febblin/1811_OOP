import java.util.Arrays;

public abstract class Base {
    private int attack;
    private int protection;
    private int[] damage;
    private double health;
    private int speed;
    private static int idCounter;
    private int playerID;
    private String name;

    public Base(int attack, int protection, int[] damage, double health, int speed, String name) {
        this.attack = attack;
        this.protection = protection;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.playerID = idCounter++;
        this.name = name + playerID;
    }

    public int getPlayerID() {
        return playerID;
    }

    public int getAttack() {
        return attack;
    }

    public int getProtection() {
        return protection;
    }

    public int[] getDamage() {
        return damage;
    }

    public double getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public String getName() {
        return name;
    }

    public void setAttack(int attack) {
        if (attack >= 0)
            this.attack = attack;
    }

    public void setProtection(int protection) {
        if (protection >=0)
            this.protection = protection;
    }

    public void setDamage(int[] damage) {
        this.damage = damage;
    }

    public void setHealth(double health) {
        if (health >=0)
            this.health = health;
    }

    public void setSpeed(int speed) {
        if (speed >=0)
            this.speed = speed;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name=" + name +
                ", attack=" + attack +
                ", protection=" + protection +
                ", damage=" + Arrays.toString(damage) +
                ", health=" + health +
                ", speed=" + speed;
    }

    public boolean equalsClass(Base hero) {
        if (this.getClass() == hero.getClass()) return true;
        else return false;
    }

}

