package nyc.c4q.AnthonyFermin;

/** Anthony Fermin
 *  learning how to use Methods
 * Created by c4q-anthonyf on 3/12/15.
 */
public class Methods {

    public static int add(int a, int b){
        int result = a + b;
        return result;
    }

    public static int sub(int a, int b){
        int result = a - b;
        return result;
    }

    public static int getNumber() {
        return 3;
    }

    public static String getGreeting(){
        return "Ohayo";
    }

    public static void speak(){
        System.out.println("Hi, there.");
    }

    public static void shoutOut(String name, int age){
        System.out.println("Hey " + name + ", you are " + age + " years old.");
    }

    public static void main (String[] args){
        int num = add(1,2);
        int num2 = sub(2,1);
        System.out.println(num);
        System.out.println(num2);
    }

}
