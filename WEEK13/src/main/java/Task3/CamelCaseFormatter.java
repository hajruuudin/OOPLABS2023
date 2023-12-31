package Task3;

public class CamelCaseFormatter implements TextFormater {
    @Override
    public String formatText(String text) {
        String[] words = text.split(" ");
        StringBuilder camelCaseText = new StringBuilder(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            camelCaseText.append(words[i].substring(0, 1).toUpperCase()).append(words[i].substring(1).toLowerCase());
        }
        return camelCaseText.toString();
    }
}
