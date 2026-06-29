public class CarsToGarage {
    public static void main(String[] args) {
        cars car1 = new cars("BMW");
        cars car2 = new cars("Tesla");
        garage garage = new garage();
        garage.park(car1);
    }
}
