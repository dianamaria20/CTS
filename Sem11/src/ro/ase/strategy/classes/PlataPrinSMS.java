package ro.ase.strategy.classes;

public class PlataPrinSMS implements TipPlata{
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata biletului in valoare de " + pretBilet+ " a fost efectuata prin sms");
    }
}
