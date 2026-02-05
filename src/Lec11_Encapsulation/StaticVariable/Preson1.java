
package Lec11_Encapsulation.StaticVariable;

public class Preson1 {

    private String name;
    private static int count = 0;

    public Preson1(String n) {
        name = n;
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Preson1 p1 = new Preson1("Trang");
        Preson1 p2 = new Preson1("Duong");
        Preson1 p3 = new Preson1("Luong");
    }
}
