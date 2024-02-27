package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class General implements Composite, Component{

    private List<Component> components;


    public General(Component... components){
        this.components = new ArrayList<>(List.of(components));
    }
    @Override
    public void addChild(Component component) {
        components.add(component);
    }

    @Override
    public void removeChild(Component component) {
        components.remove(component);
    }

    @Override
    public void completeMission(String order) {
        components.forEach(c -> c.completeMission(order));
    }
}
