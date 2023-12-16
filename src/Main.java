
public class Main {
    public static void main(String[] args) {
        Transport car = new Car("car1",4);
        Transport car2 = new Car("car2",4);
        car2.checkTrailer();


        Transport truck = new Truck("truck1",6);
        Transport truck2 = new Truck("truck2",8);


        Transport bicycle = new Bicycle("bicycle1",2);
        Transport bicycle2 = new Bicycle("bicycle2",2);

        Transport tank=new Tank("t-34",0);


        ServiceStation station = new ServiceStation();
        station.check(car);
        System.out.println();
        station.check(bicycle2);
        System.out.println();
        station.check(null);
        System.out.println();
        station.check(tank);

    }
}