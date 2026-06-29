public class MainPolymorphism {
    public static void main(String[] agrs){
        CarPoly car= new CarPoly();
        BicyclePoly bike= new BicyclePoly();
        BoatPoly boat= new BoatPoly();

        VehiclePoly [] racers= {car,bike,boat};

        for (VehiclePoly x : racers){
            x.go();
        }
    }
}
