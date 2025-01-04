package Abstraction.ECommerceCheckout;

public class PrimeCheckout extends CheckoutProcess {
    private int purchaseCount = 0;

    @Override
    public double calculateTax(Product product) {
        return product.getPrice() * product.getQuantity() * 0.03;
    }

    @Override
    public double applyDiscount(double amount, double discountPercentage) {
        purchaseCount++;
        if (purchaseCount > 5) {
            discountPercentage += 5;
        }
        return amount * (1 - (discountPercentage / 100));
    }

    @Override
    public double calculateShippingCost(double weight, String userType) {
        return 0;
    }

    @Override
    public Invoice generateInvoice(Product[] products) {
        double subtotal = 0;
        int totalQuantity = 0;

        for (Product product : products) {
            subtotal += product.getPrice() * product.getQuantity();
            totalQuantity += product.getQuantity();
        }

        double discountedPrice = subtotal * 0.80; // 20% discount
        double tax = discountedPrice * 0.03;
        double total = discountedPrice + tax;

        return new Invoice(products, total);
    }
}
