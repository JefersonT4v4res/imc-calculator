public class peopleData {
    
        private String firstName;
        private String surname;
        private float weight;
        private float height;  
        private float imc;
        private String message;
        
        public peopleData(String firstName, String  surname, float weight, float height, float imc, String message) {
            this.firstName = firstName;
            this.surname = surname;
            this.weight = weight;
            this.height = height;
            this.imc = imc;
            this.message = message;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSurname() {
            return surname;
        }

        public float getWeight() {
            return weight;
        }

        public float getHeight() {
            return height;
        }

        public float getImc() {
            return imc;
        }

        public String getmessage() {
            return message;
        }
   
}
