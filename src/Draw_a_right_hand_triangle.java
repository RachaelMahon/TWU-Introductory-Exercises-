/**
 * Created by rachaelmahon on 10/04/2017.
 */

public class Draw_a_right_hand_triangle {
    public static void draw_right_hand_triangle_exercise(Integer n) {

        for (int i = 0; i < n; i ++) {
            for (int j = 0; j <= i; j ++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
