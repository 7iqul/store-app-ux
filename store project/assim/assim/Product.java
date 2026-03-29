public class Product {
    private String name;
    private double price;
    private String category;
    private int quantity;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
        this.quantity = 0;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public String getCategory() { return category; }
    public int getQuantity() { return quantity; }
    public void setQuantity(int quantity) { this.quantity = quantity; }

    public double calculateTotal() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return "Product: " + name + " | Price: " + price + " SAR | Qty: " + quantity;
    }
}