package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Observable;

/**
 * @author Marco Fiorito
 */
public class Order extends Observable implements Serializable, Comparable{
    
    private ArrayList<Plate> listOfPlates;
    private ArrayList<Drink> listOfDrinks;
    private Date date;
    private float discount;
    private int total;
    private int subtotal;
    private Table table;
    
    public Order(ArrayList<Plate> listOfPlates, ArrayList<Drink> listOfDrinks, float discount, Table t) {
        this.listOfPlates = listOfPlates;
        this.listOfDrinks = listOfDrinks;
        this.discount = discount;
        this.table = t;
        this.date = new Date();
        this.setSubtotal();
        this.setTotal();
    }

    public ArrayList<Plate> getListOfPlates() {
        return listOfPlates;
    }

    public void setListOfPlates(ArrayList<Plate> listOfPlates) {
        this.listOfPlates = listOfPlates;
    }

    public ArrayList<Drink> getListOfDrinks() {
        return listOfDrinks;
    }

    public void setListOfDrinks(ArrayList<Drink> listOfDrinks) {
        this.listOfDrinks = listOfDrinks;
    }

    public Date getDate() {
        return date;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal() {
        this.total = 0;
        if(this.getDiscount() == 0){
            this.total = this.getSubtotal();
        }else{
            this.total = this.getSubtotal() - (int)(this.getSubtotal() * (this.getDiscount() / 100));
        }
    }

    public int getSubtotal() {
        return subtotal;
    }

    public void setSubtotal() {
      this.subtotal = 0;
      for(int i = 0; i < this.getListOfPlates().size();i++){
          this.subtotal += this.getListOfPlates().get(i).getCost();
      }
      
      for(int i = 0; i < this.getListOfDrinks().size();i++){
          this.subtotal += this.getListOfDrinks().get(i).getCost();
      }  
    }
    
    public void setOrderChanges(ArrayList<Plate> listOfPlates, ArrayList<Drink> listOfDrinks, float discount, Table t){
        this.listOfPlates = listOfPlates;
        this.listOfDrinks = listOfDrinks;
        this.discount = discount;
        this.table = t;
        this.setSubtotal();
        this.setTotal();
        this.setChanged();
        this.notifyObservers();        
    }
    
    
    public int getQtyOfPlates(Plate plate){
        int counter = 1;
        
        ArrayList<Plate> auxiliarArray = this.getListOfPlates();
        
        Collections.sort(auxiliarArray);
        
        for (int i = 0; i < auxiliarArray.size(); i++) {
            Plate currentPlate = auxiliarArray.get(i);
            auxiliarArray.remove(currentPlate);
            i--;
            
            if(auxiliarArray.contains(currentPlate)){
                counter++;
            }
        }
        
        return counter;
    }
    
    public int getQtyOfDrinks(Drink drink){
        int counter = 1;
        
        ArrayList<Drink> auxiliarArray = this.getListOfDrinks();
        Collections.sort(auxiliarArray);

        for (int i = 0; i < auxiliarArray.size(); i++) {
            Drink currentDrink = auxiliarArray.get(i);
            auxiliarArray.remove(currentDrink);
            i--;
            
            if(auxiliarArray.contains(currentDrink)){
                counter++;
            }
        }
        
        return counter;
    }
    
    public ArrayList<Plate> removeRepeatedPlates(ArrayList<Plate> listOfPlates){
        ArrayList<Plate> returnedArray = new ArrayList<>();
        ArrayList<Plate> auxiliarArray = (ArrayList<Plate>) this.getListOfPlates().clone();
        Collections.sort(auxiliarArray);

        for (int i = 0; i < auxiliarArray.size(); i++) {
            Plate currentPlate = auxiliarArray.get(i);
            auxiliarArray.remove(currentPlate);
            i--;
            
            if(!auxiliarArray.contains(currentPlate)){
                returnedArray.add(currentPlate);
            }
        }
        return returnedArray;
    }
    
    public ArrayList<Drink> removeRepeatedDrinks(ArrayList<Drink> listOfDrinks){
        ArrayList<Drink> returnedArray = new ArrayList<>();
        ArrayList<Drink> auxiliarArray = (ArrayList<Drink>) this.getListOfDrinks().clone();
        Collections.sort(auxiliarArray);
        
        for (int i = 0; i < auxiliarArray.size(); i++) {
            Drink currentDrink = auxiliarArray.get(i);
            auxiliarArray.remove(currentDrink);
            i--;

            if(!auxiliarArray.contains(currentDrink)){
                returnedArray.add(currentDrink);
            }
        }
        return returnedArray;
    }
    
    public HashMap<Plate,Integer> getPlatesAndQty(){
        HashMap<Plate,Integer> returnedHashmap = new HashMap<>();
        ArrayList<Plate> platesWithoutRepeated = this.removeRepeatedPlates(this.getListOfPlates());
        
        for (int i = 0; i < platesWithoutRepeated.size(); i++) {
            Plate currentPlate = platesWithoutRepeated.get(i);
            returnedHashmap.put(currentPlate, getQtyOfPlates(currentPlate));
        }
        
        return returnedHashmap;
    }
    
    public HashMap<Drink,Integer> getDrinksAndQty(){
        HashMap<Drink,Integer> returnedHashmap = new HashMap<>();
        ArrayList<Drink> drinksWithoutRepeated = this.removeRepeatedDrinks(this.getListOfDrinks());

        for (int i = 0; i < drinksWithoutRepeated.size(); i++) {
            Drink currentDrink = drinksWithoutRepeated.get(i);
            returnedHashmap.put(currentDrink, getQtyOfDrinks(currentDrink));
        }
        
        return returnedHashmap;
    }    

    @Override
    public String toString() {
        return " Mesa " + table.getNumber();
    }

    @Override
    public int compareTo(Object t) {
            return this.date.compareTo(((Order)t).getDate());
    }
    
}
