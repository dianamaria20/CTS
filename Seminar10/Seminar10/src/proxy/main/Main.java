package proxy.main;

import proxy.classes.Client;
import proxy.classes.ITicketOffice;
import proxy.classes.Proxy;
import proxy.classes.TicketOffice;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client(10, "Dana");
        Client client2 = new Client(18, "Ion");

        ITicketOffice office = new TicketOffice();

        office.sellTicket(client1);
        office.sellTicket(client2);

        ITicketOffice officeProxy = new Proxy(office);
        officeProxy.sellTicket(client1);
        officeProxy.sellTicket(client2);
    }
}