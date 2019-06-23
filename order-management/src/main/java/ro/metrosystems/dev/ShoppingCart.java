package ro.metrosystems.dev;

import java.math.BigDecimal;
import java.util.Objects;

public class ShoppingCart {
    private BigDecimal totalOrdered;
    private Long numberOfProducts;
    private String clientName;

    public ShoppingCart(final BigDecimal totalOrdered, final Long numberOfProducts, final String clientName) {
        this.totalOrdered = totalOrdered;
        this.numberOfProducts = numberOfProducts;
        this.clientName = clientName;
    }

    public BigDecimal getTotalOrdered() {
        return totalOrdered;
    }

    public void setTotalOrdered(final BigDecimal totalOrdered) {
        this.totalOrdered = totalOrdered;
    }

    public Long getNumberOfProducts() {
        return numberOfProducts;
    }

    public void setNumberOfProducts(final Long numberOfProducts) {
        this.numberOfProducts = numberOfProducts;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(final String clientName) {
        this.clientName = clientName;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final ShoppingCart that = (ShoppingCart) o;
        return Objects.equals(totalOrdered, that.totalOrdered) &&
                Objects.equals(numberOfProducts, that.numberOfProducts) &&
                Objects.equals(clientName, that.clientName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalOrdered, numberOfProducts, clientName);
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "totalOrdered=" + totalOrdered +
                ", numberOfProducts=" + numberOfProducts +
                ", clientName='" + clientName + '\'' +
                '}';
    }
}
