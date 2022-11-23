public class Peasant extends Base {

    private boolean delivery;

    public Peasant() {
       super(1, 1, new int[]{1, 1}, 1, 3, "Peasant");
       this.delivery = true;
    }

    public Peasant(int attack, int protection, int[] damage, double health, int speed, String name, boolean delivery) {
        super(attack, protection, damage, health, speed, name);
        this.delivery = delivery;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                ", delivery=" + delivery;
    }

}
