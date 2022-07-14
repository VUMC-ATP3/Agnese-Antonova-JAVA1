package classroomFive.statiks;

public class Main {
    public static void main(String[] args) {
        System.out.println(Auto.klasesNosaukums);
        System.out.println("Cik auto objekti ir uztaisiti" + Auto.totalCarsCreated);
        Auto masina = new Auto("BMW");
        System.out.println(masina.klasesNosaukums);
        masina.klasesNosaukums = "Autoklase_changed";
        System.out.println(masina.marka);

        Auto masinaDivi = new Auto ("Mercedes");
        masinaDivi.marka = "Mercedes";
        System.out.println(masinaDivi.klasesNosaukums);

        Auto masina3 = new Auto ("Opels");
        Auto masina5 = new Auto ("WV");
        System.out.println("Cik auto objekti ir uztaisiti" + Auto.totalCarsCreated);
        Auto.printText();
        Auto.increaseTotalCarsCreated();
    }
}
