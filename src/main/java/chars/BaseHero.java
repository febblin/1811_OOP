package chars;

import java.util.ArrayList;
import java.util.Arrays;

public abstract class BaseHero implements BaseInterface {
    private int attack;
    private int defense;
    private int[] damage;
    private double health;
    private double maxHealth;
    private int speed;
    private String name;
    protected ArrayList<BaseHero> myParty;
    private int [] position = new int [2];

    protected String status;

    public BaseHero(int attack, int defense, int[] damage, double health, int speed, String name, ArrayList<BaseHero> myParty, int x, int y) {
        this.attack = attack;
        this.defense = defense;
        this.damage = damage;
        this.maxHealth = health;
        this.health = maxHealth;
        this.speed = speed;
        this.name = name;
        this.myParty = myParty;
        this.position[0] = x;
        this.position[1] = y;
        this.status = "stand";
    }

    public int[] getPosition() {
        return position;
    }

    public boolean isEqualPos(int[] pos) {
        return this.position[0]==pos[0] && this.position[1]==pos[1];
    }

    public int[] getDamage() {
        return damage;
    }

    protected void damage(int damage) {
        this.health = health - damage;
        if (this.health <= 0) {
            this.status = "dead";
            this.health = 0;
        }
        if (this.health > this.maxHealth) this.health = this.maxHealth;
    }

    @Override
    public String getInfo() {
        return "name=" + name +
                ", attack=" + attack +
                ", defense=" + defense +
                ", damage=" + Arrays.toString(damage) +
                ", health=" + health +
                ", speed=" + speed;
    }

    public String getName() {
        return name;
    }
    protected boolean equalsClass(BaseHero hero) {
        return this.getName() == hero.getName();
    }

    public double getHealth() {
        return health;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getSpeed() {
        return speed;
    }

    public ArrayList<BaseHero> getMyParty() {
        return myParty;
    }

    @Override
    public void step(ArrayList<BaseHero> party) {}

    public double distance(BaseHero h) {
        return Math.sqrt(((h.getPosition()[0] - this.position[0])^2 + (h.getPosition()[1] - this.position[1])^2));
    }

    protected int damageValue (BaseHero h) {
        int flag = this.getAttack() - h.getDefense();
        int value = 0;
        if (flag == 0) value = ((this.getDamage()[0] + this.getDamage()[1]) / 2);
        if (flag > 0) value = this.getDamage()[1];
        if (flag < 0) value = this.getDamage()[0];
        return value;
    }

//    @Override
//    public void step(ArrayList<chars.BaseHero> party) {
//        Random r = new Random();
//        int value = r.nextInt(this.damage[0], this.damage[1]);
//
//        List<String> healers = List.of("chars.Monk", "chars.Warlock");
//        if (healers.contains(this.getClass().getSimpleName())) {
//            double mostDamaged = party.get(0).health;
//            int mostDamagedInd = 0;
//            for (int i = 1; i < party.size(); i++) {
//                if (party.get(i).health < mostDamaged) {
//                    mostDamaged = party.get(i).health;
//                    mostDamagedInd = i;
//                }
//            }
//            party.get(mostDamagedInd).damage(value);
//        }
//        else {
//            double minDamaged = party.get(0).health;
//            int minDamagedInd = 0;
//            for (int i = 1; i < party.size(); i++) {
//                if (party.get(i).health > minDamaged) {
//                    minDamaged = party.get(i).health;
//                    minDamagedInd = i;
//                }
//            }
//            party.get(minDamagedInd).damage(value);
//        }
//    }
}

