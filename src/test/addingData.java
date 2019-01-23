package test;

import domain.Client;
import domain.Drink;
import domain.Model;
import domain.Order;
import domain.Plate;
import domain.Table;
import java.util.ArrayList;

/**
 * @author Class to add data
 */
public class addingData {
    private Model model;
    
    public addingData(Model m){
        model = m;
    }
    
    public void addingInitialApplicationData(){
        //Adding clients
        Client client1 = new Client("Marco Fiorito","1455135453");
        Client client2 = new Client("Ricky Hernangomez","2513554564");
        model.addClient(client1);
        model.addClient(client2);
        
        //Adding tables
        Table table;
        
        for(int i = 1; i <= 25; i++){
            table = new Table(i);
            model.addTable(table);
        }
        
        //Adding drinks
        Drink drink1 = new Drink(125,"",Drink.posibleSizes[4],"Pepsi",Drink.typePosibilities[1]);
        Drink drink2 = new Drink(150,"",Drink.posibleSizes[4],"Pepsi",Drink.typePosibilities[2]);
        Drink drink3 = new Drink(75,"",Drink.posibleSizes[2],"Agua Salus",Drink.typePosibilities[0]);
        model.addDrink(drink1);
        model.addDrink(drink2);
        model.addDrink(drink3);
        
        //Adding plates
        Plate plate1 = new Plate(235,"","Asado","fritas","");
        Plate plate2 = new Plate(390,"","Salmón","guarnición","");
        Plate plate3 = new Plate(320,"","Milanesa","fritas","cheddar");
        model.addPlate(plate1);
        model.addPlate(plate2);
        model.addPlate(plate3);
        
        //Adding Orders
        
        //1
        ArrayList<Plate> listOfPlates1 = new ArrayList<>();
        ArrayList<Drink> listOfDrinks1 = new ArrayList<>();
        
        listOfPlates1.add(plate3);
        listOfPlates1.add(plate1);
        listOfDrinks1.add(drink1);
        
        Order order1 = new Order(listOfPlates1,listOfDrinks1,0,model.getListOfTables().get(2));
        model.addOrder(order1);
        
        //2
        ArrayList<Plate> listOfPlates2 = new ArrayList<>();
        ArrayList<Drink> listOfDrinks2 = new ArrayList<>();
        
        listOfPlates2.add(plate2);
        listOfPlates2.add(plate1);
        listOfPlates2.add(plate1);
        listOfDrinks2.add(drink1);
        listOfDrinks2.add(drink3);
        
        Order order2 = new Order(listOfPlates2,listOfDrinks2,10,model.getListOfTables().get(1));
        model.addOrder(order2);
        
        //3
        ArrayList<Plate> listOfPlates3 = new ArrayList<>();
        ArrayList<Drink> listOfDrinks3 = new ArrayList<>();
        
        listOfPlates3.add(plate1);
        listOfPlates3.add(plate1);
        listOfDrinks3.add(drink2);  
        
        Order order3 = new Order(listOfPlates3,listOfDrinks3,5,model.getListOfTables().get(5));
        model.addOrder(order3);
     }
}
