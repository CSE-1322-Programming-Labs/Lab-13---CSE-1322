public class Car {
    private String make;
    private String model;
    private String color;
    private String licencePlate;

    public Car(String make,String model,String color,String licencePlate){
        this.make = make;
        this.model = model;
        this.color = color;
        this.licencePlate = licencePlate;
    }

    //prints the car to string.
    @Override
    public String toString(){
        return "I'm a "+color+" "+make+" "+model;
    }
}
