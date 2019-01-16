package domain;
/**
 * @author Marco Fiorito
 */
public class Plate extends KitchenPossibilities{
    
    private String mainPlate;
    private String secondaryPlate;
    private String sauce;
    
    public Plate(int cost, String description) {
        super(cost, description);
    }

    @Override
    public String toString() {
        return mainPlate + " con " + secondaryPlate + " y salsa " + sauce  + " Precio: " + super.cost;
    }
    
}
