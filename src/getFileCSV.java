import java.io.*;
import java.util.*;

public class getFileCSV {
    
    public static void main(String[] args) {

        //Reader reader = Files.newBufferedReader(Paths.get(""));

        try {
            File csvFile = new File("dao/DATASET.csv");
            Scanner reader = new Scanner(csvFile);
            List<peopleData> p = new ArrayList<peopleData>(); 
            int i = 0;
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
                
                
                System.out.println(i + "º - " + firstName.toUpperCase() + " " + surname.toUpperCase() + "  " + String.format("%.2f", imc) + " (" +  message + ")");
                System.out.printf("\n\n");

                try {
                    FileWriter fileWriter = new FileWriter("JEFERSONLUCASTAVARESQUEIROZDASILVA.txt", true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    bufferedWriter.write(i + " - " + firstName.toUpperCase() + " " + surname.toUpperCase() + "  " + String.format("%.2f", imc) + " (" +  message + ")\n\n");
                    bufferedWriter.close();
                } catch(IOException ex) {
                    System.out.println("Erro ao escrever'" + ex.getMessage() + "'");
                }
                
                i++;
            }
            reader.close();

         } catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir o arquivo.");
            e.printStackTrace();
        }

    }

}        
