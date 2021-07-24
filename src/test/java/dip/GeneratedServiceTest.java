package dip;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GeneratedServiceTest {

    @Test
    @DisplayName("ต้องได้ id=XYZ7")
    public void case01() {
        GeneratedService service = new GeneratedService();
        String id = service.generateId();
        assertEquals("XYZ7", id);
    }

}