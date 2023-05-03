package facade.classes;

public class Politie {
    public boolean areCazier(String cnp){

            return cnp.charAt(12)%2==0;
    }


}
