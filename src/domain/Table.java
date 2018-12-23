package domain;

/**
 * @author Marco Fiorito
 */
public class Table implements Comparable<Table>{
    private int number;

    public Table(int n) {
       this. number = n;
    }
    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int compareTo(Table t) {
        return this.getNumber() - t.getNumber();
    }
        
}
