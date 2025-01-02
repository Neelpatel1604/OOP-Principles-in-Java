package Abstraction.ECommerceCheckout;

public class PrimeCheckout extends CheckoutProcess {
    private int purchaseCount = 0; // Track number of purchases

    @Override
    public double calculateTax(Product product) {
        return product.getPrice() * 0.03; // 3% tax for prime products
    }

    @Override
    public double applyDiscount(double amount, double discountPercentage) {
        purchaseCount++;
        if (purchaseCount > 5) {
            discountPercentage += 5; // Additional 5% discount for loyal customers
        }
        return amount - (amount * (discountPercentage / 100)); // Apply discount
    }

    @Override
    public double calculateShippingCost(double weight, String userType) {
        return 0; // Free shipping for prime users
    }

    @Override
    public Invoice generateInvoice(Product[] products) {
        double totalTax = 0;
        double totalDiscount = 0;
        double totalWeight = 0;
        double subtotal = 0;

        for (Product product : products) {
            subtotal += product.getPrice() * product.getQuantity(); // Calculate subtotal
            totalWeight += product.getQuantity(); // Assuming weight is equivalent to quantity
        }

        totalDiscount = subtotal * 0.20; // 20% discount for Prime users
        double discountedPrice = subtotal - totalDiscount; // Calculate discounted price
        totalTax = discountedPrice * 0.03; // 3% tax on discounted price
        double totalShipping = 0; // Free shipping for Prime users

        // Update product prices based on the final calculations
        for (Product product : products) {
            product.setPrice(product.getPrice() * product.getQuantity()); // Set price as total for each product
        }

        return new Invoice(products, discountedPrice + totalTax + totalShipping); // Pass final total to Invoice
    }
} 