public class Driveway {
    private DrivewayNode entrance;

    Driveway(){
        entrance = null;
    }

    public void addCar(Car c){
        if(entrance == null){
            entrance = new DrivewayNode(c);
        }else{
            DrivewayNode temp = entrance;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new DrivewayNode(c);
            temp.next.next = null;
        }
    }

    public Car removeCar()throws Exception{
        //if there is no cars to begin with than throw an exception.
        if(entrance == null) throw new Exception("Empty Driveway");
        //if there is only one car, then save that car and remove it. (return the saved car)
        else if(entrance.next == null){
            Car c = entrance.getCar();
            entrance = null;
            return c;
        }
        //otherwise, find the last car and save it then remove it.(return the saved car.)
        else{
            DrivewayNode temp = entrance;
            while (temp.next.next != null){
                temp = temp.next;
            }
            Car c = temp.next.getCar();
            temp.next = null;
            return c;
        }
    }

}
