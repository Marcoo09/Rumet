package domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author Marco Fiorito
 */
public class Order implements Serializable, Comparable{
    
    private ArrayList<Plate> listOfPlates;
    private ArrayList<Drink> listOfDrinks;
    private Date date;
    private float discount;
    private float total;
    private Table table;
    
    public Order(ArrayList<Plate> listOfPlates, ArrayList<Drink> listOfDrinks, float discount, Table t) {
        this.listOfPlates = listOfPlates;
        this.listOfDrinks = listOfDrinks;
        this.discount = discount;
        this.table = t;
        this.date = new Date();
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

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
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
