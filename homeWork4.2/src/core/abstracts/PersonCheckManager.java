package core.abstracts;

import Business.Abstract.PersonCheckService;
import Entity.Concrate.Customer;

public class PersonCheckManager implements PersonCheckService{

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}

}
