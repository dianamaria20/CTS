package composite.main;

import composite.classes.IComponentAbstract;
import composite.classes.Loc;
import composite.classes.Tribuna;

public class Main {
    public static void main(String[] args) throws Exception {
        IComponentAbstract tribunaPrincipala = new Tribuna("Tribuna principala");
        IComponentAbstract tribunaCopii = new Tribuna("Tribuna copii");
        IComponentAbstract tribunaAdulti = new Tribuna("Tribuna adulti");

        IComponentAbstract loc1 = new Loc(2,1);
        IComponentAbstract loc2 = new Loc(2,2);
        IComponentAbstract loc3 = new Loc(2,3);

        tribunaPrincipala.addNode(tribunaCopii);
        tribunaPrincipala.addNode(tribunaAdulti);
        tribunaCopii.addNode(loc1);
        tribunaAdulti.addNode(loc2);
        tribunaPrincipala.addNode(loc3);
        tribunaPrincipala.afiseazaComponenta(" ");


    }
}
