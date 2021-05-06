import Business.Concreate.NeroCustomerManager;
import java.util.Date;
import Business.Concreate.StarbucksCustomerManager;
import Entity.Concrate.Customer;
import core.abstracts.PersonCheckManager;
import core.concretes.BaseCustomerManager;
import java.time.LocalDate;
public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1,"Bilgehan","Buyukakyuz",new Date(2011,14,11),"123123123123");
		Customer customer2 = new Customer(2,"Engin","Demirog",new Date(1985,1,1985),"123123123123");
		
		
		BaseCustomerManager starbucksCustomer = new StarbucksCustomerManager(new PersonCheckManager());
		starbucksCustomer.Save(customer1);
		BaseCustomerManager neroCustomer = new NeroCustomerManager(new PersonCheckManager());
		neroCustomer.Save(customer2);

	}

}
