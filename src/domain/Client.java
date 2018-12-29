package domain;

import java.io.Serializable;

/**
 * @author Marco Fiorito
 */
public class Client implements Serializable{
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

    @Override
    public String toString() {
        return name;
    }
    
    
}
