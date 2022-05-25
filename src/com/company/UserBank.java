package com.company;

public class UserBank {
    public static void main(String[] args) {
        try {
            MoneyTransactionUtil.sendTo("5458697087654433", "5458697087654433", 25000.00);
        } catch (AccountException e) {
            System.out.println("Error with bank account details. Perhaps the card number of the sender and recipient are the same!");
        } catch (MoneyValueException e) {
            System.out.println("Error with the amount sent. The amount must be greater than 0. The amount must not exceed the limit of 100 000$!");
        }

    }
}
