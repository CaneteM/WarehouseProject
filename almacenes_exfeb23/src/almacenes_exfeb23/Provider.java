package almacenes_exfeb23;

import java.util.ArrayList;


public class Provider {

    // Attributes for provider information
    protected String providerCode;
    protected String providerName;
    protected String address;
    protected String registrationDate;
    protected String phone;
    protected String email;

    // Constructor with all parameters
    public Provider(String code, String name, String address, String registrationDate, String phone, String email) {
        this.providerCode = code;
        this.providerName = name;
        this.address = address;
        this.registrationDate = registrationDate;
        this.phone = phone;
        this.email = email;
    }

    // Constructor with only name
    public Provider(String name) {
        this.providerName = name;
    }

    // Default constructor
    public Provider() {
        // Auto-generated constructor stub
    }

    // List to store articles
    ArrayList<Article> articlesList = new ArrayList<Article>();

    // Method to add an article to the provider
    public void addArticle(Article article) {
        this.articlesList.add(article);
    }

    // Method to remove an article by its code
    public void removeArticle(String code) {
        articlesList.removeIf(article -> article.getCode().equals(code));
    }

    // Overriding toString() to return the provider's name
    public String toString() {
        return getProviderName();
    }

    // Getters and setters for the provider attributes
    public String getProviderCode() {
        return providerCode;
    }

    public void setProviderCode(String providerCode) {
        this.providerCode = providerCode;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

