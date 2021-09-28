public class Tiger implements Tradable, Domesticatable {

    private int maxSpeed;

    public Tiger(){
        this.maxSpeed = 500;
    }

    @Override
    public String sound() {
        return "Grr!";
    }

    @Override
    public int getPrice() {
        return 500;
    }
}
