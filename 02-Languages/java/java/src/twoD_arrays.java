public class twoD_arrays {
    public static void main(String[]args){
        //yan yana da yazabilirsin 3er 3er
        String[][] cars= new String[3][3];
        cars[0][0]= "Camaro";
        cars[0][1] = "Mustang";
        cars[0][2] = "Challenger";
        cars[1][0] = "Corvette";
        cars[1][1] = "Viper";
        cars[1][2] = "Porsche";
        cars[2][0] = "Ferrari";
        cars[2][1] = "Lamborghini";
        cars[2][2] = "McLaren";

        // Diziyi yazdırma
        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }
    }
}
