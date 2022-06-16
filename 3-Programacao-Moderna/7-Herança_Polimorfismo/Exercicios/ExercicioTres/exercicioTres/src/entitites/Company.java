package entitites;

public final class Company extends TaxPayer {
    private Integer numberOfEmployees;

    public Company(){
    }

    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public final double tax(){
        double corporateTax = 0.16;
        if(numberOfEmployees > 10){
            corporateTax = 0.14;
        }
        return getAnualIncome() * corporateTax;
    }

}
