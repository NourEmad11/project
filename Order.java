package assiment;
import assiment.Product;
public class Order {
     int customerId;
     int orderId;
     double totalPrice;
     Product[]products;

    public Order(int customerId, int orderId,  Product[] products) {
        this.customerId = Math.abs(customerId);
        this.orderId = Math.abs(orderId);
        this.products = products;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
    public double calculateTotalPrice(){
        double totalPrice=0;
        for(int i=0;i<products.length;i++){
            totalPrice += products[i].getPrice();
          
        }
         return totalPrice;
        }
    public void productInfo(Product[] p){
        for(int i=0;i<products.length;i++){
           System.out.println("Product [" + (i+1) + "] Name : "+ p[i].getName() + "\n" + "Product [" + (i+1) + "] Price : "+ p[i].getPrice() + "\n");
       }
    }
   public void printOrderInfo(){
       System.out.println("The Order Id : " + orderId);
       System.out.println("The Customer Id : " + customerId);
       productInfo(products);
       
       double price = calculateTotalPrice();
       System.out.println("Total price: "+ price );
       
       
       
   }
     

}