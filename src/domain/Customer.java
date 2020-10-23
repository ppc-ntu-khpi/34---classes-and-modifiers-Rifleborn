
package domain;

public class Customer {
    private int id = 1;
    private boolean isNew = true;
    private float total = 1000.0f;
    
    public void displayCustomerInfo(){
        System.out.println("Total purchases are: " + total);
    }
}
