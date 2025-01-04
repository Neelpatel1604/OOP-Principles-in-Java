package Abstraction.ECommerceCheckout;

public class StandardCheckout extends CheckoutProcess {
    @Override
    public double calculateTax(Product product) {
        return product.getPrice() * product.getQuantity() * 0.05;
    }

    @Override
    public double applyDiscount(double amount, double discountPercentage) {
        if (amount > 500) {
            discountPercentage += 5;
        }
        return amount * (1 - (discountPercentage / 100));
    }

    @Override
    public double calculateShippingCost(double weight, String userType) {
        return weight * 5;
    }

    @Override
    public Invoice generateInvoice(Product[] products) {
        double subtotal = 0;
        int totalQuantity = 0;

        for (Product product : products) {
            subtotal += product.getPrice() * product.getQuantity();
            totalQuantity += product.getQuantity();
        }

        double discountedPrice = subtotal * 0.90; // 10% discount
        double tax = discountedPrice * 0.05;
        double shipping = totalQuantity * 5;
        double total = discountedPrice + tax + shipping;

        return new Invoice(products, total);
    }

}