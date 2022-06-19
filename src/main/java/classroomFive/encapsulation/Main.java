package classroomFive.encapsulation;

public class Main {
    public static void main(String[] args) {
        Weather weather = new Weather();
        weather.printWheater();
       // weather.metodeDivi();//  nevar izsaukt, jo metode ir private


        Human cilveks = new Human();
        Human cilveks2 = new Human();
        Human cilveks3 = new Human(12, 154.5, "Agnese");


        System.out.println(cilveks3.toString());

        cilveks3.setAge(-3);

        System.out.println(cilveks3.toString());
        cilveks3.setAge(18);
        System.out.println(cilveks3.toString());
        System.out.println(cilveks3.getAge());

        System.out.println(cilveks3.getName());

        Rinkis rinkis = new Rinkis();
        rinkis.setRadiuss(5.0);

        Rinkis rinkis2 = new Rinkis(1.0, "Dzeltena");
        rinkis2.setKrasa("Green");






    }
}
