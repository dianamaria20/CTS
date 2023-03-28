package factory_method;

public class Autobuz extends TransportVehicle{

    public Autobuz(int noSeats) {
        super(noSeats);
    }

    @Override
    public void showInfo() {
        System.out.println("The bus " +super.toString() );
    }

    @Override
    public void moveType() {

        System.out.println("The bus is moving");
    }
}
