
public class Mobile {

    // create instance
       private String productName;
       private String productBrand;
       private String color;
       private int price;

       // constructor

    public Mobile(String productName,String productBrand,String color,int price) {
        this.productName = productName;
        this.productBrand=productBrand;
        this.color=color;
        this.price=price;
    }
    // create show method
    public void show(){
        System.out.println("Product Brand :"+productBrand);
        System.out.println("Product Name :"+productName);
        System.out.println("Product color :"+color);
        System.out.println("Product Price :"+price);
    }


    public static void main(String[] args) {

        Mobile obj= new Mobile("Redmi Note 11t 5g","Mi","Black_color",20000);
         obj.show();
        System.out.println("=============================================");

        Mobile obj2= new Mobile("Redmi Note 7","Mi","Blue_color",12000);
        obj.show();
        System.out.println("==============================================");

        Mobile obj3= new Mobile("Redmi Note 8","Mi","Golden_color",20000);
        obj.show();

    }

}
