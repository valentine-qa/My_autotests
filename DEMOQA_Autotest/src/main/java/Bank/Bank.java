package Bank;

import Bank.bank.data.Card;
import Bank.bank.data.MasterCard;
import Bank.bank.data.VisaCard;

public class Bank {

    public static void main(String[] args) {
        Card masterCard = new MasterCard();
        masterCard.setBalance(100);
        System.out.println(masterCard.getPaymentSystem());


    }
}
