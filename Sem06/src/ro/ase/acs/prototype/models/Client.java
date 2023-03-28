package ro.ase.acs.prototype.models;


public class Client implements AbstractPrototype {
    private String nume;
    private String phoneNumber;
    private String email;
    private Client() {

    }

    public Client(String nume, String phoneNumber, String email) {
        if(nume.length()>=3) {
            this.nume = nume;
        }
        else {
            throw new IllegalArgumentException();
        }

        this.phoneNumber = phoneNumber;
        if(email.contains("@")){
            this.email = email;
        }
        else {
            throw new IllegalArgumentException();
        }

    }

    public AbstractPrototype createADeepCopy() {
       Client client = new Client();
       client.nume = this.nume;
       client.phoneNumber = this.phoneNumber;
       client.email = this.email;
       return (AbstractPrototype) client;
    }
    @Override
    public AbstractPrototype createCopy() throws CloneNotSupportedException {
        return (AbstractPrototype) this.clone();

    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
