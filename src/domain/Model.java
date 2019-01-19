package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;

/**
 * @author Marco Fiorito
 */
public class Model extends Observable implements Serializable{

    private ArrayList<Drink> listOfDrinks;
    private ArrayList<Plate> listOfPlates;
    private ArrayList<Order> listOfOrders;
    private ArrayList<Client> listOfClients;
    private ArrayList<Table> listOfTables;
    
    private String typeOfUser;
    
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
        this.getSortedListOfOrders().add(parmOrder);
        Collections.sort(listOfOrders);
        this.setChanged();
        this.notifyObservers();
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

    public ArrayList<Order> getSortedListOfOrders() {
        Collections.sort(listOfOrders);
        return listOfOrders;
    }
    public ArrayList<Client> getListOfClients() {
        return listOfClients;
    }

    public ArrayList<Table> getListOfTables() {
        return listOfTables;
    }

    public String getTypeOfUser() {
        return typeOfUser;
    }

    public void setTypeOfUser(String typeOfUser) {
        this.typeOfUser = typeOfUser;
    }
    
    public ArrayList<Plate> getListOfOrderPlates(){
        ArrayList<Plate> returnedArray = new ArrayList<>();
        
        for(int i = 0; i < this.getSortedListOfOrders().size(); i++){
            Order currentOrder = this.getSortedListOfOrders().get(i);
            for(int j = 0; j < currentOrder.getListOfPlates().size(); j++){
                Plate currenPlate = currentOrder.getListOfPlates().get(j);
                returnedArray.add(currenPlate);
            }
        }
        
        return returnedArray;
    }
}
