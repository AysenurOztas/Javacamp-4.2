package interfaceAbstractDemo;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Adapters.MernisServiceAdapter;
import interfaceAbstractDemo.Concrete.NeroCustomerManager;
import interfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"Engin","Demiro�",1985,"28861499108"));
		customerManager.save(new Customer(2,"Ay�enur","�zta�",1993,"152354"));
		
		//not a valid person vermesi i�in tc kasten yanl�� girilmi�tir.
		

	}
	


}
