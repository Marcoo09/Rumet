package domain;

/**
 * @author Marco Fiorito
 */
public class Drink extends KitchenPossibilities{
    
    private String brand;
    private double[] size ={0.250,0.300,0.500,0.70,1.0,1.25,1.5,2.25};
    private String[] type = {"","Común","Light"};
    
    public Drink(int cost, String description) {
        super(cost,description);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double[] getSize() {
        return size;
    }

    public void setSize(double[] size) {
        this.size = size;
    }

    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  brand + " " + type + " de " + size + " Precio: " + super.cost;
    }
    
}
