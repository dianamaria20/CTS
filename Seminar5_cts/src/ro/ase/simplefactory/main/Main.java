package ro.ase.simplefactory.main;

import ro.ase.simplefactory.Bus;
import ro.ase.simplefactory.ITransportVehicle;
import ro.ase.simplefactory.VehicleFactory;
import ro.ase.simplefactory.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[])  {
        VehicleFactory factory = new VehicleFactory();
        try {
            ITransportVehicle bus = factory.createVehicle(VehicleType.BUS, 20);
            ITransportVehicle tram = factory.createVehicle(VehicleType.TRAM, 30);
            ITransportVehicle trolley = factory.createVehicle(VehicleType.TROLLEY, 35);
            List<ITransportVehicle> vehicles = new ArrayList<>();
            vehicles.add(bus);
            vehicles.add(tram);
            vehicles.add(trolley);
            vehicles.add(factory.createVehicle(VehicleType.BUS, 20));
            vehicles.add(factory.createVehicle(VehicleType.TRAM, 5));
            vehicles.add(factory.createVehicle(VehicleType.SUBWAY, 50));
            for(ITransportVehicle vehicle : vehicles) {
                vehicle.showInfo();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

