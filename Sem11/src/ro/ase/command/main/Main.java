package ro.ase.command.main;

import ro.ase.command.classes.Autobuz;
import ro.ase.command.classes.Automobil;
import ro.ase.command.classes.CommandPlecareInCursa;
import ro.ase.command.classes.OperatorComenzi;

public class Main {
    public static void main(String[] args) {

        OperatorComenzi operatorComenzi = new OperatorComenzi();
        Automobil autobuz = new Autobuz(13);

        operatorComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(1)));
        operatorComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));
        operatorComenzi.invocaComanda(new CommandPlecareInCursa(12, new Autobuz(3)));
        operatorComenzi.invocaComanda(new CommandPlecareInCursa(11, autobuz));

        operatorComenzi.executaComanda();
        operatorComenzi.executaComanda();
        operatorComenzi.invocaComanda(new CommandPlecareInCursa(10, new Autobuz(23)));
        operatorComenzi.executaComanda();
        operatorComenzi.executaComanda();
        operatorComenzi.executaComanda();
    }
}