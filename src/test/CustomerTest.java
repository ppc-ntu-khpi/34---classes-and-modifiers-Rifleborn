package test;

import domain.Customer;

public class CustomerTest {
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		
                customer.setId(1);
                System.out.println(customer.getId());
                customer.setIsNew(true);
                System.out.println(customer.IsNew());
                customer.setTotal(1001);
                System.out.println( customer.getTotal());        
	}
}
