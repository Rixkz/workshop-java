public class GenerateRange {

    private String input;

    public GenerateRange(String input){
        this.input = input;
    }
    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }
}
