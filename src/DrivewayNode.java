public class DrivewayNode {
    private Car car;
    public DrivewayNode next;

    //we really shouldn't use this.
    DrivewayNode(){
        next = null;
    }

    //This method will add a car to the node and then make the next "node" point to null by default.
    DrivewayNode(Car car){
        this.car = car;
        next = null;
    }

    //returns the car.
    public Car getCar() {
        return car;
    }

}
