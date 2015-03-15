package nyc.c4q.AnthonyFermin;

/**
 * Created by c4q-anthonyf on 3/12/15.
 */
public class Rocket {

    public static void drawRocket(int size){
        drawRocketTopBottom(size);
        drawRocketDivider(size);
        drawRocketUpwardTriangles(size);
        drawRocketDownwardTriangles(size);
        drawRocketDivider(size);
        drawRocketDownwardTriangles(size);
        drawRocketUpwardTriangles(size);
        drawRocketDivider(size);
        drawRocketTopBottom(size);
    }

    public static void printConeSpaces(int num){

        for(int i = num; i > 0; i--){
            System.out.print(" ");
        }

    }

    public static void drawRocketTopBottom(int size){
        int numOfRows = ((size - 1) * 2) + 1; //number of rows in the cone piece of the rocket

        for(int i = 0; i < numOfRows; i++){
            printConeSpaces(numOfRows - i);
            for(int j = 0; j <= i; j++) {
                System.out.print("/");
            }

            System.out.print("**");

            for(int j = 0; j <= i; j++) {
                System.out.print("\\");
            }
            System.out.println(); //finishes line after its done
        }
    }

    public static void drawRocketDivider(int size){
        System.out.print("+");

        for(int i = 0; i < size; i++){
            System.out.print("*=*=");
        }

        System.out.println("+");

    }

    public static void drawRocketUpwardTriangles(int size){

        //this loop creates body segment with triangle peaks oriented upward
        for(int i = 0; i < size;i++){
            System.out.print("|");

            for(int j = 0; j < size - 1 - i; j++){
                System.out.print(".");
            }

            for(int j = 0; j <= i; j++){
                System.out.print("/\\");
            }

            for(int j = 0; j < size - 1 - i; j++){
                System.out.print(".");
            }

            for(int j = 0; j < size - 1 - i; j++){
                System.out.print(".");
            }

            for(int j = 0; j <= i; j++){
                System.out.print("/\\");
            }

            for(int j = 0; j < size - 1 - i; j++){
                System.out.print(".");
            }
            System.out.println("|");
        }

    }
    public static void drawRocketDownwardTriangles(int size){
        //this loop creates body segment with triangle peaks oriented downward
        for(int i = 0; i < size; i++){
            System.out.print("|");

            for(int j = 0; j < i; j++){
                System.out.print(".");
            }

            for(int j = size; j > i; j-- ){
                System.out.print("\\/");
            }

            for(int j = 0; j < i; j++){
                System.out.print(".");

            }

            for(int j = 0; j < i; j++){
                System.out.print(".");

            }

            for(int j = size; j > i; j-- ){
                System.out.print("\\/");
            }

            for(int j = 0; j < i; j++){
                System.out.print(".");
            }

            System.out.println("|");
        }
    }

    public static void main(String[] args){

        drawRocket(10);

    }

}
