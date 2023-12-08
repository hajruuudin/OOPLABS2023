package Task3;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        String filename = "tekst.txt";
        generateEventsFile(filename);
        readEventFiles(filename);
    }

    public static void generateEventsFile(String filename) throws IOException {
        if (!filename.contains(".txt")) {
            filename += ".txt";
        }

        String[] events = {"LOGING", "LOGOUT", "PURCHASE", "VIEWPAGE", "ERROR"};

        int numOfRecords = 10; //Used 10 to test the programme
        int currentRecord = 1;

        try (BufferedWriter buffWriter = new BufferedWriter(new FileWriter(filename))) {
            Random random = new Random();

            while (currentRecord <= numOfRecords) {
                long timestamp = System.currentTimeMillis();
                String event = events[random.nextInt(5)];
                int userId = random.nextInt(1000);

                buffWriter.write(timestamp + " " + event + " " + userId + "\n");
                currentRecord += 1;
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void readEventFiles(String filename) throws IOException {
        try(BufferedReader buffRead = new BufferedReader(new FileReader(filename))){
            String thisLine;
            for(int i = 0; i < 5; i++){
                System.out.println("Iteration: " + (i+1) + ":");
                while((thisLine = buffRead.readLine()) != null){
                    System.out.println(thisLine);
                }
                buffRead.reset();
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
