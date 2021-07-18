package interfaceAbstractDemo;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Adapters.MernisServiceAdapter;
import interfaceAbstractDemo.Concrete.NeroCustomerManager;
import interfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Engin","Demiroð",1985,"28861499108"));
		customerManager.save(new Customer(2,"Ayþenur","öztaþ",1993,"152354"));
		
		//not a valid person vermesi için tc kasten yanlýþ girilmiþtir.
		

	}
	


}
