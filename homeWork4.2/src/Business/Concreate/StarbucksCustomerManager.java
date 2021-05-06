package Business.Concreate;

import Business.Abstract.PersonCheckService;
import Entity.Concrate.Customer;
import core.concretes.BaseCustomerManager;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private PersonCheckService _personCheckService;
	
	
	public StarbucksCustomerManager(PersonCheckService _personCheckService) {
		this._personCheckService= _personCheckService;
	}
	
	public void Save(Customer customer) {
		if( _personCheckService.CheckIfRealPerson(customer)) {
		super.Save(customer);
		System.out.println("Starbucks.");
		}
		else {
			System.out.println("Not a valid person.");
		}


	}

}
