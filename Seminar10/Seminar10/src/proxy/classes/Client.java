package proxy.classes;

public class Client {
    private int age;
    private String clientName;

    public Client(int age, String clientName) {
        this.age = age;
        this.clientName = clientName;
    }

    public int getAge() {
        return age;
    }

    public String getClientName() {
        return clientName;
    }
}
