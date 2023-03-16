public class peopleData {
    
        private String firstName;
        private String surname;
        private float weight;
        private float height;  
        
        public peopleData(String firstName, String  surname, float weight, float height) {
            this.firstName = firstName;
            this.surname = surname;
            this.weight = weight;
            this.height = height;
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
    
        
        
}
