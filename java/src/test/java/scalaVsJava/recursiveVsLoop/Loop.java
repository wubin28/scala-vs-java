package scalaVsJava.recursiveVsLoop;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by twer on 5/16/15.
 */
public class Loop {
    private class FileNameLocator {
        private final String[] strings;

        public FileNameLocator(String[] strings) {
            this.strings = strings;
        }

        public int firstScalaFileIndex() {
            return searchFrom(0);
        }

        private int searchFrom(int index) {
            if (index >= strings.length) return -1;
            if (strings[index].startsWith("-")) searchFrom(index + 1);
            if (strings[index].endsWith(".scala")) return index;
            return searchFrom(index + 1);
        }
    }

    @Test
    public void in_java_loop_is_more_popular_than_recursive() {
        FileNameLocator fileNameLocator = new FileNameLocator(new String[]{"-xvz", "helloWorld.scala"});
        assertEquals(1, fileNameLocator.firstScalaFileIndex());
    }
}
