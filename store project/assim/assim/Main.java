public class Main {
    public static void main(String[] args) {

        // Create Categories
        Category electronics = new Category("Electronics");
        Category clothing = new Category("Clothing");
        Category food = new Category("Food");

        // Create Products
        Product phone = new Product("iPhone 15", 3999.99, "Electronics");
        Product laptop = new Product("MacBook Air", 5499.99, "Electronics");
        Product tshirt = new Product("T-Shirt", 89.99, "Clothing");
        Product jeans = new Product("Jeans", 199.99, "Clothing");
        Product coffee = new Product("Coffee Bag", 49.99, "Food");
        Product chocolate = new Product("Chocolate", 24.99, "Food");

        // Add Products to Categories
        electronics.addProduct(phone);
        electronics.addProduct(laptop);
        clothing.addProduct(tshirt);
        clothing.addProduct(jeans);
        food.addProduct(coffee);
        food.addProduct(chocolate);

        // Display Catalog
        System.out.println("====== STORE CATALOG ======");
        electronics.displayProducts();
        clothing.displayProducts();
        food.displayProducts();
        System.out.println("===========================\n");

        // Add to Cart
        Cart myCart = new Cart();
        myCart.addItem(phone, 1);
        myCart.addItem(tshirt, 2);
        myCart.addItem(coffee, 3);

        // Display Cart
        myCart.displayCart();

        // Place Order
        Order myOrder = new Order(myCart);
        myOrder.placeOrder();
    }
}