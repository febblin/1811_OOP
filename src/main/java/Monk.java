public class Monk extends Base {
    boolean magic;
    public Monk() {
        super(12, 7, new int[]{-4,-4}, 30, 5, "Monk");
        this.magic = true;
    }

    public Monk(int attack, int protection, int[] damage, double health, int speed, String name, boolean magic) {
        super(attack, protection, damage, health, speed, name);
        this.magic = magic;
    }

    public boolean isMagic() {
        return magic;
    }

    public void setMagic(boolean magic) {
        this.magic = magic;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", magic=" + magic;
    }
}
