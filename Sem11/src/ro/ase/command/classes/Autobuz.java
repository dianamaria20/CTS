package ro.ase.command.classes;

public class Autobuz implements Automobil{
    private int nr;

    public Autobuz(int nr) {
        this.nr = nr;
    }

    @Override
    public void plecareCursa(int nrLinie) {
        System.out.println("Autobuzul cu numarul " + this.nr + " a plecat in cursa pe linia " + nrLinie);
    }
}
