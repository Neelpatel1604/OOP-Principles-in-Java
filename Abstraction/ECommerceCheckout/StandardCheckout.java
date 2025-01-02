package Abstraction.ECommerceCheckout;

public class StandardCheckout extends CheckoutProcess {
    
    @Override
    public double calculateTax(Product product) {
        return product.getPrice() * 0.05; // 5% tax
    }

    @Override
    public double applyDiscount(double amount, double discountPercentage) {
        if (amount > 500) {
            discountPercentage += 5; // Additional 5% discount for orders over $500
        }
        return amount - (amount * (discountPercentage / 100)); // Apply discount
    }

    @Override
    public double calculateShippingCost(double weight, String userType) {
        return weight * 5; // $5 per kg for standard users
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

        // Apply discount if subtotal exceeds $1000
        if (subtotal > 1000) {
            totalDiscount = subtotal * 0.10; // 10% discount
        }

        double discountedPrice = subtotal - totalDiscount; // Calculate discounted price
        totalTax = discountedPrice * 0.05; // 5% tax on discounted price
        double totalShipping = calculateShippingCost(totalWeight, "Standard"); // Calculate shipping cost

        // Update product prices based on the final calculations
        for (Product product : products) {
            product.setPrice(product.getPrice() * product.getQuantity()); // Set price as total for each product
        }

        return new Invoice(products, discountedPrice + totalTax + totalShipping); // Pass final total to Invoice
    }
} 