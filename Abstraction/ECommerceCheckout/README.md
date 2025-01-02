# E-Commerce Checkout System

## Project Overview
This project demonstrates an E-Commerce Checkout System that utilizes abstraction to manage various checkout processes, including standard and prime checkouts. It showcases the principles of Object-Oriented Programming (OOP) through the use of abstract classes and concrete implementations.

### Class Descriptions

1. **ECommerceOperations.java**
   - This abstract class defines methods for e-commerce operations.
   - **Methods**:
     - `calculateTax(double amount)`: Calculates the tax for a given amount.
     - `applyDiscount(double amount, double discountPercentage)`: Applies a discount to a given amount.

2. **Product.java**
   - This class represents a product in the e-commerce system.
   - **Attributes**:
     - `name`: The name of the product.
     - `category`: The category of the product.
     - `price`: The price of the product.
     - `quantity`: The quantity of the product.
   - **Methods**:
     - Getters and setters for each attribute.

3. **Invoice.java**
   - This class represents an invoice for a purchase.
   - **Attributes**:
     - `products`: An array of products included in the invoice.
     - `totalAmount`: The total amount for the invoice.
   - **Methods**:
     - `calculateTotal()`: Returns the total amount.
     - `generateInvoiceDetails()`: Generates a detailed string representation of the invoice.

4. **CheckoutProcess.java**
   - This abstract class defines methods for the checkout process.
   - **Methods**:
     - `calculateTax(Product product)`: Calculates the tax for a given product.
     - `applyDiscount(double amount, double discountPercentage)`: Applies a discount to a given amount.
     - `calculateShippingCost(double weight, String userType)`: Calculates the shipping cost based on weight and user type.
     - `generateInvoice(Product[] products)`: Generates an invoice for the given products.

5. **StandardCheckout.java**
   - This class extends the `CheckoutProcess` abstract class, providing specific implementations for standard checkout.
   - **Functionality**:
     - Implements methods to calculate tax, apply discounts, calculate shipping costs, and generate invoices for standard users.

6. **PrimeCheckout.java**
   - This class extends the `CheckoutProcess` abstract class, providing specific implementations for prime checkout.
   - **Functionality**:
     - Implements methods to calculate tax, apply discounts, calculate shipping costs, and generate invoices for prime users.

7. **Start.java**
   - This is the main class that runs the application. It creates instances of `Product`, `StandardCheckout`, and `PrimeCheckout`, performs various actions, and demonstrates the functionalities.
   - **Functionality**:
     - Instantiate product objects.
     - Perform actions like calculating tax, applying discounts, and generating invoices for both standard and prime checkouts.

### How to Run
1. Compile all Java files in the `Abstraction/ECommerceCheckout` directory.
2. Run the `Start` class to execute the program.

### Example Output
When you run the program, it will display the following actions performed by the e-commerce checkout system:
- Tax and discounted price calculations for standard checkout.
- Invoice details for standard checkout.
- Tax and discounted price calculations for prime checkout.
- Invoice details for prime checkout. 