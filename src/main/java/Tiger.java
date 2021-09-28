public class Tiger implements Tradable, Domesticatable {
    private int age;
    private String origin;
    private int maxSpeed;

    public Tiger(int age,String origin, int maxSpeed){
        this.age = age;
        this.origin = origin;
        this.maxSpeed = maxSpeed;
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
