/**
 @Author Louis G. Binwag III (200747)
 @Date January 31, 2023

 Starter.java is the class that instantiates the MenuGen
 and basically runs the program.
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

import java.util.*;

public class Starter {
    public static void main(String[] args) {

        Operation[] opName = {new Uniqueness(), new LargestInteger(), new GreatestSum()};

        MenuGen menuGen = new MenuGen(opName);
        menuGen.run();

    }
}