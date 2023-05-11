package ro.ase.strategy.main;

import ro.ase.strategy.classes.Calator;
import ro.ase.strategy.classes.PlataCardBancar;
import ro.ase.strategy.classes.PlataCardCalatorii;
import ro.ase.strategy.classes.PlataPrinSMS;

public class Main {
    public static void main(String[] args) {
        Calator calator = new Calator("Diana");
        calator.platesteBilet(5);
        calator.setMetodaPlata(new PlataPrinSMS());
        calator.platesteBilet(10);
        calator.setMetodaPlata(new PlataCardCalatorii());
        calator.platesteBilet(15);
        calator.setMetodaPlata(new PlataCardBancar());
        calator.platesteBilet(25);
    }
}
