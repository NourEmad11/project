package assiment;
public class Cart {
   int customerId;
   int nproducts;
   int i=0;
   Product[]products;
    private double totalPrice;

    public Cart(int customerId, int nproducts) {
        this.customerId = Math.abs(customerId) ;
        this.nproducts = Math.abs(nproducts);
        this.products = new Product[nproducts];
        
    }
    
    

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
      
           this.customerId = Math.abs(customerId);
    }

    public int getNproducts() {
        return nproducts;
    }

    public void setNproducts(int nproducts) {
       
            this.nproducts = Math.abs(nproducts); 
    }

    public Product[] getProducts() {
        return products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }
   public void addProduct(Product product){
      
       products[i]=product;
       i++;
           
   }
   
   public void removeProduct(Product product){
        for(int i=0; i< products.length;i++){
            if(products[i]!= null && products[i].equals(product)){
                products[i]=null;
            return;
            }
        }
        System.out.println("Cannot find this product");
       
   }
   public double calculatePrice(){
       double totalPrice =0;
       for(int i=0; i<nproducts ;i++){
          
               totalPrice+= products[i].getPrice();
              
           }
              
       
         return totalPrice;
   }
   public Order place_order(int orderId){
       if(products.length == 0){
           System.out.println("The cart is empty");
           return null;
       }
       Order order=new Order(customerId ,orderId,products);     
       return order;  
   }
}
