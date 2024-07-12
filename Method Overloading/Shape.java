

public class Shape {

    void draw(){
        System.out.println("drawing shape");
    }
    public void draw( String shapeName){
        System.out.println(" String type parameter called");

    }

    protected void draw( int side){
        System.out.println("integer type parameter called ");
    }

    private void draw(float f){
        System.out.println("float type parameter called");
    }


    public static void main(String[] args) {

        Shape shape= new Shape();
            shape.draw();;
            shape.draw(5);
            shape.draw("furkan");
            shape.draw(78.5f);
    }
}
