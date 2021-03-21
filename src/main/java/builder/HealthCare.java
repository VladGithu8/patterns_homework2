package builder;

public class HealthCare {

    private boolean plannedPatient;
    private String patientNameSurname;
    private int age;
    private String treatment;

    public HealthCare(BuilderHealthCare builderHealthCare) {
        this.patientNameSurname = builderHealthCare.patientNameSurname;
        this.plannedPatient = builderHealthCare.plannedPatient;
        this.age = builderHealthCare.age;
        this.treatment = builderHealthCare.treatment;
    }

    public static class BuilderHealthCare {

        public HealthCare build() {
            return new HealthCare(this);
        }

        protected boolean plannedPatient;
        protected String patientNameSurname;
        protected int age;
        protected String treatment;

        public BuilderHealthCare(boolean plannedPatient, String patientNameSurname) {
            this.plannedPatient = plannedPatient;
            this.patientNameSurname = patientNameSurname;
        }

        public BuilderHealthCare setAge(int age) {
            this.age = age;
            return this;
        }

        public BuilderHealthCare setTreatment(String treatment) {
            this.treatment = treatment;
            return this;
        }
    }

    @Override
    public String toString() {
        return "----------Health Care----------" +
                "\nPatient: " + patientNameSurname +
                "\nPlanned: " + plannedPatient +
                "\n" + patientNameSurname + " age: " + age +
                "\nTreatment need to do: " + treatment;

    }
}
