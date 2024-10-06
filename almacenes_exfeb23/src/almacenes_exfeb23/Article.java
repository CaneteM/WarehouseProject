package almacenes_exfeb23;

import java.util.ArrayList;

public class Article extends Provider {

    /*
     * Stores the article code, name, description, sale price, applied tax (IVA),
     * provider of the article, and number of available units.
     */

    protected String code;
    protected String name;
    protected String description;
    protected float salePrice;
    protected int tax;
    protected int unitsAvailable;
    boolean isAvailable = true;

    protected Provider provider;

    // Constructor with provider
    public Article(String code, String name, String description, float salePrice, int tax, int unitsAvailable,
            Provider provider) {
        super();
        this.code = code;
        this.name = name;
        this.description = description;
        this.salePrice = salePrice;
        this.tax = tax;
        this.unitsAvailable = unitsAvailable;
        this.provider = provider;
    }

    // Constructor without provider
    public Article(String code, String name, String description, float salePrice, int tax, int unitsAvailable) {
        this.code = code;
        this.name = name;
        this.description = description;
        this.salePrice = salePrice;
        this.tax = tax;
        this.unitsAvailable = unitsAvailable;
    }

    // Default constructor
    public Article() {
        // Auto-generated constructor stub
    }

    // List to store providers
    ArrayList<Provider> providersList = new ArrayList<Provider>();

    // Getters and setters for the article attributes
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(float salePrice) {
        this.salePrice = salePrice;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getUnitsAvailable() {
        return unitsAvailable;
    }

    public void setUnitsAvailable(int unitsAvailable) {
        this.unitsAvailable = unitsAvailable;
    }

    // Method to check if a provider exists for an article
    @SuppressWarnings("unlikely-arg-type")
    public boolean isProviderAvailable(int code, Provider provider) {
        if (providersList.contains(provider.getProviderName())) {
            this.providersList.add(code, provider);
            return isAvailable;
        } else {
            isAvailable = false;
            return isAvailable;
        }
    }

    // Method to add a provider
    public void addProvider(Provider provider) {
        this.providersList.add(provider);
    }

    // Method to remove a provider by code
    public void removeProvider(String code) {
        providersList.removeIf(provider -> provider.getProviderCode().equals(code));
    }

    // Overriding toString() method to display article details
    public String toString() {
        return code + " " + name + " " + salePrice + " ";
    }
}
