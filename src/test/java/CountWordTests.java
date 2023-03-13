

import org.junit.Test;

import static org.junit.Assert.*;

public class CountWordTests {


    @Test
    public void testEmptyString() {
        CountWords countWords = new CountWords();
        int result = countWords.count("");
        assertEquals(0, result);
    }

    @Test
    public void testSingleWord() {
        CountWords countWords = new CountWords();
        int result = countWords.count("hello");
        assertEquals(0, result);
    }

    @Test
    public void testMultipleWords() {
        CountWords countWords = new CountWords();
        int result = countWords.count("hello world");
        assertEquals(0, result);
    }

    @Test
    public void testMultipleWordsWithDelimiter() {
        CountWords countWords = new CountWords();
        int result = countWords.count("hello, world");
        assertEquals(0, result);
    }
}

