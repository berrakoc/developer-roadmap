public class printf {
    public static void main(String []args){
        //System.out.printf("mesela %d yani bişiler bişiler",123);

        boolean myBoolean= true;
        char myChar= '@' ;
        String myString= "berra";
        int myInt = 50;
        double myDouble= 1000;

        //System.out.printf("%b", myBoolean);
        //System.out.printf("%c", myChar);
        //System.out.printf("%s", myString);
        //System.out.printf("%d", myInt);
        //System.out.printf("%f", myDouble); //for floats and doubles

        //System.out.printf("Hello %10s", myString);
        //System.out.printf("Hello %-10s", myString); //it adds space after
        System.out.printf("you have this much money %f", myDouble);
        System.out.println();
        System.out.printf("you have this much money %.2f", myDouble);
        System.out.println();
        System.out.printf("you have this much money %,f", myDouble);
    }
}
