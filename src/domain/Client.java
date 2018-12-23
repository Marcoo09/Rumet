package domain;
/**
 * @author Marco Fiorito
 */
public class Client {
    private String name;
    private String  rut;

    public Client(String name,String rut) {
        this.name = name;
        this.rut = rut;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
    
}
