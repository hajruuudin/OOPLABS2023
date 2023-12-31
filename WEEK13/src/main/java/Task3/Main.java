package Task3;

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();

        textEditor.setFormatter(new UpperCaseFormatter());
        System.out.println("Formatted Text: " + textEditor.formatText("Hello World my name is Hajrudin"));

        textEditor.setFormatter(new LowerCaseFormatter());
        System.out.println("Formatted Text: " + textEditor.formatText("Hello World my name is Hajrudin"));

        textEditor.setFormatter(new CamelCaseFormatter());
        System.out.println("Formatted Text: " + textEditor.formatText("Hello World my name is Hajrudin"));
    }
}
