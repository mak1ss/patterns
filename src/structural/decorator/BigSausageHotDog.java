package structural.decorator;

public class BigSausageHotDog extends HotDogDecorator{

    public BigSausageHotDog(HotDog hotDog) {
        super(hotDog);
    }

    @Override
    public void describe() {
        super.hotDog.describe();
        System.out.println("Added BIIG sausage to this hot dog");
    }
}
