package entities;

public class Snack {

    private int productCode;
    private int quantity;

    public Snack(int productCode, int quantity) {
        this.productCode = productCode;
        this.quantity = quantity;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double totalValue() {

        if (getProductCode() == 1) {
           return getQuantity() * 4.00;
        }
        else if (getProductCode() == 2) {
            return getQuantity() * 4.50;
        }
        else if (getProductCode() == 3.00) {
            return getQuantity() * 5.00;
        }
        else if (getProductCode() == 4) {
            return getQuantity() * 2.00;
        }
        else {
            return getQuantity() * 1.50;
        }
    }
}
