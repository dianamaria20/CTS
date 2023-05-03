package facade.main;

import facade.classes.Bilet;
import facade.classes.Client;
import facade.classes.Facade;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("1435679321446", "Rares");
        Client client2 = new Client("4536278591211", "Razvan");
        Bilet bilet1 = new Bilet("Razvan");
        Bilet bilet2 = new Bilet("Cristian");

        Facade facade = new Facade();
        facade.permiteIntrarea(client1, bilet2);
        facade.permiteIntrarea(client2, bilet1);
    }
}
