package ro.ase.strategy.classes;

public class PlataCardBancar implements TipPlata{
    @Override
    public void plateste(double pretBilet) {
        System.out.println("Plata biletului in valoare de " + pretBilet+ " a fost efectuata cu card bancar ");
    }
}
