package com.amina.test1;

public class BankInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HDFCBank hdfc = new HDFCBank();
		hdfc.HDFCBankBalance();
		hdfc.Credit();
		hdfc.Debit();
		hdfc.getROI();
		hdfc.HDFCBankBalance();
		
		Citibank citi = new Citibank();
		citi.getCitiBankBalance();
		citi.Credit();
		citi.Debit();
		citi.getROI();
		citi.getCitiBankBalance();
		
		// when we point the class to interface
		Bank b = new HDFCBank();
		b.Credit();
		b.Debit();
		b.getROI();
		
		b = new Citibank();
		b.Credit();
		b.Debit();
		b.getROI();
		

	}

}
