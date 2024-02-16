package structural.decorator;

public class CheeseHotDog extends HotDogDecorator{

    public CheeseHotDog(HotDog hotDog) {
        super(hotDog);
    }

    @Override
    public void describe() {
        super.hotDog.describe();
        System.out.println("Added delicious cheese to this hot dog");
    }
}
