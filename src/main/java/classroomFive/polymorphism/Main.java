package classroomFive.polymorphism;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println(calc.sum(4,5));
        System.out.println(calc.sum(4.3,5.5));
        System.out.println(calc.sum(1,3,4));
        System.out.println(calc.sum(4, 4,3,2.0));


    Car car = new Car();
    car.move();
    Motocycle motocycle = new Motocycle();

    motocycle.move();
    car.stop();
    motocycle.stop();


}
}