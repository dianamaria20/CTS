package ro.ase.state.main;

import ro.ase.state.classes.Bus;
import ro.ase.state.classes.IBusState;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("VL21BUN");
        bus.goInService();
        bus.arriveAtTheEndOfTheRoute();
        bus.arriveAtTheEndOfTheRoute();
        bus.leaveForRoute();
        bus.goInService();
        bus.arriveAtTheEndOfTheRoute();
    }
}
