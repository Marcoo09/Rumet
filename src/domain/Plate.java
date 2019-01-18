package domain;
/**
 * @author Marco Fiorito
 */
public class Plate extends KitchenPossibilities{
    
    private String mainPlate;
    private String secondaryPlate;
    private String sauce;
    
    public Plate(int cost, String description, String main, String secondary, String sauce) {
        super(cost, description);
        this.setMainPlate(main);
        this.setSauce(sauce);
        this.setSecondaryPlate(secondary);
    }

    public String getMainPlate() {
        return mainPlate;
    }

    public void setMainPlate(String mainPlate) {
        this.mainPlate = mainPlate;
    }

    public String getSecondaryPlate() {
        return secondaryPlate;
    }

    public void setSecondaryPlate(String secondaryPlate) {
        this.secondaryPlate = secondaryPlate;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    
    @Override
    public String toString() {
        return mainPlate + " con " + secondaryPlate + " y salsa " + sauce  + " Precio: " + super.cost;
    }
    
}
