package dip;

import java.util.Random;

public class GeneratedService {
    public String generateId() {
        Random random = new Random();
        int number = random.nextInt(10);
        return "XYZ" + number;
    }
}
