package domain;
/**
 * @author Marco Fiorito
 */
public class Client {
    private String name;
    private int rut;

    public Client(String name, int rut) {
        this.name = name;
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
    
}
