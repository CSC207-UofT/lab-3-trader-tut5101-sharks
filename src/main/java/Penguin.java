

public class Penguin implements Tradable, Domesticatable {

    @Override
    public String sound() {
        return "noot noot!";
    }

    @Override
    public int getPrice() {
        return 120;
    }
}
