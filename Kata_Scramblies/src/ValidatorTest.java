import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ValidatorTest {

    @Test
    public void ShouldValdidateWordsCorrectly_ShouldReturnTrue(){
        boolean expected = true;
        boolean actual;
        String givenPoolOfLetters = "azzhmhsijon";
        String givenWord = "jasmin";

        Validator validator = new Validator();
        actual = validator.scramble(givenPoolOfLetters, givenWord);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ShouldValdidateWordsCorrectly_ShouldReturnFalse(){
        boolean expected = false;
        boolean actual;
        String givenPoolOfLetters = "micaelinamin";
        String givenWord = "jasmin";

        Validator validator = new Validator();
        actual = validator.scramble(givenPoolOfLetters, givenWord);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ShouldTreatLowerAndUpperCaseTheSame_ShouldReturnTrue(){
        boolean expected = true;
        boolean actual;
        String givenPoolOfLetters = "JaSmIn";
        String givenWord = "jasmin";

        Validator validator = new Validator();
        actual = validator.scramble(givenPoolOfLetters, givenWord);

        Assert.assertEquals(expected, actual);
    }
}