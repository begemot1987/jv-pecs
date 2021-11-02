package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Machine;
import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer {
    @Override
    public List<Machine> get() {
        List<Machine> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer("CAT", "Yellow", 26));
        bulldozers.add(new Bulldozer("CAT", "Yellow", 26));
        bulldozers.add(new Bulldozer("CAT", "Yellow", 26));
        return bulldozers;
    }
}