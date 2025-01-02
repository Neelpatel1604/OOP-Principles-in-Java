package Abstraction.ECommerceCheckout;

public abstract class ECommerceOperations {
    public abstract double calculateTax(double amount);
    public abstract double applyDiscount(double amount, double discountPercentage);
} 