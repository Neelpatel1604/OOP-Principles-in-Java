package Abstraction.ECommerceCheckout;

public class Invoice {
    private Product[] products;
    private double totalAmount;

    public Invoice(Product[] products, double totalAmount) {
        this.products = products;
        this.totalAmount = totalAmount;
    }

    public double calculateTotal() {
        return totalAmount; // Return the total amount passed in the constructor
    }

    public String generateInvoiceDetails() {
        StringBuilder invoiceDetails = new StringBuilder();
        for (Product product : products) {
            invoiceDetails.append("Product Name: ").append(product.getName())
                          .append(", Quantity: ").append(product.getQuantity())
                          .append(", Price: ").append(product.getPrice()).append("\n");
        }
        invoiceDetails.append("Total Amount: ").append(totalAmount);
        return invoiceDetails.toString();
    }
} 