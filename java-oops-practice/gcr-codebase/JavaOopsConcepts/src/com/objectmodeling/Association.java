package com.objectmodeling;

public class Association {

	public static void main(String[] args) {
        // Creating banks and customers
        Bank sbi = new Bank("SBI Bank");
        Bank hdfc = new Bank("HDFC Bank");

        Customer shruti = new Customer("Shruti");
        Customer arjun = new Customer("Arjun");

        // Open accounts and perform transactions
        Account acc1 = sbi.openAccount(shruti);
        Account acc2 = hdfc.openAccount(shruti);
        Account acc3 = sbi.openAccount(arjun);

        acc1.deposit(5000);
        acc2.deposit(3000);
        acc3.deposit(7000);

        // View balances
        shruti.viewBalance();
        arjun.viewBalance();
    }

}
