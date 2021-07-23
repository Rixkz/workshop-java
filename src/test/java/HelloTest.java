import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {
    // f(name) = "Hello Adisorn"
    @Test
    @DisplayName("Test display input name")
    public void case01() {
        // Arrange
        Hello hello = new Hello();
        String name = "Adisorn";
        // Act
        String displayResult = hello.greetingName(name);
        // Assert
        assertEquals("Hello Adisorn", displayResult);
    }
}