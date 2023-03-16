import java.io.*;
import java.util.*;

public class getFileCSV {
    
    public static void main(String[] args) {

        //Reader reader = Files.newBufferedReader(Paths.get(""));

        try {
            File csvFile = new File("dao/DATASET.csv");
            Scanner reader = new Scanner(csvFile);

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] fileDatas = line.split(",");
            
                for (String data : fileDatas) {
                   System.out.print(data + " ");
                }
                System.out.println();
            }
            reader.close();

         } catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir o arquivo.");
            e.printStackTrace();
        }

    }
    

}       