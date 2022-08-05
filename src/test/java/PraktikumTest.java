import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PraktikumTest {
    private final String stringToTest;
    private final boolean expected;

    public PraktikumTest(String stringToTest, boolean expected) {
        this.stringToTest = stringToTest;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "Тестовые данные: {0} {1}")
    public static Object[][] isStringCorrect() {
        return new Object[][] {
                {"A Н", true},
                {"Aр Н", true},
                {"Агата Новосельцева", true},
                {"Амалия Новосельцева", true},
                {"AН", false},
                {"Наталия Новосельцева", false},
                {"АгатаНовосельцева", false},
                {"Агата  Новосельцева", false},
                {" АгатНовосельцева", false},
                {"АгатаНовосельцева ", false},
                {"", false},
                {null, false}
        };
    }

    @Test
    public void shouldBeCorrectString() {
        Account string = new Account(stringToTest);
        boolean actual = string.checkNameToEmboss();
        assertEquals(expected, actual);
    }
}