package domain;

import java.util.ArrayList;

/**
 * @author Marco Fiorito
 */
public class Model {

    private ArrayList<Drink> listOfDrinks;
    private ArrayList<Plate> listOfPlates;
    private ArrayList<Order> ListOfOrders;

    public void addDrink(Drink parmDrink) {
        this.getListOfDrinks().add(parmDrink);
    }

    public void addPlate(Plate parmPlate) {
        this.getListOfPlates().add(parmPlate);
    }

    public void addOrder(Order parmOrder) {
        this.getListOfOrders().add(parmOrder);
    }

    public ArrayList<Drink> getListOfDrinks() {
        return listOfDrinks;
    }

    public ArrayList<Plate> getListOfPlates() {
        return listOfPlates;
    }

    public ArrayList<Order> getListOfOrders() {
        return ListOfOrders;
    }

}
