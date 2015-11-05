package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import bankInfo.Bank;

public class LinkedListBank {
	
	public static void main(String args[]) { 
		
		LinkedList<Bank> bankLinkedList = new LinkedList<Bank>();
		
		List<Bank> banksList = new ArrayList<Bank>();
		
		Bank bank = new Bank();
		bank.setBankName("Bank Of America");
		banksList.add(bank);
		
		bankLinkedList.add(bank);
		
		
		Bank bankTwo = new Bank();
		bankTwo.setBankName("Bank Of Danish");
		banksList.add(bankTwo);
		
		bankLinkedList.add(bankTwo);
		
		Bank bankThree = new Bank();
		bankThree.setBankName("Bank Of Rizwan");
		banksList.add(bankThree);
		
		bankLinkedList.add(bankThree);
		
		
		for(int i= 0 ; i < banksList.size(); i ++) { 
			System.out.println("*********************************");
			System.out.println(banksList.get(i).getBankName());
		}
		
		System.out.println("*********************************");
		
		Iterator it = bankLinkedList.descendingIterator();
		System.out.println("We are printing through LinkedList now");
		while(it.hasNext()) { 
			
			Bank bankObject = (Bank)it.next();
			System.out.println("*********************************");
			System.out.println(bankObject.getBankName());
			
		}
		
	}
	
	

}
