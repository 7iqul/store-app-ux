public class Order {
    private static int orderCounter = 1;
    private int orderId;
    private Cart cart;
    private double totalAmount;
    private String status;

    public Order(Cart cart) {
        this.orderId = orderCounter++;
        this.cart = cart;
        this.totalAmount = cart.calculateTotal();
        this.status = "Confirmed";
    }

    public void placeOrder() {
        System.out.println("\n===== ORDER CONFIRMED =====");
        System.out.println("Order ID: #" + orderId);
        System.out.println("Status: " + status);
        cart.displayCart();
        System.out.println("Total Amount: " + totalAmount + " SAR");
        System.out.println("===========================\n");
    }

    public int getOrderId() { return orderId; }
    public double getTotalAmount() { return totalAmount; }
    public String getStatus() { return status; }
}