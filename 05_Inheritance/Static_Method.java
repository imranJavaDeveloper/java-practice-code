

class Parent{
    public  void show(){
        System.out.println("first method called ");
    }

}
class child extends Parent{
    public void show(){
        System.out.println(" second method called");
    }


}
class UseParent{
    public static void main(String[] args) {
         Parent p=new child();
         p.show();


    }
}