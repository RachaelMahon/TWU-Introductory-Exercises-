
/**
 * Created by rachaelmahon on 10/04/2017.
 */
public class Fizzbuzz {
    public static void run_Fizzbuzz(Integer n){
        while (n > 0) {
            if (n%3==0 && n%5==0) {
                System.out.println("Fizzbuzz");
            }
            else if (n%3==0) {
                System.out.println("Fizz");
            }
            else if (n%5==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(Integer.toString(n));
            }
            n--;
        }

    }
}
