package facade.classes;

public class Facade {
    public void permiteIntrarea(Client client, Bilet bilet){
        Politie politie = new Politie();
        if(client.getNume().equals(bilet.getNumeCumparator())){
            if(politie.areCazier(client.getCnp())){
                System.out.println("Suporterul "+ client.getNume()+ " intra pe stadion");
            }
            else{
                System.out.println("are cazieer");
            }
        }
        else {
            System.out.println("Biletul este al altcuiva");
        }
    }
}
