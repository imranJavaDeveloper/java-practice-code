

public interface Language {

    public  void greeting();
}

class Hindi implements Language {

    public   void greeting(){
        System.out.println("Namaste  Uncle jee");
    }
}

class   English implements Language{

    public  void greeting(){
        System.out.println("Good Morning Uncle jee");
    }
}

class Main{

    public static void main(String[] args) {

       Language obj= new English();
       obj.greeting();
       obj=new Hindi();
       obj.greeting();
    }
}
