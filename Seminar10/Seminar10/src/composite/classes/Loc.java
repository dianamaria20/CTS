package composite.classes;

public class Loc implements IComponentAbstract{
    private int rand;
    private int numar;

    public Loc(int rand, int numar) {
        this.rand = rand;
        this.numar = numar;
    }

    @Override
    public void addNode(IComponentAbstract nod) throws Exception {
        throw new Exception("Not yet implemented");
    }

    @Override
    public void stergeNod(IComponentAbstract nod) throws Exception {
        throw new Exception("Not yet implemented");
    }

    @Override
    public IComponentAbstract getNodCopil(int index) throws Exception {
        throw new Exception("Not yet implemented");

    }

    @Override
    public void afiseazaComponenta(String indentare) {
        System.out.println(indentare+ "Locul de pe randul " +this.rand+ " si numarul " +this.numar);
    }
}
