/**
 * Created by rachaelmahon on 12/04/2017.
 */
import java.util.ArrayList;
import java.util.List;

public class Prime_Numbers {

    List<Integer> generate(int n) {
        List<Integer> factors = new ArrayList<Integer>();
        if (n <= 1) {
            return factors;
        }
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                factors.add(i);
                factors.addAll(generate(n / i));
                break;
            }
        }
        return factors;
    }

}