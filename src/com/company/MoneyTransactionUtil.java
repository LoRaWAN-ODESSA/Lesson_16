package com.company;

public class MoneyTransactionUtil {
    private String numSenderCard;
    private String numReceiverCard;
    private double sum;

    private MoneyTransactionUtil(String numSenderCard, String numReceiverCard, double sum) {
        this.numSenderCard = numSenderCard;
        this.numReceiverCard = numReceiverCard;
        this.sum = sum;
    }

    public static void sendTo(String numSenderCard, String numReceiverCard, double sum) throws AccountException, MoneyValueException {
        if(numSenderCard == numReceiverCard) {
            throw new AccountException();
        } else if(sum <= 0 || sum > 100_000.00) {
            throw new MoneyValueException();
        } else {
            System.out.println("Sum " + sum + " from card " + numSenderCard + " has been sent to card " + numReceiverCard + " successfully!");
        }
    }
}
