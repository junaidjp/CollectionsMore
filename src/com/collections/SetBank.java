package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import bankInfo.Bank;

public class SetBank {
	
	
	public static void main(String args[]){
	     
		
		Set bankSet = new HashSet();
		
		
		Bank bank = new Bank();
		bank.setBankName("Bank Of America");
		
		
		
		
		Bank bankTwo = new Bank();
		bankTwo.setBankName("Bank Of Danish");
		
		
	
		
		
		
		
		
		Bank bankThree = new Bank();
		bankThree.setBankName("Bank Of Rizwan");
		
		
		
		bankThree = new Bank();
		bankThree.setBankName("Bank Of Ziauddin");
		
		bankSet.add(bank);
		bankSet.add(bankTwo);
		bankSet.add(bankThree);
		bankSet.add(bankThree);
		
		
		
		
		
		// Iterating over the elements in the set
				Iterator<Bank> it = bankSet.iterator();
				while (it.hasNext()) {
				    // Get element
				    Bank bankElement = it.next();
				   System.out.println(bankElement.getBankName());
				 
				    
				}
			
		}
	
	

}
