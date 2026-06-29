import java.lang.reflect.Array;
import java.util.*;
public class twoD_ArrayList {
    public static void main(String[]args){
        ArrayList<ArrayList<String>> shoppingList = new ArrayList();

        ArrayList<String> bakeryList = new ArrayList();
        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList= new ArrayList();
        produceList.add("tomatoes");
        produceList.add("salatalık");
        produceList.add("biber");

        ArrayList<String> drinksList= new ArrayList();
        drinksList.add("şalgam");
        drinksList.add("ayran");
        drinksList.add("şerbet");

        shoppingList.add(bakeryList);
        shoppingList.add(produceList);
        shoppingList.add(drinksList);

        System.out.println(shoppingList.get(1).get(2));
    }
}
