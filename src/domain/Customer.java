/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author User
 */
public class Customer {
    private int id = 1;
    private boolean isNew = true;
    private float total = 1000.0f;
    
    public void displayCustomerInfo(){
        System.out.println("Total purchases are: " + total);
    }
}
