import org.testng.Assert;
import org.testng.annotations.Test;

public class Praktikum {

    String twoCharInString = "AН";
    String threeCharsInCorrectString = "A Н";
    String fourCharsInCorrectString = "Aр Н";
    String eighteenCharsInCorrectString = "Агата Новосельцева";
    String nineteenCharsInCorrectString = "Амалия Новосельцева";
    String twentyCharsInString = "Наталия Новосельцева";
    String stringWithoutSpace = "АгатаНовосельцева";
    String stringWithTwoSpaceInTheMiddle = "Агата  Новосельцева";
    String stringWithSpaceAtTheBeginning = " АгатНовосельцева";
    String stringWithSpaceAtTheEnd = "АгатаНовосельцева ";

        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */

    @Test
    public void shouldReturnTrueForThreeCharsInCorrectString() {
        checkString(threeCharsInCorrectString, true);
    }

    @Test
    public void shouldReturnTrueForNineteenCharsInCorrectString() {
        checkString(nineteenCharsInCorrectString, true);
    }

    @Test
    public void shouldReturnTrueForFourCharsInCorrectString() {
        checkString(fourCharsInCorrectString, true);
    }

    @Test
    public void shouldReturnTrueForEighteenCharsInCorrectString() {
        checkString(eighteenCharsInCorrectString, true);
    }

    @Test
    public void shouldReturnFalseForTwoCharsString() {
        checkString(twoCharInString, false);
    }

    @Test
    public void shouldReturnFalseForTwentyCharsInString() {
        checkString(twentyCharsInString, false);
    }

    @Test
    public void shouldReturnFalseStringWithoutSpace() {
        checkString(stringWithoutSpace, false);
    }

    @Test
    public void shouldReturnFalseStringWithTwoSpaceInTheMiddle() {
        checkString(stringWithTwoSpaceInTheMiddle, false);
    }

    @Test
    public void shouldReturnFalseStringWithSpaceAtTheBeginning() {
        checkString(stringWithSpaceAtTheBeginning, false);
    }

    @Test
    public void shouldReturnFalseStringWithSpaceAtTheEnd() {
        checkString(stringWithSpaceAtTheEnd, false);
    }

    public void checkString(String checkingString, boolean expectedResult) {
        Account string = new Account(checkingString);
        boolean actual = string.checkNameToEmboss();
        Assert.assertEquals(actual, expectedResult);
    }

}