public class GenerateRange {

    private String input;

    public GenerateRange(String input){
        this.input = input;
    }

    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }

    public int getStartNumber() {
        if (isStartWithInclude()) {
            return this.input.charAt(1) - 48;
        }
        else {
            return this.input.charAt(1) - 47;
        }
    }
}
