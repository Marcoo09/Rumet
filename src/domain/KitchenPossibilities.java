package domain;

import java.io.Serializable;

/**
 * @author Marco Fiorito
 */
public class KitchenPossibilities implements Serializable{

    public int cost;
    public String description;

    public KitchenPossibilities(int cost, String description) {
        this.cost = cost;
        this.description = description;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description + ", Costo: " + cost ;
    }
    
}
