package proxy.classes;

public class Proxy implements ITicketOffice{
    ITicketOffice office;

    public Proxy(ITicketOffice office) {
        this.office = office;
    }

    @Override
    public void sellTicket(Client client) {
        if(client.getAge()>= 15){
            office.sellTicket(client);
        }
        else {
            System.out.println("Clientul "+ client.getClientName()+ " is too young");
        }
    }
}
