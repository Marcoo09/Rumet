package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
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

    @Override
    public String toString() {
        return " Mesa " + table + " Hora: " + date.toString();
    }

    @Override
    public int compareTo(Object t) {
            return this.date.compareTo(((Order)t).getDate());
    }
    
}
