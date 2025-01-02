package Abstraction.ECommerceCheckout;

public class Start {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("Laptop", "Electronics", 1200.00, 1);
        Product product2 = new Product("Book", "Books", 20.00, 2);
        Product[] products = {product1, product2};

        // Standard Checkout
        CheckoutProcess standardCheckout = new StandardCheckout();
        double standardTax = standardCheckout.calculateTax(product1);
        double standardDiscount = standardCheckout.applyDiscount(1200.00, 10); // 10% discount
        double standardShipping = standardCheckout.calculateShippingCost(5, "Standard");
        Invoice standardInvoice = standardCheckout.generateInvoice(products);

        System.out.println("Standard Checkout:");
        System.out.println("Tax: $" + standardTax);
        System.out.println("Discounted Price: $" + standardDiscount);
        System.out.println("Shipping Cost: $" + standardShipping);
        System.out.println("Total Amount: $" + standardInvoice.calculateTotal());
        System.out.println(standardInvoice.generateInvoiceDetails());

        // Prime Checkout
        CheckoutProcess primeCheckout = new PrimeCheckout();
        double primeTax = primeCheckout.calculateTax(product1);
        double primeDiscount = primeCheckout.applyDiscount(1200.00, 15); // 15% discount
        double primeShipping = primeCheckout.calculateShippingCost(5, "Prime");
        Invoice primeInvoice = primeCheckout.generateInvoice(products);

        System.out.println("\nPrime Checkout:");
        System.out.println("Tax: $" + primeTax);
        System.out.println("Discounted Price: $" + primeDiscount);
        System.out.println("Shipping Cost: $" + primeShipping);
        System.out.println("Total Amount: $" + primeInvoice.calculateTotal());
        System.out.println(primeInvoice.generateInvoiceDetails());
    }
}
