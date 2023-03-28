package factory_method.main;

import factory_method.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Factory fAutobuze = new FactoryAutobuz();
        Factory fTrolebuze = new FactoryTrolebuz();

        List<TransportVehicle> mijloaceTransport = new ArrayList<>();
        mijloaceTransport.add(fAutobuze.createObject(44));
        mijloaceTransport.add(fAutobuze.createObject(15));
        mijloaceTransport.add(fTrolebuze.createObject(35));

        for(TransportVehicle t:mijloaceTransport) {
            t.showInfo();
            t.moveType();
        }

    }
}
