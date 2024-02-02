
public interface Animal {

    void makeSound();
    void eat();   
}

class Elephent implements Animal{

    @Override
    public void makeSound() {
        System.out.println(" elephent speak");
        System.out.println("growls,");
    }

    @Override
    public void eat() {
        System.out.println("elephent eat ");
        System.out.println("grasses, leaves, shrubs, fruits and roots");
    }
}
class Hen implements Animal{

    @Override
    public void makeSound() {
        System.out.println(" hen speak");
        System.out.println(" kow kow");
    }

    @Override
    public void eat() {
        System.out.println(" hen eat");
        System.out.println(" anything and everything");
    }

}
class MainInterface{
    public static void main(String[] args) {
       Animal obj= new Elephent();
          obj.eat();
          obj.makeSound();
       Animal obj2=new Hen();
          obj2.makeSound();
          obj2.eat();
    }
} 
