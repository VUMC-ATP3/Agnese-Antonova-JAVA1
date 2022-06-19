package classroomFour;

import java.sql.Timestamp;

public class Rinkis {
    double radiuss;
    double laukums;
    double rinkaLinijasGarums;
    Timestamp timestamp;

    Rinkis() {
        System.out.println("Mēs veidojam Riņķi.. ");
        Long datetime = System.currentTimeMillis();
        timestamp = new Timestamp(datetime);


    }

    Rinkis(double padotaisRadiuss) {
        radiuss = padotaisRadiuss;
    }
    public void printCreatedTime() {
        System.out.println(timestamp);
    }

    public double aprekinatLaukumu() {
        System.out.println("Aprelinu rinka laukumu");
        return Math.pow(radiuss, 2) * Math.PI;
    }

    public double aprekinatRinkaLinijasGarumu() {
        System.out.println("Aprelinu rinka līnijas garumu");
        return 2* Math.PI * radiuss;
    }
}
