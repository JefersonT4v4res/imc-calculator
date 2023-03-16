import java.io.*;
import java.util.*;

public class getFileCSV {
    
    public static void main(String[] args) {

        //Reader reader = Files.newBufferedReader(Paths.get(""));

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
                float imc = (weight / (height*height));
                String message;
                
                if(imc < 18.5) {
                    message = "Abaixo do peso ideal";
                }else if(imc >= 18.5 && imc <= 24.9){
                    message = "No peso ideal";
                }else if(imc >= 25 && imc <= 29.9){
                    message = "Acima do peso ideal";
                }else if(imc >= 30 && imc <= 34.9){
                    message = "Obesidade I";
                }else if(imc >= 35 && imc <= 39.9){
                    message = "Obesidade II";
                }else {
                    message = "Obesidade III";
                }

               peopleData person = new peopleData(firstName, surname, weight, height, imc, message);
               p.add(person);
            }
            reader.close();

            System.out.println(p.size());

            for (int i = 0; i < p.size(); i++) {
                System.out.println("Nome: " + ((peopleData) p).getFirstName() + " " + ((peopleData) p).getSurname());
                System.out.println("Peso: " + ((peopleData) p).getWeight());
                System.out.println("Altura: " + ((peopleData) p).getHeight());
                System.out.println("IMC: " + ((peopleData) p).getImc() + " (" +  ((peopleData) p).getmessage() + ")");
                System.out.println();
            }

         } catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir o arquivo.");
            e.printStackTrace();
        }

    }

}               
