package almacenes_exfeb23;



public class Sales extends Article {

    // Attributes related to the sale
    public float price;
    public String date;
    public int taxPercentage;
    public float total;
    public String code;
    public String name;

    // Default constructor
    public Sales() {
        super();
    }

    // Getter and setter for price
    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    // Getter and setter for date
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Getter and setter for taxPercentage (IVA)
    public int getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(int taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    // Getter and setter for total
    public float getTotal() {
        return total;
    }

    // This method calculates the total price including tax (IVA)
    public void setTotal(float priceWithoutTax) {
        float taxMultiplier = 1 + (taxPercentage / 100.0f);  // Convert percentage to a multiplier
        this.total = priceWithoutTax * taxMultiplier;
    }

    // Overriding toString() to display sale details
    public String toString() {
        return "Price: " + price + ", Total: " + total + ", " + super.toString();
    }
}
