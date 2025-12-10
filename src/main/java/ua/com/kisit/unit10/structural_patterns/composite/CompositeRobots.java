package ua.com.kisit.unit10.structural_patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeRobots implements Composite{

    private List<Composite> composites = new ArrayList<>();

    public void addComposite(Composite composite) {
        composites.add(composite);
    }

    public void removeComposite(Composite composite) {
        composites.remove(composite);
    }


    @Override
    public void action() {
        for (Composite composite : composites) {
            composite.action();
        }
    }
}
