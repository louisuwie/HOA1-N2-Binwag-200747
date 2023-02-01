import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 @Author Louis G. Binwag III (200747)
 @Date January 31, 2023

 GreatestSum.java is a class that analyses the array passed to it.
 It adds three consecutive indexes of an array, and determines which
 three-consecutive indexes yields the highest sum.

 **/
/*
I have not discussed the Java language code in my program
with anyone other than my instructor or the teaching assistants
assigned to this course.
I have not used Java language code obtained from another student,
or any other unauthorized source, either modified or unmodified.
If any Java language code or documentation used in my program
was obtained from another source, such as a textbook or website,
that has been clearly noted with a proper citation in the comments
of my program.
*/

public class GreatestSum implements Operation{
    @Override
    public void operate(Integer[] a) {
        int newArr[] = new int[a.length-2];

        /**
         * First for-loop adds the three consecutive indexes int he array
         */
        for(int i = 0; i < a.length - 2; i++){
             int x = a[i] + a[i+1] + a[i+2];
             newArr[i] = x;
        }

        /**
         * Second for-loop arranges the new array to its ascending order
         * And the last index is the greatest sum.
         */
        for(int i = 0; i < newArr.length; i++){
            for(int j = i+1; j < newArr.length; j++){

                if(newArr[i] > newArr[j]){

                    Integer x = newArr[i];
                    newArr[i] = newArr[j];
                    newArr[j] = x;

                }
            }
        }

        System.out.println("The greatest sum is: " + newArr[newArr.length-1]);
    }

    @Override
    public String getOperationName() {
        return " Greatest Sum";
    }
}
