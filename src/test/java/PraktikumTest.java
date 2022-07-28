import io.qameta.allure.junit4.DisplayName;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PraktikumTest {

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
    String emptyString = "";

        /*
             В этом методе заложи логику работы с классом Account.
             Нужно создать экземпляр класса Account: в качестве аргумента передать тестируемое имя
             и вызвать метод, который проверяет, можно ли использовать фамилию и имя для печати на банковской карте.
         */

    @Test
    @DisplayName("Return TRUE for three chars in correct string")
    public void shouldReturnTrueForThreeCharsInCorrectString() {
        checkString(threeCharsInCorrectString, true);
    }

    @Test
    @DisplayName("Return TRUE for nineteen chars in correct string")
    public void shouldReturnTrueForNineteenCharsInCorrectString() {
        checkString(nineteenCharsInCorrectString, true);
    }

    @Test
    @DisplayName("Return TRUE for four chars in correct string")
    public void shouldReturnTrueForFourCharsInCorrectString() {
        checkString(fourCharsInCorrectString, true);
    }

    @Test
    @DisplayName("Return TRUE for eighteen chars in correct string")
    public void shouldReturnTrueForEighteenCharsInCorrectString() {
        checkString(eighteenCharsInCorrectString, true);
    }

    @Test
    @DisplayName("Return FALSE for string with two chars")
    public void shouldReturnFalseForTwoCharsString() {
        checkString(twoCharInString, false);
    }

    @Test
    @DisplayName("Return FALSE for string with twenty chars")
    public void shouldReturnFalseForTwentyCharsInString() {
        checkString(twentyCharsInString, false);
    }

    @Test
    @DisplayName("Return FALSE for string without space")
    public void shouldReturnFalseStringWithoutSpace() {
        checkString(stringWithoutSpace, false);
    }

    @Test
    @DisplayName("Return FALSE for string with two spaces")
    public void shouldReturnFalseStringWithTwoSpaceInTheMiddle() {
        checkString(stringWithTwoSpaceInTheMiddle, false);
    }

    @Test
    @DisplayName("Return FALSE for string with space at the beginning")
    public void shouldReturnFalseStringWithSpaceAtTheBeginning() {
        checkString(stringWithSpaceAtTheBeginning, false);
    }

    @Test
    @DisplayName("Return FALSE for string with space at the end")
    public void shouldReturnFalseStringWithSpaceAtTheEnd() {
        checkString(stringWithSpaceAtTheEnd, false);
    }

    @Test
    @DisplayName("Return FALSE for empty string")
    public void shouldReturnFalseForEmptyString() {
        checkString(emptyString, false);
    }

    public void checkString(String checkingString, boolean expectedResult) {
        Account string = new Account(checkingString);
        boolean actual = string.checkNameToEmboss();
        Assert.assertEquals(actual, expectedResult);
    }

}