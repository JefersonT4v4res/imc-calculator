import java.io.*;
import java.util.*;

public class getFileCSV {
    
    public static void main(String[] args) {

         try {
            File csvFile = new File("dao/DATASET.csv");
            Scanner reader = new Scanner(csvFile);
            List<peopleData> p = new ArrayList<peopleData>(); 

            // Pula a primeira linha do arquivo para ignorar título planilha
            if(reader.hasNextLine()) {
            reader.nextLine();
            }

            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] fileDatas = line.split(";");
                
                String firstName = fileDatas[0];
                String surname = fileDatas[1];
                float weight = Float.parseFloat(fileDatas[2].replace(",", "."));
                float height = Float.parseFloat(fileDatas[3].replace(",", "."));

                System.out.println("Nome: " + fileDatas[0]);
                System.out.println("Sobrenome: " + fileDatas[1]);
                System.out.println("Peso: " + fileDatas[2]);
                System.out.println("Altura: " + fileDatas[3]);
                System.out.println();

               peopleData person = new peopleData(firstName, surname, weight, height);
               p.add(person);
            }
            reader.close();

            for (int i = 0; i < p.size(); i++) {
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
