/**
 @Author Louis G. Binwag III (200747)
 @Date January 31, 2023

 Uniqueness.java is a class that handles the checking
 on the array passed into it, if it is a unique
 array or that its values are repetitive.

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

public class Uniqueness implements Operation{
    @Override
    public void operate(Integer[] a) {

        /**
         * boolean as a condition to hold if the array is unique or not.
         *
         * for loop checks the values if an index[i] has the same value as any of the
         * indexes inside the array.
         */

        boolean unique = true;
        String uniqueTrue = "All elements are unique.";
        String uniqueFalse = "NOT all elements are unique.";

        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[i]==a[j]){
                    unique = false;
                }
            }
        }
        if(unique == true){
            System.out.println(uniqueTrue);
        }
        else{
            System.out.println(uniqueFalse);
        }
    }

    @Override
    public String getOperationName() {
        return " Uniqueness";
    }
}
