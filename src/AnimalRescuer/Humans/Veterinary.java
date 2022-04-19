package AnimalRescuer.Humans;

public class Veterinary extends Human{

//medic veterinar: nume, specializare

        private String name;
        private boolean schoolGraduate;
        private String specialization;

        @Override
        public String getName() {
                return name;
        }

        @Override
        public void setName(String name) {
                this.name = name;
        }

        public boolean isSchoolGraduate() {
                return schoolGraduate;
        }

        public void setSchoolGraduate(boolean schoolGraduate) {
                this.schoolGraduate = schoolGraduate;
        }

        public String getSpecialization() {
                return specialization;
        }

        public void setSpecialization(String specialization) {
                this.specialization = specialization;
        }
}
