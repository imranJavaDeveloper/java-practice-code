
public class Animal {

    // create a method 
    public void animalSound(){
        System.out.println("Animal Sound ");
    }
}
 /**
  * Innerclass 
    */
 class Dog extends Animal {
   
     // create second method 
       public void animalSound(){
        System.out.println("bow bow ");
       }
   }
 /**
  * InnerAnimal
  */
 
  class Tiger extends Animal {
    // create third method 
    public void animalSound(){
        System.out.println(" roar roar");
    }

  }


  class Cow extends Animal{
    // create four method 
    public void animalSound(){
        System.out.println(" moo  moo");
    }
  }

  class Main{

    public static void main(String[] args) {
        
        // create object of a class
        Animal obj= new Dog();
        Animal obj2=new Tiger();
        Animal obj3=new Cow();

    }
  }
