package scalaVsJava.recursiveVsLoop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by twer on 5/16/15.
 */
public class Loop {
    private class FileNameLocator {
        public int firstScalaFileIndex(String[] strings) {
            String string;
            for (int i = 0; i < strings.length; i++) {
                string = strings[i];
                if (string.startsWith("-")) continue;
                if (string.endsWith(".scala")) return i;
            }
            return -1;
        }
    }

    @Test
    public void in_java_loop_is_over_recursive() {
        FileNameLocator fileNameLocator = new FileNameLocator();
        assertEquals(1, fileNameLocator.firstScalaFileIndex(new String[]{"-xvz", "helloWorld.scala"}));
    }
}
