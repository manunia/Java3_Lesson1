package bigTask;

public abstract class Fruit {

    private String fruitTipe;
    private float fruitWeight;

    public Fruit(String fruitTipe) {
        this.fruitTipe = fruitTipe;
        this.fruitWeight = fruitWeight;
    }

    public String getFruitTipe() {
        return fruitTipe;
    }

    public abstract float geWeight();
}
