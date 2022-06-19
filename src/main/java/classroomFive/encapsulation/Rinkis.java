package classroomFive.encapsulation;

public class Rinkis {
    private double radiuss;
    private String krasa;

    // No-arg konstuktors
    Rinkis() {
        this.radiuss = 1.0;
        this.krasa = "Sarkana";
    }
    // konstruktos, kur mēs padodam rādiusu un krāsu
    public Rinkis(double radiuss, String krasa) {
        this.radiuss = radiuss;
        this.krasa = krasa;
    }

    // setter un getter
    public double getRadiuss() {
        return radiuss;
    }

    public void setRadiuss(double radiuss) {
        this.radiuss = radiuss;
    }

    public String getKrasa() {
        return krasa;
    }

    public void setKrasa(String krasa) {
        this.krasa = krasa;
    }

    double aprekinatRinkaLaukumu(){
        return Math.pow(radiuss, 2) * Math.PI;
    }
}




