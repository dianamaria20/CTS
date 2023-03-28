package ro.ase.acs.prototype.main;

import ro.ase.acs.prototype.models.AbstractPrototype;
import ro.ase.acs.prototype.models.Client;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        AbstractPrototype clientPrototype = new Client("Andrei", "0757570500", "andrei@gmail.com");
        AbstractPrototype client2 = clientPrototype.createCopy();

        System.out.println(client2.toString());
    }
}
