package assiment;
public class BookProduct extends Product {
   private String author ;
   private String publisher;

    public BookProduct(int productId, String name, double price ,String author, String publisher) {
        super(productId,name,price);
        this.author = author;
        this.publisher = publisher;
    }
   
   

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
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
