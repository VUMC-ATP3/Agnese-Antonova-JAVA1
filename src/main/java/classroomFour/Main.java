package classroomFour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      Automasina auto = new Automasina();
      auto.marka = "BMW";
      auto.gads = 2015;
      auto.dzinejs = "Dīzelis";
      auto.krasa = "Sudraba";
      auto.vaiIrAutomats = true;
      auto.printAutomasina();


      House majaViens = new House(5,true,false, "zaļa", "Brīvības iela", 20);

      majaViens.stavuSkaits = 4;
      majaViens.majasNumurs = 33;
      majaViens.ielasNosaukums = "Brīvības iela";
      majaViens.irLifts = false;
      majaViens.irAutoStavvieta = true;
      majaViens.krasa = "Zaļā";
      majaViens.printHouse();

      House majaDivi = new House(5,false, true, "Zila", "Stabu", 5);

      majaDivi.stavuSkaits = 2;
      majaDivi.majasNumurs = 7;
      majaDivi.ielasNosaukums = "Vienības gatve";
      majaDivi.irLifts = false;
      majaDivi.irAutoStavvieta = false;
      majaDivi.krasa = "Oranža";
      majaDivi.printHouse();

      Velosipeds zzk = new Velosipeds();
      zzk.bremzuTips = 'D';
      zzk.printetAtrumu();
      System.out.println("Cilveks uzkapj uz velosipeda un min pedalus");
      zzk.spiestPedalus();
      zzk.spiestPedalus();
      zzk.spiestPedalus();
      zzk.spiestPedalus();
      zzk.printetAtrumu();
      System.out.println("Priekšā izlec kaķus. vajag bremzēt");
      zzk.bremzet();
      zzk.bremzet();
      zzk.printetAtrumu();

      Velosipeds merida = new Velosipeds();
      merida.printetAtrumu();
      merida.bremzuTips = 'V';
      Velosipeds vecsVelosipeds = new Velosipeds();


      Rinkis mansRinkis = new Rinkis();
      Rinkis mansRinkis2 = new Rinkis();
      mansRinkis.radiuss = 5;
      mansRinkis2.radiuss = 50;
      System.out.println(mansRinkis.radiuss);
      System.out.println(mansRinkis.aprekinatLaukumu());
      System.out.println(mansRinkis.aprekinatRinkaLinijasGarumu());
      mansRinkis.printCreatedTime();
      mansRinkis2.printCreatedTime();

      Rinkis mansRinkis3 = new Rinkis(12);

              Taisnsturis taisnsturisViens = new Taisnsturis(12,20);

          System.out.println("Taisnstura laukums " + taisnsturisViens.aprekinatLaukumu());

      Suns reksis= new Suns();
      reksis.vaiRej = false;
      reksis.name = "Dingo";
      System.out.println(reksis.vaiRej);
      reksis.astesGarums = 10;

      Animal dzivnieks = new Animal();
      dzivnieks.izdodSkanu();
      dzivnieks.name = "Džeks";

      Cat cat = new Cat ();
      cat.name = "Muris";
      cat.printName();
      cat.izdodSkanu();



    }
}
