package Abstraction.ECommerceCheckout;

public class Start {
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", "Electronics", 1200.00, 1);
        Product product2 = new Product("Book", "Books", 20.00, 2);
        Product[] products = {product1, product2};
    
        
        CheckoutProcess standardCheckout = new StandardCheckout();
        Invoice standardInvoice = standardCheckout.generateInvoice(products);
    
        System.out.println("Standard Checkout:");
        System.out.println(standardInvoice.generateInvoiceDetails());
    

        CheckoutProcess primeCheckout = new PrimeCheckout();
        Invoice primeInvoice = primeCheckout.generateInvoice(products);
    
        System.out.println("\nPrime Checkout:");
        System.out.println(primeInvoice.generateInvoiceDetails());
    }
}
