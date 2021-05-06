package Business.Abstract;

import Entity.Concrate.Customer;

public interface PersonCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
