package Task3;

public class UpperCaseFormatter implements  TextFormater{
    @Override
    public String formatText(String text) {
        return text.toUpperCase();
    }
}
