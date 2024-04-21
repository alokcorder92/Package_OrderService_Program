package service;
import inventory.Product;
public class OrderService extends Product{
    public static void main(String[] ar){
        //default property access[compilation error]
            //Product p = new Product();
            //p.productId=1;
            //System.out.println("Product id:"+p.productId);
        //Protected example[by extending the class]
           OrderService service=new OrderService();
           service.productName="Laptop";
           System.out.println("Product Name="+service.productName);
        //public access example
            Product p = new Product();
            p.description="This is laptop description";
            System.out.println("Product id:"+p.description);
        
    }
}