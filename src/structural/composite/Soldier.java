package structural.composite;

public class Soldier implements Component{

    private String name;


    public Soldier(String name){
        this.name = name;
    }

    @Override
    public void completeMission(String order) {
        System.out.println("Soldier " + name + " started completing order " + order);

    }
}
