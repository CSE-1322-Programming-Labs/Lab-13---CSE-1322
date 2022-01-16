public class Driver {
    public static void main(String[] args) {
        Driveway grandmasDriveWay = new Driveway();
        grandmasDriveWay.addCar(new Car("Ford","F150","Black","ABC123"));
        grandmasDriveWay.addCar(new Car("Nissan","Sentra","Silver","XYZ123"));
        grandmasDriveWay.addCar(new Car("Honda","Civic","Red","DEF890"));

        try{
            System.out.println(grandmasDriveWay.removeCar());
            System.out.println(grandmasDriveWay.removeCar());
            System.out.println(grandmasDriveWay.removeCar());
            System.out.println(grandmasDriveWay.removeCar());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
