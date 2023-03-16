public class peopleData {
    
        private String firstName;
        private String surname;
        private Float weight;
        private Float height;  
        
        public peopleData(String firstName, String surname, Float weight, Float height) {
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

        public Float getWeight() {
            return weight;
        }

        public Float getHeight() {
            return height;
        }
    
        
        
}
