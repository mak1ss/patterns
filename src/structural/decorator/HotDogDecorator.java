package structural.decorator;

public abstract class HotDogDecorator implements HotDog{

    protected HotDog hotDog;

    protected HotDogDecorator(HotDog hotDog){
        this.hotDog = hotDog;
    }
}
