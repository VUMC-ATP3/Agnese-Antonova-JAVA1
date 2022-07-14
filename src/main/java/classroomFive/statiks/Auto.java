package classroomFive.statiks;

public class Auto {
    public String marka;
    public static String klasesNosaukums = "Autoklase";
    public static int totalCarsCreated = 0;

    Auto(String marka) {
        this.marka = marka;
        totalCarsCreated++;

    }
    public static void printText(){
        System.out.println("Printeju tekstu");
    }

    public static void increaseTotalCarsCreated(){
        totalCarsCreated++;
    }
}
