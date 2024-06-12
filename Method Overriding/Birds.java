public class Birds {
    public void birdsSound(){
        System.out.println("Birds  sound");
    }
}

 class Crows extends Birds {
    public void birdsSound(){
        System.out.println(" Crows Speak caw");
    }
}

class Eagles extends Birds {
    public void birdsSound(){
        System.out.println(" Eagles Speak scream");
    }
}

class Sparrow extends Birds {
    public void birdsSound(){
        System.out.println(" Sparrow Speak chirp");
    }
}

class Owls extends Birds {
    public void birdsSound(){
        System.out.println(" Owls Speak hoot");
    }
}

class Inner{
    public static void main(String[] args) {


        Crows crows= new Crows();
             crows.birdsSound();

        Eagles eagles= new Eagles();
        eagles.birdsSound();

        Sparrow sparrow= new Sparrow();
        sparrow.birdsSound();

        Owls owls= new Owls();
        owls.birdsSound();

    }
}
