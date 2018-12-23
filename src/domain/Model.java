package domain;

import java.util.ArrayList;

/**
 * @author Marco Fiorito
 */
public class Model {

    private ArrayList<Drink> listOfDrinks;
    private ArrayList<Plate> listOfPlates;
    private ArrayList<Order> listOfOrders;
    private ArrayList<Client> listOfClients;
    private ArrayList<Table> listOfTables;

    public void addDrink(Drink parmDrink) {
        this.getListOfDrinks().add(parmDrink);
    }

    public void addPlate(Plate parmPlate) {
        this.getListOfPlates().add(parmPlate);
    }

    public void addOrder(Order parmOrder) {
        this.getListOfOrders().add(parmOrder);
    }
    
    public void addClient(Client parmClient) {
        this.getListOfClients().add(parmClient);
    }
    
    public void addTable(Table parmTable) {
        this.getListOfTables().add(parmTable);
    }
    
    public ArrayList<Drink> getListOfDrinks() {
        return listOfDrinks;
    }

    public ArrayList<Plate> getListOfPlates() {
        return listOfPlates;
    }

    public ArrayList<Order> getListOfOrders() {
        return listOfOrders;
    }
    public ArrayList<Client> getListOfClients() {
        return listOfClients;
    }

    public ArrayList<Table> getListOfTables() {
        return listOfTables;
    }
    
}
