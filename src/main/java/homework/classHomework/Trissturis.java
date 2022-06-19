package homework.classHomework;

public class Trissturis {

    //Mainīgie
    int a;
    int b;
    int c;
    double laukums;
    double p;

    // No ARG konstruktors
    public Trissturis() {
        System.out.println("Mēs veidojam trijstūri");
    }


    //ARG konstruktors
    public Trissturis(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
            }
    public double aprekinatLaukumu(){
        p = (a+b+c)/2;
        laukums = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return laukums;
    }

    // vai trīsstūris ir vienādmalu
    public boolean vaiIrVienadmalu(){
        if ((a==b) && (a==c)){
            return true;
        }
        else {
            return false;
        }
    }

    //vai trīsstūris ir  vienādsānu
    public boolean vaiIrVienadsanu(){
        if ((a==b) || (a==c) || (b==c)){
            return true;
        }
        else {
            return false;
        }
    }
}
