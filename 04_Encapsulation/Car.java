

import java.util.PrimitiveIterator;

public class Car {

    // Instance variable

    private String brand;
    private String model;
    private String color;
    private String price;
    private String speed;

    // constructor
    public void setCar(String brand,String model,String color,String price,String peed){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.color=color;
        this.speed=speed;
    }
    // create show method
    public void show(){
        System.out.println("Brand :"+brand);
        System.out.println("Model :"+model);
        System.out.println("price :"+price);
        System.out.println("color :"+price);
        System.out.println(" Speed :"+speed);
    }

    public static void main(String[] args) {

        // create object
        Car obj= new Car();
        obj.setCar("Lamborghini","350 GT","Huracán_Color","3.54 Crore","212 mph");
        obj.show();

        System.out.println("thank you");
    }

}
