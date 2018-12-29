package domain;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author Marco Fiorito
 */
public class Model implements Serializable{

    private ArrayList<Drink> listOfDrinks;
    private ArrayList<Plate> listOfPlates;
    private ArrayList<Order> listOfOrders;
    private ArrayList<Client> listOfClients;
    private ArrayList<Table> listOfTables;

    public  static String account = "rumet";
    public static String password = "facil12.";
    
    public Model(){
        listOfClients = new ArrayList<>();
        listOfDrinks = new ArrayList<>();
        listOfOrders = new ArrayList<>();
        listOfPlates = new ArrayList<>();
        listOfTables = new ArrayList<>();
    }
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
