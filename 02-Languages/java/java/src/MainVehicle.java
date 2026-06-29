public class MainVehicle {
    public static void main(String []args){
        Araba araba= new Araba();
        Bicycle bike= new Bicycle();
        System.out.println(araba.speed); //0.0
        bike.go(); //This vehicle is moving
        System.out.println(araba.wheels);
        System.out.println(bike.wheels);
    }
}
