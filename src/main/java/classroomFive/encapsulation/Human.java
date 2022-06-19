package classroomFive.encapsulation;

public class Human {
    private int age; // vecums
    private double height; // garums
    private String name; // Vārds


    Human(){
        System.out.println("tiek veidots cilvēks");

    }

    public Human(int age, double height, String name) {
        this.age = age;
        this.height = height;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age<0) {
            System.out.println("vecums nedrīkst būt mazāk par 0");
        } else {
            this.age = age;
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }


    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
