package factory_method;

public class FactoryTrolebuz implements Factory{
    @Override
    public TransportVehicle createObject(int noSeats) {
        return new Trolebuz(noSeats);
    }
}
