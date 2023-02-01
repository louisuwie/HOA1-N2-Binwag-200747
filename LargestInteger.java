/**
 @Author Louis G. Binwag III (200747)
 @Date January 31, 2023

 LargestInteger.java is a class that handles the checking of
 what are the highest integer values inside an array. It displays
 the three largest integer while also arranges them in ascending order.

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

import javax.naming.PartialResultException;
import java.util.ArrayList;
public class LargestInteger implements Operation {
    @Override
    public void operate(Integer[] a) {
        /**
         * If else statement that has the following conditions
         * 1st If) If there are no integers given.
         * 2nd If) if there is only one integer.
         * 3rd If) if there is only 2 integer, then sorts which is higher of the two.
         * 4th If) if there are more than 2 integers, then sorts to its ascending order
         *         and takes the last three indexes as the 'largest number'
         */
        if(a.length==0){
            System.out.println("There are no Integers.");
        }
        else if(a.length==1){
            System.out.println("The largest integer is " + a[0]);
        }
        else if(a.length==2){
            if(a[1] < a[0]){
                Integer x = a[1];
                a[1] = a[0];
                a[0] = x;

                System.out.println("The largest integers are " + a[0] + " and " + a[1]);
            }
            else{
                System.out.println("The largest integers are " + a[0] + " and " + a[1]);
            }
        }
        else if(a.length > 2) {

            String arranged = " ";

            for(int i = 0; i < a.length; i++){
                for(int j = i+1; j < a.length; j++){

                    if(a[i] > a[j]){

                        Integer x = a[i];
                        a[i] = a[j];
                        a[j] = x;

                    }
                }
            }

            for(int k = 0; k < a.length; k++){
                arranged += Integer.toString(a[k]);
            }

            System.out.printf("The largest integers are %s \n", arranged);
        }

    }

    @Override
    public String getOperationName() {
        return " Largest Integer";
    }
}
