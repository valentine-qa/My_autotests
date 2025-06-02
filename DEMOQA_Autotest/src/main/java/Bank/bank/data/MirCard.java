package Bank.bank.data;

public class MirCard extends Card {

    public MirCard() {
        super(PaymentSystem.MIR);
    }

    @Override
    public void payInCountry(Country country, int amount) {

    }

    public boolean isCountryValidForTheseCard(Country country) {
        if (country == Country.RU)
            return true;
        else
            return false;
    }
}
