import java.io.*;
import java.util.*;

public class getFileCSV {
    
    public static void main(String[] args) {

        //Reader reader = Files.newBufferedReader(Paths.get(""));

        try {
            File csvFile = new File("dao/DATASET.csv");
            Scanner reader = new Scanner(csvFile);
            List<peopleData> p = new ArrayList<peopleData>(); 

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] fileDatas = line.split(",");
                System.out.println(fileDatas.length);
                if (fileDatas.length == 4) {
                String firstName = fileDatas[0];
                String surname = fileDatas[1];
                Float weight = Float.parseFloat(fileDatas[2]);
                Float height = Float.parseFloat(fileDatas[3]);
                
                peopleData person = new peopleData(firstName, surname, weight, height);
                p.add(person);
                } else {
                    //System.out.println("Invalid line " + line);
                }
                
            }
            reader.close();

            for (peopleData person : p) {
                System.out.println("Nome: " + ((peopleData) p).getFirstName());
                System.out.println("Sobrenome: " + ((peopleData) p).getSurname());
                System.out.println("Peso: " + ((peopleData) p).getWeight());
                System.out.println("Altura: " + ((peopleData) p).getHeight());
                System.out.println();
             }

         } catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir o arquivo.");
            e.printStackTrace();
        }

    }
    

}       