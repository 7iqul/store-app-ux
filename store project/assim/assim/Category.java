import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products;

    public Category(String name) {
        this.name = name;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() { return products; }
    public String getName() { return name; }

    public void displayProducts() {
        System.out.println("=== Category: " + name + " ===");
        for (Product p : products) {
            System.out.println("  - " + p.getName() + " | " + p.getPrice() + " SAR");
        }
    }
}