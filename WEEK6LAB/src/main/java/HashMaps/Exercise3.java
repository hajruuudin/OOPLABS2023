package HashMaps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args){
        Dictionary dictionary = new Dictionary();
        Scanner reader = new Scanner(System.in);

        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
    }

    static class Dictionary{
        private HashMap<String, String> dictionary;

        public Dictionary() {
            this.dictionary = new HashMap<String, String>();
        }

        public String translate(String word){
            if(this.dictionary.get(word) == null){
                return null;
            } else {
                return this.dictionary.get(word);
            }
        }

        public void add(String word, String translation){
            this.dictionary.put(word, translation);
        }

        public int amountOfWords(){
            return this.dictionary.size();
        }

        public ArrayList<String> translationList(){
            ArrayList<String> translations = new ArrayList<String>();

            for(String key : this.dictionary.keySet()){
                String item = key + " = " + this.dictionary.get(key);
                translations.add(item);
            }

            return translations;
        }
    }

    static class TextUserInterface{
        private Scanner reader;
        private Dictionary dictionary;

        public TextUserInterface(Scanner reader, Dictionary dictionary){
            this.reader = reader;
            this.dictionary = dictionary;
        }

        public void start(){
            String userinput = "";

            System.out.println("Statement");
            System.out.println("add - adds a word pair to the dictionary");
            System.out.println("translate - prints translation of the word");
            System.out.println("quit - exits the programme");

            while (!userinput.equals("quit")){

                System.out.print("Statement: ");
                userinput = this.reader.next();

                if(userinput.equals("add")){

                    System.out.print("In Finnish: ");
                    String wordFin = this.reader.next();

                    System.out.print("Translation: ");
                    String transWord = this.reader.next();

                    this.dictionary.add(wordFin, transWord);

                } else if (userinput.equals("translate")){

                    System.out.print("Give a word: ");
                    String searchword = this.reader.next();

                    System.out.print("Translation: " + this.dictionary.translate(searchword));
                    System.out.println();
                } else if(userinput.equals("quit")){
                    System.out.println("Cheers!");
                    break;
                } else {
                    System.out.println("Incorrect input. Try again");
                }
            }
        }
    }
}
