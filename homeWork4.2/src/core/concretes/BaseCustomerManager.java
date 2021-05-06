package core.concretes;

import Entity.Concrate.Customer;
import core.abstracts.CustomerService;

public class BaseCustomerManager implements CustomerService{

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to DB: " + customer.getFirstName() );
		
	}

}
