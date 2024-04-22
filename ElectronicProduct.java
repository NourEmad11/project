package assiment;
public class ElectronicProduct extends Product{
   private String brand;
   private int warrantyPeriod;

    public ElectronicProduct( int productId, String name, double price,String brand, int warrantyPeriod) {
        super(productId,name,price);
        this.brand = brand;
        this.warrantyPeriod = Math.abs( warrantyPeriod);
    }
   

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWarrantyPeriod() {
        return warrantyPeriod;
    }

    public void setWarrantyPeriod(int warrantyPeriod) {
        
             this.warrantyPeriod = Math.abs(warrantyPeriod);
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
