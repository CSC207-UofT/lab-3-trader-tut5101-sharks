
public class Venison implements Tradable {
    private int rarity;
    private int age;
    private String animal;
    private int base_price;

    public Venison(int rarity, int age, String animal) {
        this.rarity = rarity;
        this.age = age;
        this.animal = animal;
        this.base_price = 40;
    }

    @Override
    public int getPrice() {
        return this.base_price - this.age*(1/this.rarity);
    }

    @Override
    public String toString() {
        return "This is the meat of a " + this.animal;
    }

}
