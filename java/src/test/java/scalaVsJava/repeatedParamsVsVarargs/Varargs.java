package scalaVsJava.repeatedParamsVsVarargs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by twer on 5/14/15.
 */
public class Varargs {
    private String echo(String... words) {
        StringBuilder builder = new StringBuilder("");
        for (String word : words) {
            builder.append(word.toUpperCase() + " ");
        }
        return builder.toString().trim();
    }

    @Test
    public void the_varargs_parameter_is_always_interpreted_as_an_array_of_the_type() {
        String howAboutJava = echo("Java", "really", "rocks");
        assertEquals("JAVA REALLY ROCKS", howAboutJava);
    }

}
