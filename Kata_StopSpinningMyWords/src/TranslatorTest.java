import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class TranslatorTest {

    @Test
    public void ShouldDetectWordsWithOverFiveLetters(){
        boolean actual;
        String given = "Jasmin";

        Tranlsator tranlsator = new Tranlsator();
        actual = tranlsator.needsToBeSpinned(given);

        Assert.assertTrue(actual);
    }

    @Test
    public void ShouldDetectWordsWithLessThanFiveLetters(){
        boolean actual;
        String given = "Java";

        Tranlsator tranlsator = new Tranlsator();
        actual = tranlsator.needsToBeSpinned(given);

        Assert.assertFalse(actual);
    }

    @Test
    public void ShouldReverseWordsWithOverFiveLetters(){
        String expected = "etueH ist mein retiewz Tag";
        String actual;
        String given = "Heute ist mein zweiter Tag";

        Tranlsator tranlsator = new Tranlsator();
        actual = tranlsator.validateString(given);

        Assert.assertEquals(expected, actual);
    }
}