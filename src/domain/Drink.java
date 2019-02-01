package domain;

/**
 * @author Marco Fiorito
 */
public class Drink extends KitchenPossibilities implements Comparable<Drink>{
    
    private String brand;
    public static String[] posibleSizes = {"","0.250","0.300","0.500","0.700","1.0","1.25","1.5","2.25"};
    public static String[] typePosibilities = {"","Común","Light"};
    private String type;
    private String size;
    
    public Drink(int cost, String description, String size, String brand, String type) {
        super(cost,description);
        this.setSize(size);
        this.setBrand(brand);
        this.setType(type);
    }
    
    
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return  brand + " " + type + " de " + size + " Precio: " + super.cost;
    }

    @Override
    public boolean equals(Object o) {
        String drink = this.getBrand() + " " + this.getType() + " " + this.getSize();
        String parmDrink = ((Drink)o).getBrand() + " " + ((Drink)o).getType() + " " + ((Drink)o).getSize();
        
        return drink.equals(parmDrink);
    }

    @Override
    public int compareTo(Drink t) {
        String drink = this.getBrand() + " " + this.getType() + " " + this.getSize();
        String parmDrink = t.getBrand() + " " + t.getType() + " " + t.getSize();
        
        return drink.compareTo(parmDrink);
    }
    
    
}
