
/**
 * Created by rachaelmahon on 10/04/2017.
 */

import java.util.List;

public class Run_Exercises {
    public static void main(String[] args) {
        System.out.println("Exercise 1");
        Exercise_1 run_exercise_1 = new Exercise_1();
        run_exercise_1.Run_Exercise_1();

        System.out.println("Exercise 2");
        Draw_a_horizontal_line run_exercise_2 = new Draw_a_horizontal_line();
        run_exercise_2.run_draw_a_horizontal_line_exercise(10);
        System.out.println("");


        System.out.println("Exercise 3");
        Draw_a_vertical_line run_exercise_3 = new Draw_a_vertical_line();
        run_exercise_3.run_draw_a_vertical_line_exercise(8);

        System.out.println("Exercise 4");
        Draw_a_right_hand_triangle right_hand_triangle_exercise = new Draw_a_right_hand_triangle();
        right_hand_triangle_exercise.draw_right_hand_triangle_exercise(4);

//        System.out.println("Exercise 5");
//        Isosceles_triangle isosceles = new Isosceles_triangle();
//        isosceles.draw_right_isosceles_triangle_exercise(5);
//
//        System.out.println("Exercise 6");
//        Diamond diamond = new Diamond();
//        diamond.draw_diamond(7);

//        System.out.println("Exercise 7");
//        Diamond_with_name diamond_with_name = new Diamond_with_name();
//        diamond_with_name.draw_diamond_with_name("Timmy");

        System.out.println("Fizzbuzz Exercise");
        Fizzbuzz run_fizzbuzz = new Fizzbuzz();
        run_fizzbuzz.run_Fizzbuzz(30);

        System.out.println("Prime Factors Exercise");
        Prime_Numbers generator = new Prime_Numbers();
        List factors = generator.generate(30);
        System.out.println(factors);


    }
}
