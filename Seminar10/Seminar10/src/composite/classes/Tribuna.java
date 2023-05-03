package composite.classes;

import java.util.ArrayList;
import java.util.List;

public class Tribuna implements  IComponentAbstract{
    private String name;
    private List<IComponentAbstract> listaComponenta;

    public Tribuna(String name) {
        this.name = name;
        listaComponenta = new ArrayList<>();
    }

    @Override
    public void addNode(IComponentAbstract nod) throws Exception {
        listaComponenta.add(nod);
    }

    @Override
    public void stergeNod(IComponentAbstract nod) throws Exception {
        listaComponenta.remove(nod);
    }

    @Override
    public IComponentAbstract getNodCopil(int index) throws Exception {
       return listaComponenta.get(index);
    }

    @Override
    public void afiseazaComponenta(String indentare) {
        System.out.println("Tribuna "+ this.name+ "contine: ");
        for(IComponentAbstract componenta: listaComponenta){
            componenta.afiseazaComponenta(indentare+ "  ");
        }
    }
}
