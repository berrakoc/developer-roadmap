public class Mainccar {
    public static void main(String[] agrs){
        ccar car= new ccar("a","b",2003);
        System.out.println(car.getMake());
        System.out.println(car.getYear());
        car.setYear(2000);
        System.out.println(car.getYear());
    }
}
