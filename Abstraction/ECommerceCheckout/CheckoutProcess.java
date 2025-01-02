package Abstraction.ECommerceCheckout;

public abstract class CheckoutProcess {
    public abstract double calculateTax(Product product);
    public abstract double applyDiscount(double amount, double discountPercentage);
    public abstract double calculateShippingCost(double weight, String userType);
    public abstract Invoice generateInvoice(Product[] products);
} 