package data;

import com.fasterxml.jackson.annotation.JsonInclude;

public class Gift {
    private String productName;
    private Double price;
    private String category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer quantity;

    public Gift(final String productName, final Double price, final String category) {
        this.productName = productName;
        this.price = price;
        this.category = category;
    }

    public Gift() {

    }

    /**
     * metoda pentru scadearea stocului unui produs
     * @return
     */
    public Integer decQuantity() {
        return quantity--;
    }

    /**
     * getter pentru productName in care se retine numele cadoului
     * @return
     */
    public String getProductName() {
        return productName;
    }

    /**
     * setter pentru productName in care se retine numele cadoului
     * @param productName
     */
    public void setProductName(final String productName) {
        this.productName = productName;
    }

    /**
     * getter pentru price in care se retine pretul cadoului
     * @return
     */
    public Double getPrice() {
        return price;
    }

    /**
     * setter pentru price in care se retine pretul cadoului
     * @param price
     */
    public void setPrice(final Double price) {
        this.price = price;
    }

    /**
     * getter pentru category in care se retine categoria din care face parte cadoul
     * @return
     */
    public String getCategory() {
        return category;
    }

    /**
     * setter pentru category in care se retine categoria din care face parte cadoul
     * @param category
     */
    public void setCategory(final String category) {
        this.category = category;
    }

    /**
     * getter pentru quantity in care se retine cantitatea in care se afla un produs in stoc
     * @return
     */
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * setter pentru quantity in care se retine cantitatea in care se afla un produs in stoc
     * @param quantity
     */
    public void setQuantity(final Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Metoda toString pentru afisarea continutului clasei Gift
     * @return
     */
    @Override
    public String toString() {
        return "Gift{"
                + "productName='" + productName + '\''
                + ", price=" + price
                + ", quantity=" + quantity + '\''
                + ", category='" + category + '\''
                + '}';
    }
}
