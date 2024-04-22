package assiment;
public class ClothingProduct extends Product{
   private String size;
   private String fabric;

    public ClothingProduct(int productId, String name, double price ,String size, String fabric) {
        super(productId,name,price);
        this.size = size;
        this.fabric = fabric;
    }

   
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    
}
