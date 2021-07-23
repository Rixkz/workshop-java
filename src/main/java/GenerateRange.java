public class GenerateRange {

    private String input;

    public GenerateRange(String input){
        this.input = input;
    }
    public boolean isStartWithInclude() {
        return this.input.startsWith("[");
    }

    public boolean isStartWithExclude() {
        return this.input.startsWith("(");
    }
}
