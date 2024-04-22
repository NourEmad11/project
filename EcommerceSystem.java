
package assiment;
import java.util.Scanner;
public class EcommerceSystem {
 
   public static void main(String[] args) {
        
    Scanner input=new Scanner(System.in);
    ElectronicProduct e1 = new ElectronicProduct(1,"smartphone",599.9,"samsung",2);
    ClothingProduct c1 = new ClothingProduct(2,"Tshirt",19.99,"medium","cotton");
    BookProduct b1 = new  BookProduct(3, "OOP",39.99,"OReilly","X Publications");
    
         System.out.println("Welcome to the E-commerce System!");
         System.out.println("Enter your Id");
         int Id = input.nextInt();
         System.out.println("Enter your name");
         String name = input.next();
         System.out.println("Enter your address");
         String address= input.next();
         Customer customer1= new Customer(Id,name,address);
         System.out.println("How many products do you want?");
         int nProducts= input.nextInt();
         Cart cart=new Cart(Id,nProducts);
         for(int i=0;i<nProducts;i++){
             System.out.println("which products you want to add to your cart ?");
             System.out.println("1-smartphone"+"\n2-Tshirt"+"\n3-OOP");
             int number=input.nextInt();
             switch(number){
                 case 1:
                     cart.addProduct(e1);
                     System.out.println("--------------------------------------------------");
                     break;
                 case 2:
                     cart.addProduct(c1);
                      System.out.println("--------------------------------------------------");
                     break;
                 case 3:
                     cart.addProduct(b1);
                      System.out.println("--------------------------------------------------");
                     break;
                 default:
                     System.out.println("the number is invalid");
                     
             }
         }
         System.out.println("Your total is : "+cart.calculatePrice());
         System.out.println("would you like to place your order"+ "\n1- Yes  2- No");
         int order= input.nextInt();
        
         int orderId=0;
         switch(order){
             case 1:
                 cart.place_order(orderId);
                  System.out.println("--------------------------------------------------");
                 orderId ++;
                 break;
                 case 2:
                     break;
                 default:
                     System.out.println("the number is invalid");
         }
        Order o1 = new Order(Id,orderId,cart.getProducts());
        System.out.println("Here is a summary of your order : ");
        o1.printOrderInfo();
     }  
}

    
    
