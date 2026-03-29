import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Product product, int quantity) {
        product.setQuantity(quantity);
        items.add(product);
        System.out.println("Added: " + product.getName() + " x" + quantity);
    }

    public void removeItem(String productName) {
        items.removeIf(p -> p.getName().equals(productName));
        System.out.println("Removed: " + productName);
    }

    public double calculateTotal() {
        double total = 0;
        for (Product p : items) {
            total += p.calculateTotal();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("\n====== YOUR CART ======");
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }
        for (Product p : items) {
            System.out.println(p.toString() + " = " + p.calculateTotal() + " SAR");
        }
        System.out.println("----------------------");
        System.out.println("TOTAL: " + calculateTotal() + " SAR");
        System.out.println("======================\n");
    }

    public ArrayList<Product> getItems() { return items; }
}