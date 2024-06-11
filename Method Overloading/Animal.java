
public class Animal{
    public void sound(){
        System.out.println("this is the Animal sound");
    }
}

class Lion extends Animal{
    public void sound(){
        System.out.println(" Lion Speak :Roar.");
    }
}

class Dog extends Animal{
    public void sound(){
        System.out.println(" Dog Speak  barks,");
    }
}

class Elephants extends Animal{
    public void sound(){
        System.out.println(" Elephant Speak rumbles");
    }
}

  class MainClass{

      public static void main(String[] args) {

          // create Lion Object
           Lion lion= new Lion();
           lion.sound();

           // create Elephants Object
           Elephants elephants= new Elephants();
           elephants.sound();

           // create Dog Object
           Dog dog= new Dog();
           dog.sound();

      }
  }

