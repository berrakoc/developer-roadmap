public class swapTwoVariables {
    public static void main(String[] args){
        String x="water";
        String y="Kool-Aid";
        String temp; //empty variable
        temp = x;
        x=y;
        y=temp;

        System.out.println("x: "+ x);
        System.out.println("y: "+ y);
    }
}
