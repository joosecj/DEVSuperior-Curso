package entities;

public class Sale {
    private Integer month;
    private Integer year;
    private String seller;
    private Integer items;
    private Double total;

    public Sale() {
        super();
    }

    public Sale(Integer month, Integer year, String seller, Integer items, Double total) {
        super();
        this.month = month;
        this.year = year;
        this.seller = seller;
        this.items = items;
        this.total = total;
    }

    public Integer getMonth() {
        return month;
    }

    public void setMonth(Integer month) {
        this.month = month;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Integer getItems() {
        return items;
    }

    public void setItems(Integer items) {
        this.items = items;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Double averagePrice(){
        return this.total / this.items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Sale sale = (Sale) o;

        if (month != null ? !month.equals(sale.month) : sale.month != null) return false;
        if (year != null ? !year.equals(sale.year) : sale.year != null) return false;
        if (seller != null ? !seller.equals(sale.seller) : sale.seller != null) return false;
        if (items != null ? !items.equals(sale.items) : sale.items != null) return false;
        return total != null ? total.equals(sale.total) : sale.total == null;
    }

    @Override
    public int hashCode() {
        int result = month != null ? month.hashCode() : 0;
        result = 31 * result + (year != null ? year.hashCode() : 0);
        result = 31 * result + (seller != null ? seller.hashCode() : 0);
        result = 31 * result + (items != null ? items.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        return result;
    }
}
