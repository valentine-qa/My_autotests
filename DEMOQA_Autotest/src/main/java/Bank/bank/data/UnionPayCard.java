package Bank.bank.data;

public class UnionPayCard extends Card {

    public UnionPayCard() {
        super(PaymentSystem.UNION_PAY);
    }

    @Override
    public void payInCountry(Country country, int amount) {

    }
    public boolean isCountryValidForTheseCard(Country country) {
        if (country == Country.CN)
            return true;
        else
            return false;
    }
}
