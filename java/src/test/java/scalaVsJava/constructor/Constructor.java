package scalaVsJava.constructor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by twer on 5/16/15.
 */
public class Constructor {
    private class FullName {
        private String firstName;
        private String lastName;
        public FullName(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        @Override
        public String toString() {
            return "FullName{" +
                    "firstName='" + firstName + '\'' +
                    ", lastName='" + lastName + '\'' +
                    '}';
        }
    }

    @Test
    public void javas_constructor_is_very_verbose() {
        FullName fullName = new FullName("Ben", "Wu");
        assertEquals("FullName{firstName='Ben', lastName='Wu'}", fullName.toString());
    }

}
