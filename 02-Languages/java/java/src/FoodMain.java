public class FoodMain {
    public static void main(String[]args){
        Food[] buzdolabı = new Food[3];
        Food food1 = new Food("pizza");
        Food food2 = new Food("hamburger");
        Food food3 =new Food("hotdog");
        buzdolabı[0]= food1;
        buzdolabı[1]= food2;
        buzdolabı[2]= food3;
        System.out.println(buzdolabı[0]);
        System.out.println(buzdolabı[0].name);
        System.out.println(buzdolabı[1].name);
        System.out.println(buzdolabı[2].name);
    }
}
