package scalaVsJava.whatVsHow;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by twer on 5/16/15.
 */
public class Exist {
    private class StringChecker {
        private String string;

        public StringChecker(String string) {
            this.string = string;
        }

        public boolean existsUpperCase() {
            for (Character c : this.string.toCharArray()) {
                if (Character.isUpperCase(c)) return true;
            }
            return false;
        }
    }

    @Test
    public void if_a_string_exist_an_upper_case_character() {
        StringChecker name = new StringChecker("Ben Wu");
        assertTrue(name.existsUpperCase());
    }
}
