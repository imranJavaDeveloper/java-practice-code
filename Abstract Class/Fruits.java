public  abstract class Fruits {

    public abstract  void taste();
    
}
class Mango extends Fruits{

    @Override
    public void taste() {
        System.out.println("Sweet, juicy, and slightly tart or tangy");
    }
}

class PineApple extends Fruits{

    public void taste(){
        System.out.println("tropical, vibrant, and bright, with notes of citrus and apple");
    }

}


class Main {

    public static void main(String[] args) {


        Fruits obj= new Mango();
              obj.taste();

              obj=new PineApple();
              obj.taste();

    }
}


