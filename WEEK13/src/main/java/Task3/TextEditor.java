package Task3;

public class TextEditor {
    private TextFormater formater;

    public void setFormatter(TextFormater formater) {
        this.formater = formater;
    }

    public String formatText(String text){
        return formater.formatText(text);
    }
}
