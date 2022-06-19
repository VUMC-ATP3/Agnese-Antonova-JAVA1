package classroomFive.polymorphism;

public class Calculator {
    public int sum(int a, int b) {
        System.out.println("saskaitam veselus skaitļus");
        return a +b;
    }

    public double sum (double a, double b) {
        System.out.println("saskaitam daiļskaitļus");
        return a +b;
    }
    public int sum(int a, int b, int c) {
        System.out.println("saskaitam tris skaitļus");
        return a + b + c;
    }


}
