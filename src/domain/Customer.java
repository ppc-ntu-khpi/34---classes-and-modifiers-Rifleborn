package domain;


public class Customer {
    private int id;
    private boolean isNew;
    private float total;
    
    // конструктор
    public Customer(){
        this.id = 1;
        this.isNew = true;
        this.total = 1000.0f;
    }
    
    //методи
    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id > 0) this.id = id;
    }

    public boolean IsNew() {
        return isNew;
    }

    public void setIsNew(boolean isNew) {
        this.isNew = isNew;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        if (total > 0) this.total = total;
    }
    
    // 1 завдання
    public void displayCustomerInfo(){
        System.out.println("ID: " + this.id);
        System.out.println("Status: " + this.isNew );
        System.out.println("Total purchases are: " + this.total);
    } 
}
