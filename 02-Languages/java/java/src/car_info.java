public class car_info {
    public static void main(String []args){
        car myCar = new car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);
        myCar.drive();
        myCar.brake();

    }
}
