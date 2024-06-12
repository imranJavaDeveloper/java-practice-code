
public class Shape {
    public double calculateArea(){
        return 0;
    }
}

class  Circle{
    /* Create a method for calculate Area Of the Circle */
    public double calculateArea( float rad){

         double area=3.14*rad*rad;
        System.out.println("Area of circle :"+area);
        return  0;
    }

}

class Rectangle{
   /* Create a method calculate Area of Rectangle */
    public double calculateArea(int width,int height){
      double area=height*width;
        System.out.println("Area of the Rectangle :"+area);
        return 0;
    }
}

class Triangle{
    /* Create a method calculate Area of Triangle */
    public double calculateArea(int base,int height){
        double area=0.5*base*height;
        System.out.println("Area of the triangle :"+area);
        return 0;
    }

}

class  MainClas{
    public static void main(String[] args) {

         // circle object
        Circle circle= new Circle();
        circle.calculateArea(5);

          // Rectangle object
        Rectangle rectangle= new Rectangle();
        rectangle.calculateArea(45,6);

          // Triangle object
        Triangle triangle= new Triangle();
        triangle.calculateArea(78,25);
    }
}