public class Car {
    
    private String brand;
    private int year;

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    
    public String getBrand() {
        return brand;
    }

    
    public void setYear(int year) {
        this.year = year;
    }

   
    public int getYear() {
        return year;
    }

    
    public static void main(String[] args) {
        Car car = new Car();

        
        car.setBrand("Toyota");
        car.setYear(2020);

        
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
    }
}
