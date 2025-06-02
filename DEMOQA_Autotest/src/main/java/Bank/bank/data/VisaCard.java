package Bank.bank.data;

public class VisaCard extends Card {


    public VisaCard() {
        super(PaymentSystem.VISA);
    }

    @Override
    public void payInCountry(Country country, int amount) {

    }

    public boolean isCountryValidForTheseCard(Country country) {
        return true;
    }
}
