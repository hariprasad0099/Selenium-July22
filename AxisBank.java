package org.assignment3;

public class AxisBank extends BankInfo {
	public void deposit() {
		System.out.println("Bank deposit is changed to Axis Bank");
	}
	
	public static void main(String[] args) {
		AxisBank banking = new AxisBank();
	     banking.deposit();
		
	}
	


}
