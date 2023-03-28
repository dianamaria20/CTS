package ro.ase.simplefactory;

public class Subway implements ITransportVehicle{
    private int noSeats;

    public Subway(int noSeats) {
        this.noSeats = noSeats;
    }

    @Override
    public void showInfo() {
        System.out.println("The Subway has "+this.noSeats+ " seats");
    }

    @Override
    public void movingType() {
        System.out.println("The Subway goes underground");
    }
}
