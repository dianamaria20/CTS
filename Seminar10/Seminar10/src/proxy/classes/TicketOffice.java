package proxy.classes;

public class TicketOffice implements ITicketOffice{
    @Override
    public void sellTicket(Client client) {
        System.out.println("Ticket to " +client.getClientName());
    }
}
