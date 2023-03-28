package factory_method;

public class Trolebuz extends TransportVehicle{
    public Trolebuz(int noSeats) {
        super(noSeats);
    }

    @Override
    public void showInfo() {
        System.out.println("The trolley" + super.toString());
    }

    @Override
    public void moveType() {
        System.out.println("The trolley is electric");
    }
}
