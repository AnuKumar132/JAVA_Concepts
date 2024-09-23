package org.overriding;

public class NewTax extends OldTax {
         @Override
        public void taxLimit(int tax) {
        	 System.out.println("New Tax Limit is "+tax);
        	super.taxLimit(250000);
        }
         public static void main(String[] args) {
     		NewTax a = new NewTax();
     		a.taxLimit(500000);
     	}
	}

