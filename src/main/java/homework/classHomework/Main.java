package homework.classHomework;

public class Main {
    public static void main(String[] args) {
        Trissturis trissturisViens = new Trissturis();
        trissturisViens.a = 10;
        trissturisViens.b = 10;
        trissturisViens.c = 15;
        System.out.println("Trīsstūra viens laukums ir " + trissturisViens.aprekinatLaukumu());
        System.out.println("Vai trīsstūris ir vienādmalu: " + trissturisViens.vaiIrVienadmalu());
        System.out.println("Vai trīsstūris ir vienādsānu: " + trissturisViens.vaiIrVienadsanu());

        Trissturis trissturisDivi = new Trissturis(10,15,8);
        System.out.println("Trīsstūra divi laukums ir " + trissturisDivi.aprekinatLaukumu());
        System.out.println("Vai trīsstūris ir vienādmalu: " + trissturisDivi.vaiIrVienadmalu());
        System.out.println("Vai trīsstūris ir vienādsānu: " + trissturisDivi.vaiIrVienadsanu());


    }
}
