package bigTask;

public class Apple extends Fruit {

    private final float appleWeight = 1.0f;

    public Apple() {
        super("Apple");
    }

    @Override
    public float geWeight() {
        return appleWeight;
    }
}
