class Car{
    
    private String color;
    private String model;
    private int year;
    private boolean isRented;
    
    Car(String color, String model, int year, boolean rentalStatus){
        this.color = color;
        this.model = model;
        this.year = year;
        this.isRented = rentalStatus;
        
    }
    
    public void getInfo(){
        
        System.out.println("Car color is " + color);
        System.out.println("Car model is " + model);
        System.out.println("Car manufacturing year is " + year);
        System.out.println("Car Rental Status is " + isRented);
    }
}
public class Main
{
	public static void main(String[] args) {
		Car c1 = new Car("Black", "S7", 2024,true);
		c1.getInfo();
	}
}
