package core.abstracts;
import java.util.Date;


import java.rmi.RemoteException;

import Business.Abstract.PersonCheckService;
import Entity.Concrate.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService{

	
	@SuppressWarnings("deprecation")
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		KPSPublicSoap soapclient = new KPSPublicSoapProxy();
		boolean result = false;
		try {
			  result = soapclient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		
		return result;
	}

}
