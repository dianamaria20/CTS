package composite.classes;

public interface IComponentAbstract {
    public void addNode(IComponentAbstract nod) throws Exception;
    public void stergeNod(IComponentAbstract nod) throws Exception;
    public IComponentAbstract getNodCopil(int index) throws Exception;

    public void afiseazaComponenta(String indentare);


}
