import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GenerateRangeTest {
    @Test
    @DisplayName("Test input [1,5] start must be [ (include symbol)")
    public void startWithIncludeSymbol() {
        GenerateRange generateRange = new GenerateRange("[1,5]");
        boolean validateResult = generateRange.isStartWithInclude();
        assertTrue(validateResult);
    }
}