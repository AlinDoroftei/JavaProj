package AnimalRescuer;

public class Veterinary {

//medic veterinar: nume, specializare

        private String name;
        private boolean schoolGraduate;
        private String specialization;


        public void setName(String name){
                this.name = name;
        }
        public String getName(){
                return this.name;
        }

        public void setSchoolGraduate(boolean schoolGraduate){
                this.schoolGraduate=schoolGraduate;
        }
        public boolean getSchoolGraduate(){return schoolGraduate;}

        public void setSpecialization(String specialization){
                this.specialization=specialization;
        }
        public String getSpecialization(){return this.specialization;}
}
