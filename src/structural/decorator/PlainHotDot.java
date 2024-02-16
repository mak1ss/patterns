package structural.decorator;

public class PlainHotDot implements HotDog{


    @Override
    public void describe() {
        System.out.println("I'm just simple hot dog");
    }
}
