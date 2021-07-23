import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {
    @Test
    @DisplayName("Test calculation numbers")
    public void case01() {
        Calculate calculate = new Calculate();
        int valueA = 1;
        int valueB = 2;
        int calculationResult = calculate.sumNumber(valueA, valueB);
        assertEquals(3, calculationResult);
    }
}