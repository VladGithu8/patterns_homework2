package builder;

public class MainBuilder {
    public static void main(String[] args) {

        HealthCare healthCare = new HealthCare
                .BuilderHealthCare(true, "Sem Gilbert")
                .setTreatment("surgery on the right kidney")
                .build();
        System.out.println(healthCare.toString());

    }
}


