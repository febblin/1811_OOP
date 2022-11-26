import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public abstract class Base implements BaseInterface {
    private int attack;
    private int protection;
    private int[] damage;
    private double health;

    private double maxHealth;
    private int speed;
    private String name;

    public Base(int attack, int protection, int[] damage, double health, int speed, String name) {
        this.attack = attack;
        this.protection = protection;
        this.damage = damage;
        this.maxHealth = health;
        this.health = maxHealth;
        this.speed = speed;
        this.name = name;
    }

    public void damage(int damage) {
        this.health = health - damage;
    }

    @Override
    public String getInfo() {
        return "name=" + name +
                ", attack=" + attack +
                ", protection=" + protection +
                ", damage=" + Arrays.toString(damage) +
                ", health=" + health +
                ", speed=" + speed;
    }

    public boolean equalsClass(Base hero) {
        return this.getClass() == hero.getClass();
    }

    @Override
    public void step(ArrayList<Base> party) {
        Random r = new Random();
        int value = r.nextInt(this.damage[0], this.damage[1]);

        List<String> healers = List.of("Monk", "Wizard");
        if (healers.contains(this.getClass().getSimpleName())) {
            double mostDamaged = party.get(0).health;
            int mostDamagedInd = 0;
            for (int i = 1; i < party.size(); i++) {
                if (party.get(i).health < mostDamaged) {
                    mostDamaged = party.get(i).health;
                    mostDamagedInd = i;
                }
            }
            party.get(mostDamagedInd).damage(value);
        }
        else {
            double minDamaged = party.get(0).health;
            int minDamagedInd = 0;
            for (int i = 1; i < party.size(); i++) {
                if (party.get(i).health > minDamaged) {
                    minDamaged = party.get(i).health;
                    minDamagedInd = i;
                }
            }
            party.get(minDamagedInd).damage(value);
        }
    }
}

