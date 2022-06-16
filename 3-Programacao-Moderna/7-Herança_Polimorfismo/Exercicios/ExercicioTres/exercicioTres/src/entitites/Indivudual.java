package entitites;

public final class Indivudual extends TaxPayer {
    private Double heathExpenditures;

    public Indivudual(){
    }

    public Indivudual(String name, Double anualIncome, Double heathExpenditures) {
        super(name, anualIncome);
        this.heathExpenditures = heathExpenditures;
    }

    public Double getHeathExpenditures() {
        return heathExpenditures;
    }

    public void setHeathExpenditures(Double heathExpenditures) {
        this.heathExpenditures = heathExpenditures;
    }

    @Override
    public double tax(){
        double taxRate = 0.0;
        if (getAnualIncome() <= 20000.00)
            taxRate = 0.15;
        else{
            taxRate = 0.25;
        }
        return getAnualIncome() * tax();
    }

}
