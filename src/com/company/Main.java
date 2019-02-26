package com.company;

public class Main {

    public static void main(String[] args) {
Bank bank = new Bank("American bank");

bank.addBranch("Wells Fargo");
bank.addCustomer("Wells Fargo,", "Will", 12.00);

bank.addBranch("Bank of America");
bank.addCustomer("Bank of America", "bob", 44.44);

bank.listCustomer("Wells Fargo", false);
    }
}
