package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import accountdb.BankingDatabase;
import bankInfo.Account;
import bankInfo.Customer;

public class HashMapSimple {
	
	
	public static void main(String args[]) { 
	
		HashMap<Integer,Customer> customerHashMap = new HashMap<Integer,Customer>();
		
		 List<Customer> allcustomers= BankingDatabase.getAllCustomerInfo();
		//                    7866    Rizwani
		 customerHashMap.put(7866,allcustomers.get(0));
		 //                  7890     Danish
		 customerHashMap.put(7890,allcustomers.get(1));
		
		
		 Customer customerX = customerHashMap.get(7890);
		 System.out.println("Customer name is "  + customerX.getName());
		 System.out.println("********************************************");
		 List<Account> accounts = customerX.getAccounts();
		 for(int accountIndex = 0 ; accountIndex < accounts.size() ; accountIndex ++) { 
			 
			 System.out.println(customerX.getName()+ " Has " +accounts.get(accountIndex).getAccountType());
			 System.out.println("********************************************");
			 System.out.println("Balance on this account is " +accounts.get(accountIndex).getBalance());
			 System.out.println("********************************************");
		 }
		 
		 System.out.println(customerX.getName()+ " Has " +accounts.get(1).getBalance());
		 System.out.println("********************************************");
		 
		 
		 
		/** 
		Set<Integer> keyset = customerHashMap.keySet();
		Iterator it = keyset.iterator();
		while(it.hasNext()) { 
			Customer customer = (Customer) customerHashMap.get(it.next());
			System.out.println("********************************************");
			System.out.println("Name of the customer is " +customer.getName());
			System.out.println("********************************************");
			System.out.println("Phone of the customer is " +customer.getPhone());
    
}
	**/				
		//System.out.println(studentHashMap.get(1));
		
		
	}

}
