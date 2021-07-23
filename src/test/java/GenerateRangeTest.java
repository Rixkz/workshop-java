import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenerateRangeTest {
    @Test
    @DisplayName("Test input [1,5] start symbol be [ (include symbol)")
    public void startWithIncludeSymbol() {
        GenerateRange generateRange = new GenerateRange("[1,5]");
        boolean validateResult = generateRange.isStartWithInclude();
        assertTrue(validateResult);
    }
    @Test
    @DisplayName("Test input (1,5] start symbol be ( (exclude symbol)")
    public void startWithExcludeSymbol() {
        GenerateRange generateRange = new GenerateRange("(1,5]");
        boolean validateResult = generateRange.isStartWithInclude();
        assertFalse(validateResult);
    }
    @Test
    @DisplayName("Test input [1,5] result must be 1")
    public void startWithNumberInclude() {
        GenerateRange generateRange = new GenerateRange("[1,5]");
        int validateResult = generateRange.getStartNumber();
        assertEquals(1, validateResult);
    }
    @Test
    @DisplayName("Test input (1,5] result must be 2")
    public void startWithNumberExclude() {
        GenerateRange generateRange = new GenerateRange("(1,5]");
        int validateResult = generateRange.getStartNumber();
        assertEquals(2, validateResult);
    }
    @Test
    @DisplayName("Test input [1,5] result must be 5")
    public void endWithNumberInclude() {
        GenerateRange generateRange = new GenerateRange("(1,5]");
        int validateResult = generateRange.getEndNumber();
        assertEquals(5, validateResult);
    }

    @Test
    @DisplayName("Test input [1,5) result must be 4")
    public void endWithNumberExclude() {
        GenerateRange generateRange = new GenerateRange("[1,5)");
        int validateResult = generateRange.getEndNumber();
        assertEquals(4, validateResult);
    }
}